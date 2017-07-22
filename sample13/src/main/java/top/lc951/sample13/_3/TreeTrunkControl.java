package top.lc951.sample13._3;

/**
 * Created by lichong on 2017/7/17.
 *
 * @ Email lichongmac@163.com
 */

class TreeTrunkControl {
    static int num=0;
    //标志
    int flag=0;
    //树的位置
    float positionX;
    float positionY;
    float positionZ;
    //树干的模型
    TreeTrunk treeTrunk;
    public TreeTrunkControl(float positionX,float positionY,float positionZ,TreeTrunk treeTrunk)
    {
        flag=num++;
        this.positionX=positionX;
        this.positionY=positionY;
        this.positionZ=positionZ;
        this.treeTrunk=treeTrunk;
    }
    public void drawSelf(int tex_treejointId,float bend_R,float wind_direction)
    {
        MatrixState.pushMatrix();
        MatrixState.translate(positionX, positionY, positionZ);//移动到指定的位置
        treeTrunk.drawSelf(tex_treejointId, bend_R, wind_direction);
        MatrixState.popMatrix();
    }
}
