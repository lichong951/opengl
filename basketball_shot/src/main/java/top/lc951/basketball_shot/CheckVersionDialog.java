package top.lc951.basketball_shot;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by lichong on 2017/7/25.
 *
 * @ Email lichongmac@163.com
 */

public class CheckVersionDialog extends Dialog {
    public CheckVersionDialog(Context context)
    {
        super(context,R.style.FullHeightDialog);
    }

    @Override
    public void onCreate (Bundle savedInstanceState)
    {
        this.setContentView(R.layout.checkversion);
    }

    @Override
    public String toString()
    {
        return "CheckVersionDialog";
    }
}
