package top.lc951.bnst.clp;

/**
 * Created by lichong on 2017/7/24.
 *
 * @ Email lichongmac@163.com
 */
//用来进行绘制切割的类
public class ClipGrid {
    public static final boolean[][][] CLIP_MASK=
            {
                    {
                            {true,true,true,true,true},
                            {true,true,true,true,true},
                            {true,true,true,true,true},
                            {true,true,true,true,true},
                            {false,false,false,false,false}
                    },
                    {
                            {true,true,true,true,false},
                            {true,true,true,true,false},
                            {true,true,true,true,false},
                            {true,true,true,true,false},
                            {true,true,true,true,false}
                    },
                    {
                            {false,false,false,false,false},
                            {true,true,true,true,true},
                            {true,true,true,true,true},
                            {true,true,true,true,true},
                            {true,true,true,true,true}
                    },
                    {
                            {false,true,true,true,true},
                            {false,true,true,true,true},
                            {false,true,true,true,true},
                            {false,true,true,true,true},
                            {false,true,true,true,true}
                    }
            };
}
