package top.lc951.sample13._3;

import android.content.res.Resources;

import top.lc951.sample13.utils.ShaderUtil;

/**
 * Created by lichong on 2017/7/17.
 *
 * @ Email lichongmac@163.com
 */

class ShaderManager {
    final static String[][] shaderName=
            {
                    {"vertex_tree_3.sh","frag_tree_3.sh"},//椰子树的着色器
                    {"vertex_tex_3.sh","frag_tex_3.sh"},//纹理贴图的着色器
                    {"vertex_water_3.sh","frag_water_3.sh"},//海水的着色器
                    {"vertex_landform_3.sh","frag_landform_3.sh"},//山的着色器
                    {"vertex_leaves_3.sh","frag_leaves_3.sh"},//叶子的着色器
            };
    static String[]mVertexShader=new String[shaderName.length];//顶点着色器字符串数组
    static String[]mFragmentShader=new String[shaderName.length];//片元着色器字符串数组
    static int[] program=new int[shaderName.length];//程序数组
    //加载shader字符串
    public static void loadCodeFromFile(Resources r)
    {
        for(int i=0;i<shaderName.length;i++)
        {
            //加载顶点着色器的脚本内容
            mVertexShader[i]= ShaderUtil.loadFromAssetsFile(shaderName[i][0],r);
            //加载片元着色器的脚本内容
            mFragmentShader[i]=ShaderUtil.loadFromAssetsFile(shaderName[i][1], r);
        }
    }
    //编译shader
    public static void compileShader()
    {
        for(int i=0;i<shaderName.length;i++)
        {
            program[i]=ShaderUtil.createProgram(mVertexShader[i], mFragmentShader[i]);
        }
    }
    //这里返回的是椰子树摇动的shader程序
    public static int getTreeWaveShaderProgram()
    {
        return program[0];
    }
    //这里返回的是纹理贴图的shader
    public static int getTextureShaderProgram()
    {
        return program[1];
    }
    //这里返回的是海水的shader
    public static int getWaterShaderProgram()
    {
        return program[2];
    }
    //这里返回山的颜色的shader
    public static int getLandFormShaderProgram()
    {
        return program[3];
    }
    //这里返回叶子的颜色的shader
    public static int getLeavesShaderProgram()
    {
        return program[4];
    }
}
