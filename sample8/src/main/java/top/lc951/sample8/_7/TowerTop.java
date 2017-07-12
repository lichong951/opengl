package top.lc951.sample8._7;

/**
 * @author lichong_951@163.com
 * @version V1.0
 * @Description: 绘制塔顶的类
 * @date 2017/7/12  23:18
 * @powered by lichong
 */

 class TowerTop {
    float scale;//塔的大小

    TowerPart1 tower1;//塔的第一部分
    TowerPart2 tower2;//塔中圆柱部分
    TowerPart3 tower3;//


    float xAngle=0;//绕x轴旋转的角度
    float yAngle=0;//绕y轴旋转的角度
    float zAngle=0;//绕z轴旋转的角度

    TowerTop(MySurfaceView mv, float scale, int nCol , int nRow)
    {
        this.scale=scale;//茶壶大小赋值

        //创建对象
        tower1=new TowerPart1(mv,0.4f*scale,20,40);//穹顶的第一部分
        tower2=new TowerPart2(mv,0.35f*scale,20,40);//穹顶的第二部分

    }
    public void drawSelf(int texId)
    {
        MatrixState.rotate(xAngle, 1, 0, 0);
        MatrixState.rotate(yAngle, 0, 1, 0);
        MatrixState.rotate(zAngle, 0, 0, 1);


        //塔的第一部分
        MatrixState.pushMatrix();
        MatrixState.translate(0f, 3.0f*scale, 0f);
        tower1.drawSelf(texId);//穹顶的第一部分
        MatrixState.popMatrix();

        //**************塔的第二部分****************************************
        //四根圆柱
        MatrixState.pushMatrix();
        MatrixState.translate(0.62f*scale, 2.15f*scale, 0.62f*scale);
        tower2.drawSelf(texId);//穹顶的第一部分
        MatrixState.popMatrix();

        MatrixState.pushMatrix();
        MatrixState.translate(-0.62f*scale, 2.15f*scale, 0.62f*scale);
        tower2.drawSelf(texId);//穹顶的第一部分
        MatrixState.popMatrix();

        MatrixState.pushMatrix();
        MatrixState.translate(0.62f*scale, 2.15f*scale, -0.62f*scale);
        tower2.drawSelf(texId);//穹顶的第一部分
        MatrixState.popMatrix();

        MatrixState.pushMatrix();
        MatrixState.translate(-0.62f*scale, 2.15f*scale, -0.62f*scale);
        tower2.drawSelf(texId);//穹顶的第一部分
        MatrixState.popMatrix();
        //**************塔的第二部分***************************************
    }
}
