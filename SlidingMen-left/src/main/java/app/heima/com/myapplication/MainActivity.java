package app.heima.com.myapplication;

import android.app.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Window;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingActivity;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity{

    private SlidingMenu slidingMenu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
        setBehindContentView(R.layout.menu_frame);
        slidingMenu = getSlidingMenu();
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        slidingMenu.setMode(SlidingMenu.LEFT);
        slidingMenu.setShadowDrawable(R.drawable.shadow);
        slidingMenu.setShadowWidthRes(R.dimen.shadow_width);
        MenuFrament menuFrament=new MenuFrament();
    }

    public void switchFrament(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,fragment,"HOME").commit();
        slidingMenu.toggle();

    }
}
