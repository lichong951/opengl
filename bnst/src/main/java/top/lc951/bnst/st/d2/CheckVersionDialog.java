package top.lc951.bnst.st.d2;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import top.lc951.bnst.R;

/**
 * Created by lichong on 2017/7/24.
 *
 * @ Email lichongmac@163.com
 */

public class CheckVersionDialog extends Dialog
{
    public CheckVersionDialog(Context context)
    {
        super(context, R.style.FullHeightDialog);
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
