package app.heima.com.myapplication;

import android.app.Activity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        TextView tv  = (TextView) findViewById(R.id.tv);
        DisplayMetrics metrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        Constant.srceenHeight=metrics.heightPixels;
        Constant.srceenWidth=metrics.widthPixels;
        RelativeLayout.LayoutParams layoutParams=new RelativeLayout.LayoutParams(
                (int)(Constant.srceenWidth*0.5+0.5),(int)(Constant.srceenHeight*0.5+0.5)
        );
        tv.setLayoutParams(layoutParams);

    }
}
