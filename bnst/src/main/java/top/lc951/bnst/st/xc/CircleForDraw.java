package top.lc951.bnst.st.xc;

import android.opengl.GLES20;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

import top.lc951.bnst.core.MatrixState;

/**
 * Created by lichong on 2017/7/24.
 *
 * @ Email lichongmac@163.com
 */
//用triangle_fan方式绘制圆面 此圆面是平行于XY平面的
public class CircleForDraw {
    int mProgram;//自定义渲染管着色器线程序id
    int muMVPMatrixHandle;//总变换矩阵引用id
    int maPositionHandle; //顶点位置属性引用id
    int maNormalHandle; //顶点法向量属性引用id
    int muMMatrixHandle;//位置、旋转变换矩阵
    int maLightLocationHandle;//光源位置属性引用id
    int maCameraHandle; //摄像机位置属性引用id

    int maColorR;	//颜色值的R分量引用id
    int maColorG;	//颜色值的G分量引用id
    int maColorB;	//颜色值的B分量引用id
    int maColorA;

    String mVertexShader;//顶点着色器
    String mFragmentShader;//片元着色器
    private static FloatBuffer mVertexBuffer;//顶点坐标数据缓冲
    private static FloatBuffer   mNormalBuffer;//顶点法向量数据缓冲
    private static int vCount;

    float r;	//颜色值的R分量
    float g;	//颜色值的G分量
    float b;	//颜色值的B分量
    public CircleForDraw
            (
                    int mProgram,
                    float angleSpan,//切分角度
                    float radius,//圆半径
                    float[]color
            )
    {
        this.r=color[0];
        this.g=color[1];
        this.b=color[2];
        initShader(mProgram);
    }
    public static void initVertexData
            (
                    float angleSpan,//切分角度
                    float radius//圆半径
            )
    {
        //顶点纹理坐标数据的初始化================begin============================
        vCount=1+(int)(360/angleSpan)+1;//顶点的个数

        float[] vertices=new float[vCount*3];//初始化顶点数组
        float[] normals=new float[vCount*3];//初始化顶点法向量数组

        //存放中心点坐标
        vertices[0]=0;
        vertices[1]=0;
        vertices[2]=0;

        //存放中心点法向量
        normals[0]=0;
        normals[1]=0;
        normals[2]=1;

        int vcount=3;//当前顶点坐标索引
        int ncount=3;//当前法向量坐标索引

        for(float angle=0;angle<=360;angle=angle+angleSpan)
        {
            double angleRadian=Math.toRadians(angle);
            //顶点坐标
            vertices[vcount++]=radius*(float)Math.cos(angleRadian);
            vertices[vcount++]=radius*(float)Math.sin(angleRadian);
            vertices[vcount++]=0;
            normals[ncount++]=0;
            normals[ncount++]=0;
            normals[ncount++]=1;
        }
        //创建顶点坐标数据缓冲
        //vertices.length*4是因为一个整数四个字节
        ByteBuffer vbb = ByteBuffer.allocateDirect(vertices.length*4);
        vbb.order(ByteOrder.nativeOrder());//设置字节顺序
        mVertexBuffer = vbb.asFloatBuffer();//转换为int型缓冲
        mVertexBuffer.put(vertices);//向缓冲区中放入顶点坐标数据
        mVertexBuffer.position(0);//设置缓冲区起始位置


        //创建顶点法向量数据缓冲
        ByteBuffer nbb = ByteBuffer.allocateDirect(normals.length*4);
        nbb.order(ByteOrder.nativeOrder());//设置字节顺序
        mNormalBuffer = nbb.asFloatBuffer();//转换为float型缓冲
        mNormalBuffer.put(normals);//向缓冲区中放入顶点坐标数据
        mNormalBuffer.position(0);//设置缓冲区起始位置
    }
    public void initShader(int mProgramIn)
    {
        mProgram = mProgramIn;
        //获取程序中顶点位置属性引用id
        maPositionHandle = GLES20.glGetAttribLocation(mProgram, "aPosition");
        //获取程序中顶点颜色属性引用id
        maNormalHandle= GLES20.glGetAttribLocation(mProgram, "aNormal");
        //获取程序中总变换矩阵引用id
        muMVPMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
        //获取位置、旋转变换矩阵引用id
        muMMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uMMatrix");
        //获取程序中光源位置引用id
        maLightLocationHandle=GLES20.glGetUniformLocation(mProgram, "uLightLocation");
        //获取程序中摄像机位置引用id
        maCameraHandle=GLES20.glGetUniformLocation(mProgram, "uCamera");

        maColorR=GLES20.glGetUniformLocation(mProgram, "colorR");
        maColorG=GLES20.glGetUniformLocation(mProgram, "colorG");
        maColorB=GLES20.glGetUniformLocation(mProgram, "colorB");
        maColorA=GLES20.glGetUniformLocation(mProgram, "colorA");
    }
    public void drawSelf(float alpha)
    {
        //制定使用某套shader程序
        GLES20.glUseProgram(mProgram);
        //将最终变换矩阵传入shader程序
        GLES20.glUniformMatrix4fv(muMVPMatrixHandle, 1, false, MatrixState.getFinalMatrix(), 0);
        //将位置、旋转变换矩阵传入shader程序
        GLES20.glUniformMatrix4fv(muMMatrixHandle, 1, false, MatrixState.getMMatrix(), 0);
        //将光源位置传入shader程序
        GLES20.glUniform3fv(maLightLocationHandle, 1, MatrixState.lightPositionFB);
        //将摄像机位置传入shader程序
        GLES20.glUniform3fv(maCameraHandle, 1, MatrixState.cameraFB);
        //传入顶点位置数据
        GLES20.glVertexAttribPointer
                (
                        maPositionHandle,
                        3,
                        GLES20.GL_FLOAT,
                        false,
                        3*4,
                        mVertexBuffer
                );
        //传入顶点法向量数据
        GLES20.glVertexAttribPointer
                (
                        maNormalHandle,
                        3,
                        GLES20.GL_FLOAT,
                        false,
                        3*4,
                        mNormalBuffer
                );
        //允许顶点位置、法向量数据数组
        GLES20.glEnableVertexAttribArray(maPositionHandle);
        GLES20.glEnableVertexAttribArray(maNormalHandle);
        GLES20.glUniform1f(maColorR , r);
        GLES20.glUniform1f(maColorG , g);
        GLES20.glUniform1f(maColorB , b);
        GLES20.glUniform1f(maColorA , alpha);
        //绘制图形
        GLES20.glDrawArrays
                (
                        GL10.GL_TRIANGLE_FAN, 		//以TRIANGLE_FAN方式填充
                        0,
                        vCount
                );
    }
}
