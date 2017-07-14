package top.lc951.sample10._4;

import android.opengl.GLES20;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import top.lc951.sample10.utils.ShaderUtil;

/**
 * Created by lichong on 2017/7/14.
 */

class TextureRect {
    int mProgram;//自定义渲染管线着色器程序id
    int muMVPMatrixHandle;//总变换矩阵引用
    int muMMatrixHandle;//位置、旋转变换矩阵
    int maCameraHandle; //摄像机位置属性引用
    int maPositionHandle; //顶点位置属性引用
    int maNormalHandle; //顶点法向量属性引用
    int maLightLocationHandle;//光源位置属性引用

    String mVertexShader;//顶点着色器
    String mFragmentShader;//片元着色器

    private FloatBuffer mVertexBuffer;//顶点坐标数据缓冲
    FloatBuffer   mNormalBuffer;//顶点法向量数据缓冲
    int vCount;//顶点数量

    float width;
    float height;

    public TextureRect(MySurfaceView mv,
                       float width,float height	//矩形的宽高
    )
    {

        this.width=width;
        this.height=height;

        initVertexData();
        initShader(mv);

    }
    //初始化顶点坐标与着色数据的方法
    public void initVertexData()
    {
        //顶点坐标数据的初始化================begin============================
        vCount=6;//每个格子两个三角形，每个三角形3个顶点
        float vertices[]=
                {
                        -width/2, 0,-height/2,
                        -width/2, 0,height/2,
                        width/2, 0,height/2,

                        -width/2, 0,-height/2,
                        width/2, 0,height/2,
                        width/2, 0, -height/2,
                };
        //创建顶点坐标数据缓冲
        //vertices.length*4是因为一个整数四个字节
        ByteBuffer vbb = ByteBuffer.allocateDirect(vertices.length*4);
        vbb.order(ByteOrder.nativeOrder());//设置字节顺序
        mVertexBuffer = vbb.asFloatBuffer();//转换为int型缓冲
        mVertexBuffer.put(vertices);//向缓冲区中放入顶点坐标数据
        mVertexBuffer.position(0);//设置缓冲区起始位置

        float[] normals = {
                0,1,0,
                0,1,0,
                0,1,0,
                0,1,0,
                0,1,0,
                0,1,0,
        };
        //顶点法向量数据的初始化================begin============================
        ByteBuffer cbb = ByteBuffer.allocateDirect(normals.length*4);
        cbb.order(ByteOrder.nativeOrder());//设置字节顺序
        mNormalBuffer = cbb.asFloatBuffer();//转换为Float型缓冲
        mNormalBuffer.put(normals);//向缓冲区中放入顶点法向量数据
        mNormalBuffer.position(0);//设置缓冲区起始位置
        //特别提示：由于不同平台字节顺序不同数据单元不是字节的一定要经过ByteBuffer
        //转换，关键是要通过ByteOrder设置nativeOrder()，否则有可能会出问题
        //顶点着色数据的初始化================end============================
    }
    public void initShader(MySurfaceView mv)
    {
        //加载顶点着色器的脚本内容
        mVertexShader= ShaderUtil.loadFromAssetsFile("vertex_light_3.sh", mv.getResources());
        //加载片元着色器的脚本内容
        mFragmentShader=ShaderUtil.loadFromAssetsFile("frag_light_3.sh", mv.getResources());
        //基于顶点着色器与片元着色器创建程序
        mProgram = ShaderUtil.createProgram(mVertexShader, mFragmentShader);
        //获取程序中顶点位置属性引用
        maPositionHandle = GLES20.glGetAttribLocation(mProgram, "aPosition");
        //获取程序中顶点法向量属性引用
        maNormalHandle= GLES20.glGetAttribLocation(mProgram, "aNormal");
        //获取程序中总变换矩阵id
        muMVPMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
        //获取程序中摄像机位置引用
        maCameraHandle=GLES20.glGetUniformLocation(mProgram, "uCamera");
        //获取程序中光源位置引用
        maLightLocationHandle=GLES20.glGetUniformLocation(mProgram, "uLightLocation");
        //获取位置、旋转变换矩阵引用
        muMMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uMMatrix");
    }
    public void drawSelf()
    {
        //制定使用某套着色器程序
        GLES20.glUseProgram(mProgram);
        //将最终变换矩阵传入着色器程序
        GLES20.glUniformMatrix4fv(muMVPMatrixHandle, 1, false, MatrixState.getFinalMatrix(), 0);
        //将位置、旋转变换矩阵传入着色器程序
        GLES20.glUniformMatrix4fv(muMMatrixHandle, 1, false, MatrixState.getMMatrix(), 0);
        //将摄像机位置传入着色器程序
        GLES20.glUniform3fv(maCameraHandle, 1, MatrixState.cameraFB);
        //将光源位置传入着色器程序
        GLES20.glUniform3fv(maLightLocationHandle, 1, MatrixState.lightPositionFB);
        //将顶点法向量数据传入渲染管线
        GLES20.glVertexAttribPointer
                (
                        maPositionHandle,
                        3,
                        GLES20.GL_FLOAT,
                        false,
                        3*4,
                        mVertexBuffer
                );
        //将顶点法向量数据传入渲染管线
        GLES20.glVertexAttribPointer
                (
                        maNormalHandle,
                        3,
                        GLES20.GL_FLOAT,
                        false,
                        3*4,
                        mNormalBuffer
                );
        //允许顶点位置数据数组
        GLES20.glEnableVertexAttribArray(maPositionHandle);
        GLES20.glEnableVertexAttribArray(maNormalHandle);

        //绘制矩形
        GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, vCount);
    }
}
