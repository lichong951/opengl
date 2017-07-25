package top.lc951.aircraftattack.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

import static top.lc951.aircraftattack.game_view.Constant.SCREEN_HEIGHT;
import static top.lc951.aircraftattack.game_view.Constant.SCREEN_WIDTH;

/**
 * Created by lichong on 2017/7/25.
 *
 * @ Email lichongmac@163.com
 */

public class MyVideoView extends VideoView {
    public MyVideoView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        int width = getDefaultSize((int) SCREEN_WIDTH, widthMeasureSpec);
        int height = getDefaultSize((int) SCREEN_HEIGHT, heightMeasureSpec);
        setMeasuredDimension(width,height);
    }
}
