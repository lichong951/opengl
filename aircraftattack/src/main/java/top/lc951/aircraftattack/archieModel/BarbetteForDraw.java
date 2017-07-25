package top.lc951.aircraftattack.archieModel;

import top.lc951.aircraftattack.commonObject.CircleForDraw;
import top.lc951.aircraftattack.commonObject.CylinderForDraw;
import top.lc951.aircraftattack.core.MatrixState;

/**
 * 创建炮台,为圆柱体炮台,其几何中心位于原点
 * Created by lichong on 2017/7/25.
 *
 * @ Email lichongmac@163.com
 */

public class BarbetteForDraw {
    CylinderForDraw cylinder;//圆柱
    CircleForDraw circle;//圆面
    private float length;
    public BarbetteForDraw(float length,float radius,int mProgram)
    {
        this.length=length;
        cylinder=new CylinderForDraw(radius, length, mProgram);
        circle=new CircleForDraw(mProgram, radius);
    }
    public void drawSelf(int texBarbetteId[])//0表示圆柱,1表示圆面
    {
        MatrixState.pushMatrix();
        cylinder.drawSelf(texBarbetteId[0]);//圆柱
        MatrixState.popMatrix();

        MatrixState.pushMatrix();
        MatrixState.rotate(-90, 1, 0, 0);
        MatrixState.translate(0, 0, length/2 );
        circle.drawSelf(texBarbetteId[1]);//上半圆
        MatrixState.popMatrix();

    }
}
