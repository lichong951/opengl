package top.lc951.bnst.st.xc;

import java.util.ArrayList;
import java.util.List;

import top.lc951.bnst.clp.ShaderManager;

/**
 * Created by lichong on 2017/7/24.
 *
 * @ Email lichongmac@163.com
 */

public class Boat {
    List<LoadedObjectVertexTexXC> lovo=new ArrayList<LoadedObjectVertexTexXC>();
    //str位文件的名称，color位每一个部分对应的颜色（其为二维数组）
    public Boat(LoadedObjectVertexTexXC[] parts,XCSurfaceView mv)
    {
        for(int i=0;i<parts.length;i++)
        {
            lovo.add(parts[i]);
            parts[i].initShader(ShaderManager_xc.getCommTextureShaderProgram());
        }
    }
    public void drawSelf(int[] texId)
    {
        for(int i=0;i<lovo.size();i++)
        {
            lovo.get(i).drawSelf(texId[i]);
        }
    }
}
