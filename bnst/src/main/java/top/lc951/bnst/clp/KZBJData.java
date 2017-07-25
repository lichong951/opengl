package top.lc951.bnst.clp;

import static top.lc951.bnst.clp.Constant_clp.UNIT_SIZE;
import static top.lc951.bnst.clp.Constant_clp.WATER_HIGH_ADJUST;

/**
 * Created by lichong on 2017/7/24.
 *
 * @ Email lichongmac@163.com
 */
//可撞部件数据类
public class KZBJData {

    //可碰撞物体的相关数据列表，列表数据的结构为id,x,y,z,row,cols
    static float[][] KZBJ_ARRAY=new float[][]
            {
                    //1-4竖直
                    {0, UNIT_SIZE*4, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*1+16f, 1, 4},	//交通柱
                    {0, UNIT_SIZE*4, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*1-16f, 1, 4},	//交通柱
                    {1, UNIT_SIZE*4, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*1+12f, 1, 4},	//交通柱
                    {1, UNIT_SIZE*4, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*1-12f, 1, 4},	//交通柱
                    {0, UNIT_SIZE*4, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*1+8f, 1, 4},	//交通柱
                    {0, UNIT_SIZE*4, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*1-8f, 1, 4},	//交通柱
                    {1, UNIT_SIZE*4, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*1+4f, 1, 4},	//交通柱
                    {1, UNIT_SIZE*4, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*1-4f, 1, 4},	//交通柱
                    {0, UNIT_SIZE*4, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*1+0f, 1, 4},	//交通柱

                    //2-5横着
                    {0, UNIT_SIZE*5+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 5},	//交通柱
                    {0, UNIT_SIZE*5-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 5},	//交通柱
                    {1, UNIT_SIZE*5+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 5},	//交通柱
                    {1, UNIT_SIZE*5-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 5},	//交通柱
                    {0, UNIT_SIZE*5+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 5},	//交通柱
                    {0, UNIT_SIZE*5-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 5},	//交通柱
                    {1, UNIT_SIZE*5+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 5},	//交通柱
                    {1, UNIT_SIZE*5-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 5},	//交通柱
                    {0, UNIT_SIZE*5+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 5},	//交通柱
                    //2-12横着
                    {0, UNIT_SIZE*12+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 12},	//交通柱
                    {0, UNIT_SIZE*12-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 12},	//交通柱
                    {1, UNIT_SIZE*12+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 12},	//交通柱
                    {1, UNIT_SIZE*12-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 12},	//交通柱
                    {0, UNIT_SIZE*12+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 12},	//交通柱
                    {0, UNIT_SIZE*12-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 12},	//交通柱
                    {1, UNIT_SIZE*12+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 12},	//交通柱
                    {1, UNIT_SIZE*12-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 12},	//交通柱
                    {0, UNIT_SIZE*12+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 12},	//交通柱
                    //2-13横着
                    {0, UNIT_SIZE*13+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 13},	//交通柱
                    {0, UNIT_SIZE*13-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 13},	//交通柱
                    {1, UNIT_SIZE*13+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 13},	//交通柱
                    {1, UNIT_SIZE*13-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 13},	//交通柱
                    {0, UNIT_SIZE*13+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 13},	//交通柱
                    {0, UNIT_SIZE*13-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 13},	//交通柱
                    {1, UNIT_SIZE*13+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 13},	//交通柱
                    {1, UNIT_SIZE*13-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 13},	//交通柱
                    {0, UNIT_SIZE*13+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 13},	//交通柱
                    //3-15竖直
                    {0, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3+16f, 3, 15},	//交通柱
                    {0, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3-16f, 3, 15},	//交通柱
                    {1, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3+12f, 3, 15},	//交通柱
                    {1, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3-12f, 3, 15},	//交通柱
                    {0, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3+8f, 3, 15},	//交通柱
                    {0, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3-8f, 3, 15},	//交通柱
                    {1, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3+4f, 3, 15},	//交通柱
                    {1, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3-4f, 3, 15},	//交通柱
                    {0, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3+0f, 3, 15},	//交通柱
                    //4-13横着
                    {0, UNIT_SIZE*13+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*4, 4, 13},	//交通柱
                    {0, UNIT_SIZE*13-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*4, 4, 13},	//交通柱
                    {1, UNIT_SIZE*13+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*4, 4, 13},	//交通柱
                    {1, UNIT_SIZE*13-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*4, 4, 13},	//交通柱
                    {0, UNIT_SIZE*13+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*4, 4, 13},	//交通柱
                    {0, UNIT_SIZE*13-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*4, 4, 13},	//交通柱
                    {1, UNIT_SIZE*13+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*4, 4, 13},	//交通柱
                    {1, UNIT_SIZE*13-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*4, 4, 13},	//交通柱
                    {0, UNIT_SIZE*13+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*4, 4, 13},	//交通柱
                    //5-11竖直
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+16f, 5, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-16f, 5, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+12f, 5, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-12f, 5, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+8f, 5, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-8f, 5, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+4f, 5, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-4f, 5, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+0f, 5, 11},	//交通柱
                    //8-12竖直
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8+16f, 8, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8-16f, 8, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8+12f, 8, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8-12f, 8, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8+8f, 8, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8-8f, 8, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8+4f, 8, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8-4f, 8, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8+0f, 8, 12},	//交通柱
                    //12-11竖直
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*12+16f, 12, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*12-16f, 12, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*12+12f, 12, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*12-12f, 12, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*12+8f, 12, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*12-8f, 12, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*12+4f, 12, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*12-4f, 12, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*12+0f, 12, 11},	//交通柱
                    //13-17横着
                    {0, UNIT_SIZE*17+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*13, 13, 17},	//交通柱
                    {0, UNIT_SIZE*17-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*13, 13, 17},	//交通柱
                    {1, UNIT_SIZE*17+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*13, 13, 17},	//交通柱
                    {1, UNIT_SIZE*17-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*13, 13, 17},	//交通柱
                    {0, UNIT_SIZE*17+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*13, 13, 17},	//交通柱
                    {0, UNIT_SIZE*17-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*13, 13, 17},	//交通柱
                    {1, UNIT_SIZE*17+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*13, 13, 17},	//交通柱
                    {1, UNIT_SIZE*17-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*13, 13, 17},	//交通柱
                    {0, UNIT_SIZE*17+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*13, 13, 17},	//交通柱
                    //11-20竖直
                    {0, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11+16f, 11, 20},	//交通柱
                    {0, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11-16f, 11, 20},	//交通柱
                    {1, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11+12f, 11, 20},	//交通柱
                    {1, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11-12f, 11, 20},	//交通柱
                    {0, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11+8f, 11, 20},	//交通柱
                    {0, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11-8f, 11, 20},	//交通柱
                    {1, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11+4f, 11, 20},	//交通柱
                    {1, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11-4f, 11, 20},	//交通柱
                    {0, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11+0f, 11, 20},	//交通柱
                    //8-21竖直
                    {0, UNIT_SIZE*21, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8+16f, 8, 21},	//交通柱
                    {0, UNIT_SIZE*21, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8-16f, 8, 21},	//交通柱
                    {1, UNIT_SIZE*21, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8+12f, 8, 21},	//交通柱
                    {1, UNIT_SIZE*21, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8-12f, 8, 21},	//交通柱
                    {0, UNIT_SIZE*21, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8+8f, 8, 21},	//交通柱
                    {0, UNIT_SIZE*21, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8-8f, 8, 21},	//交通柱
                    {1, UNIT_SIZE*21, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8+4f, 8, 21},	//交通柱
                    {1, UNIT_SIZE*21, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8-4f, 8, 21},	//交通柱
                    {0, UNIT_SIZE*21, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*8+0f, 8, 21},	//交通柱
                    //5-20竖直
                    {0, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+16f, 5, 20},	//交通柱
                    {0, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-16f, 5, 20},	//交通柱
                    {1, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+12f, 5, 20},	//交通柱
                    {1, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-12f, 5, 20},	//交通柱
                    {0, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+8f, 5, 20},	//交通柱
                    {0, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-8f, 5, 20},	//交通柱
                    {1, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+4f, 5, 20},	//交通柱
                    {1, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-4f, 5, 20},	//交通柱
                    {0, UNIT_SIZE*20, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+0f, 5, 20},	//交通柱
                    //5-23横着
                    {0, UNIT_SIZE*23+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 23},	//交通柱
                    {0, UNIT_SIZE*23-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 23},	//交通柱
                    {1, UNIT_SIZE*23+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 23},	//交通柱
                    {1, UNIT_SIZE*23-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 23},	//交通柱
                    {0, UNIT_SIZE*23+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5,23},	//交通柱
                    {0, UNIT_SIZE*23-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 23},	//交通柱
                    {1, UNIT_SIZE*23+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 23},	//交通柱
                    {1, UNIT_SIZE*23-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 23},	//交通柱
                    {0, UNIT_SIZE*23+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 23},	//交通柱
                    //2-27横着
                    {0, UNIT_SIZE*27+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 27},	//交通柱
                    {0, UNIT_SIZE*27-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 27},	//交通柱
                    {1, UNIT_SIZE*27+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 27},	//交通柱
                    {1, UNIT_SIZE*27-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 27},	//交通柱
                    {0, UNIT_SIZE*27+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2,27},	//交通柱
                    {0, UNIT_SIZE*27-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 27},	//交通柱
                    {1, UNIT_SIZE*27+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 27},	//交通柱
                    {1, UNIT_SIZE*27-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 27},	//交通柱
                    {0, UNIT_SIZE*27+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*2, 2, 27},	//交通柱
                    //7-26竖直
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*7+16f, 7, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*7-16f, 7, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*7+12f, 7, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*7-12f, 7, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*7+8f, 7, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*7-8f, 7, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*7+4f, 7, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*7-4f, 7, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*7+0f, 7, 26},	//交通柱
                    //16-26竖直
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16+16f, 16, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16-16f, 16, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16+12f, 16, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16-12f, 16, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16+8f, 16, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16-8f, 16, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16+4f, 16, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16-4f, 16, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16+0f, 16, 26},	//交通柱
                    //18-25竖直
                    {0, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*18+16f, 18, 25},	//交通柱
                    {0, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*18-16f, 18, 25},	//交通柱
                    {1, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*18+12f, 18, 25},	//交通柱
                    {1, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*18-12f, 18, 25},	//交通柱
                    {0, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*18+8f, 18, 25},	//交通柱
                    {0, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*18-8f, 18, 25},	//交通柱
                    {1, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*18+4f, 18, 25},	//交通柱
                    {1, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*18-4f, 18, 25},	//交通柱
                    {0, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*18+0f, 18, 25},	//交通柱
                    //22-26竖直
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+16f, 22, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-16f, 22, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+12f, 22, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-12f, 22, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+8f, 22, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-8f, 22, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+4f, 22, 26},	//交通柱
                    {1, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-4f, 22, 26},	//交通柱
                    {0, UNIT_SIZE*26, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+0f, 22, 26},	//交通柱
                    //22-25竖直
                    {0, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+16f, 22, 25},	//交通柱
                    {0, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-16f, 22, 25},	//交通柱
                    {1, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+12f, 22, 25},	//交通柱
                    {1, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-12f, 22, 25},	//交通柱
                    {0, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+8f, 22, 25},	//交通柱
                    {0, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-8f, 22, 25},	//交通柱
                    {1, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+4f, 22, 25},	//交通柱
                    {1, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-4f, 22, 25},	//交通柱
                    {0, UNIT_SIZE*25, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+0f, 22, 25},	//交通柱
                    //24-24竖直
                    {0, UNIT_SIZE*24, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24+16f, 24, 24},	//交通柱
                    {0, UNIT_SIZE*24, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24-16f, 24, 24},	//交通柱
                    {1, UNIT_SIZE*24, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24+12f, 24, 24},	//交通柱
                    {1, UNIT_SIZE*24, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24-12f, 24, 24},	//交通柱
                    {0, UNIT_SIZE*24, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24+8f, 24, 24},	//交通柱
                    {0, UNIT_SIZE*24, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24-8f, 24, 24},	//交通柱
                    {1, UNIT_SIZE*24, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24+4f, 24, 24},	//交通柱
                    {1, UNIT_SIZE*24, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24-4f, 24, 24},	//交通柱
                    {0, UNIT_SIZE*24, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24+0f, 24, 24},	//交通柱
                    //26-15竖直
                    {0, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*26+16f, 26, 15},	//交通柱
                    {0, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*26-16f, 26, 15},	//交通柱
                    {1, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*26+12f, 26, 15},	//交通柱
                    {1, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*26-12f, 26, 15},	//交通柱
                    {0, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*26+8f, 26, 15},	//交通柱
                    {0, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*26-8f, 26, 15},	//交通柱
                    {1, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*26+4f, 26, 15},	//交通柱
                    {1, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*26-4f, 26, 15},	//交通柱
                    {0, UNIT_SIZE*15, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*26+0f, 26, 15},	//交通柱
                    //21-16竖直
                    {0, UNIT_SIZE*16, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*21+16f, 21, 16},	//交通柱
                    {0, UNIT_SIZE*16, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*21-16f, 21, 16},	//交通柱
                    {1, UNIT_SIZE*16, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*21+12f, 21, 16},	//交通柱
                    {1, UNIT_SIZE*16, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*21-12f, 21, 16},	//交通柱
                    {0, UNIT_SIZE*16, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*21+8f, 21, 16},	//交通柱
                    {0, UNIT_SIZE*16, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*21-8f, 21, 16},	//交通柱
                    {1, UNIT_SIZE*16, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*21+4f, 21, 16},	//交通柱
                    {1, UNIT_SIZE*16, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*21-4f, 21, 16},	//交通柱
                    {0, UNIT_SIZE*16, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*21+0f, 21, 16},	//交通柱
                    //20-14横着
                    {0, UNIT_SIZE*14+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 14},	//交通柱
                    {0, UNIT_SIZE*14-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 14},	//交通柱
                    {1, UNIT_SIZE*14+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 14},	//交通柱
                    {1, UNIT_SIZE*14-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 14},	//交通柱
                    {0, UNIT_SIZE*14+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20,14},	//交通柱
                    {0, UNIT_SIZE*14-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 14},	//交通柱
                    {1, UNIT_SIZE*14+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 14},	//交通柱
                    {1, UNIT_SIZE*14-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 14},	//交通柱
                    {0, UNIT_SIZE*14+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 14},	//交通柱
                    //20-12横着
                    {0, UNIT_SIZE*12+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 12},	//交通柱
                    {0, UNIT_SIZE*12-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 12},	//交通柱
                    {1, UNIT_SIZE*12+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 12},	//交通柱
                    {1, UNIT_SIZE*12-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 12},	//交通柱
                    {0, UNIT_SIZE*12+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 12},	//交通柱
                    {0, UNIT_SIZE*12-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 12},	//交通柱
                    {1, UNIT_SIZE*12+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 12},	//交通柱
                    {1, UNIT_SIZE*12-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 12},	//交通柱
                    {0, UNIT_SIZE*12+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20, 20, 12},	//交通柱
                    //22-12竖直
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+16f, 22, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-16f, 22, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+12f, 22, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-12f, 22, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+8f, 22, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-8f, 22, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+4f, 22, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22-4f, 22, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*22+0f, 22, 12},	//交通柱
                    //25-12竖直
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*25+16f, 25, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*25-16f, 25, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*25+12f, 25, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*25-12f, 25, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*25+8f, 25, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*25-8f, 25, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*25+4f, 25, 12},	//交通柱
                    {1, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*25-4f, 25, 12},	//交通柱
                    {0, UNIT_SIZE*12, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*25+0f, 25, 12},	//交通柱
                    //29-6竖直
                    {0, UNIT_SIZE*6, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*29+16f, 29, 6},	//交通柱
                    {0, UNIT_SIZE*6, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*29-16f, 29, 6},	//交通柱
                    {1, UNIT_SIZE*6, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*29+12f, 29, 6},	//交通柱
                    {1, UNIT_SIZE*6, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*29-12f, 29, 6},	//交通柱
                    {0, UNIT_SIZE*6, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*29+8f, 29, 6},	//交通柱
                    {0, UNIT_SIZE*6, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*29-8f, 29, 6},	//交通柱
                    {1, UNIT_SIZE*6, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*29+4f, 29, 6},	//交通柱
                    {1, UNIT_SIZE*6, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*29-4f, 29, 6},	//交通柱
                    {0, UNIT_SIZE*6, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*29+0f, 29, 6},	//交通柱
                    //27-2竖直
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*27+16f, 27, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*27-16f, 27, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*27+12f, 27, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*27-12f, 27, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*27+8f, 27, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*27-8f, 27, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*27+4f, 27, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*27-4f, 27, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*27+0f, 27, 2},	//交通柱
                    //24-2竖直
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24+16f, 24, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24-16f, 24, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24+12f, 24, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24-12f, 24, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24+8f, 24, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24-8f, 24, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24+4f, 24, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24-4f, 24, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*24+0f, 24, 2},	//交通柱
                    //20-1竖直
                    {0, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20+16f, 20, 1},	//交通柱
                    {0, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20-16f, 20, 1},	//交通柱
                    {1, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20+12f, 20, 1},	//交通柱
                    {1, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20-12f, 20, 1},	//交通柱
                    {0, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20+8f, 20, 1},	//交通柱
                    {0, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20-8f, 20, 1},	//交通柱
                    {1, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20+4f, 20, 1},	//交通柱
                    {1, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20-4f, 20, 1},	//交通柱
                    {0, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*20+0f, 20, 1},	//交通柱
                    //16-1竖直
                    {0, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16+16f, 16, 1},	//交通柱
                    {0, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16-16f, 16, 1},	//交通柱
                    {1, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16+12f, 16, 1},	//交通柱
                    {1, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16-12f, 16, 1},	//交通柱
                    {0, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16+8f, 16, 1},	//交通柱
                    {0, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16-8f, 16, 1},	//交通柱
                    {1, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16+4f, 16, 1},	//交通柱
                    {1, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16-4f, 16, 1},	//交通柱
                    {0, UNIT_SIZE*1, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*16+0f, 16, 1},	//交通柱
                    //9-2竖直
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*9+16f, 9, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*9-16f, 9, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*9+12f, 9, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*9-12f, 9, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*9+8f, 9, 2},		//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*9-8f, 9, 2},		//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*9+4f, 9, 2},		//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*9-4f, 9, 2},		//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*9+0f, 9, 2},		//交通柱
                    //5-2竖直
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+16f, 5, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-16f, 5, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+12f, 5, 2},	//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-12f, 5, 2},	//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+8f, 5, 2},		//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-8f, 5, 2},		//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+4f, 5, 2},		//交通柱
                    {1, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5-4f, 5, 2},		//交通柱
                    {0, UNIT_SIZE*2, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5+0f, 5, 2},		//交通柱

                    //3-1横着
                    {0, UNIT_SIZE*1+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3, 3, 1},	//交通柱
                    {0, UNIT_SIZE*1-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3, 3, 1},	//交通柱
                    {1, UNIT_SIZE*1+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3, 3, 1},	//交通柱
                    {1, UNIT_SIZE*1-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3, 3, 1},	//交通柱
                    {0, UNIT_SIZE*1+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3, 3, 1},	//交通柱
                    {0, UNIT_SIZE*1-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3, 3, 1},	//交通柱
                    {1, UNIT_SIZE*1+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3, 3, 1},	//交通柱
                    {1, UNIT_SIZE*1-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3, 3, 1},	//交通柱
                    {0, UNIT_SIZE*1+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*3, 3, 1},	//交通柱

                    //5-24横着
                    {0, UNIT_SIZE*24+16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 24},	//交通柱
                    {0, UNIT_SIZE*24-16f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 24},	//交通柱
                    {1, UNIT_SIZE*24+12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 24},	//交通柱
                    {1, UNIT_SIZE*24-12f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 24},	//交通柱
                    {0, UNIT_SIZE*24+8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 24},	//交通柱
                    {0, UNIT_SIZE*24-8f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 24},	//交通柱
                    {1, UNIT_SIZE*24+4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 24},	//交通柱
                    {1, UNIT_SIZE*24-4f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 24},	//交通柱
                    {0, UNIT_SIZE*24+0f, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*5, 5, 24},	//交通柱

                    //新添加的
                    //11-11竖直
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11+16f, 11, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11-16f, 11, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11+12f, 11, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11-12f, 11, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11+8f, 11, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11-8f, 11, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11+4f, 11, 11},	//交通柱
                    {1, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11-4f, 11, 11},	//交通柱
                    {0, UNIT_SIZE*11, WATER_HIGH_ADJUST+1.3f, UNIT_SIZE*11+0f, 11, 11},	//交通柱
                    //新添加的
            };
}