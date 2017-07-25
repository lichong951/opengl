package top.lc951.aircraftattack.core;

/**
 * Created by lichong on 2017/7/25.
 *
 * @ Email lichongmac@163.com
 */

public class Memory {
    public static long used()
    {
        long total=Runtime.getRuntime().totalMemory();
        long free=Runtime.getRuntime().freeMemory();
        return total-free;
    }
}
