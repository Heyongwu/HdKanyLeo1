package com.video.Kanyleo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.video.Kanyleo.fragment.AppendFragment;
import com.video.Kanyleo.fragment.ConcernFragment;
import com.video.Kanyleo.fragment.HomeFragment;
import com.video.Kanyleo.fragment.MyFragment;
import com.video.Kanyleo.fragment.NewsFragment;

public class LoginNRActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {

    private BottomNavigationBar bottomNavigationBar;
    int lastSelectedPosition = 0;
    private String TAG = MainActivity.class.getSimpleName();
    HomeFragment home;
    ConcernFragment concern;
    AppendFragment append;
    NewsFragment news;
    MyFragment my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_nr);
        //隐藏标题栏以及沉浸式的实现

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);

        /** 导航基础设置 包括按钮选中效果 导航栏背景色等 */
        bottomNavigationBar
                .setTabSelectedListener(this)
                .setMode(BottomNavigationBar.MODE_FIXED)
                /**
                 *  setMode() 内的参数有三种模式类型：
                 *  MODE_DEFAULT 自动模式：导航栏Item的个数<=3 用 MODE_FIXED 模式，否则用 MODE_SHIFTING 模式
                 *  MODE_FIXED 固定模式：未选中的Item显示文字，无切换动画效果。
                 *  MODE_SHIFTING 切换模式：未选中的Item不显示文字，选中的显示文字，有切换动画效果。
                 */

                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
                /**
                 *  setBackgroundStyle() 内的参数有三种样式
                 *  BACKGROUND_STYLE_DEFAULT: 默认样式 如果设置的Mode为MODE_FIXED，将使用BACKGROUND_STYLE_STATIC
                 *                                    如果Mode为MODE_SHIFTING将使用BACKGROUND_STYLE_RIPPLE。
                 *  BACKGROUND_STYLE_STATIC: 静态样式 点击无波纹效果
                 *  BACKGROUND_STYLE_RIPPLE: 波纹样式 点击有波纹效果
                 */

                .setActiveColor(R.color.red) //选中颜色
                .setInActiveColor(R.color.black) //未选中颜色
                .setBarBackgroundColor("#ffffff");//导航栏背景色

        /** 添加导航按钮 */
        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.mipmap.dianpu, "首页"))
                .addItem(new BottomNavigationItem(R.mipmap.normalheart, "关注"))
                .addItem(new BottomNavigationItem(R.drawable.circle,"  "))
                .addItem(new BottomNavigationItem(R.mipmap.dpj, "消息"))
                .addItem(new BottomNavigationItem(R.mipmap.a_o, "我的"))
                .setFirstSelectedPosition(lastSelectedPosition)
                .initialise(); //initialise 一定要放在 所有设置的最后一项

        setDefaultFragment();//设置默认导航栏

    }

    /**
     * 设置默认导航栏
     */
    private void setDefaultFragment() {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        home = new HomeFragment();
        transaction.replace(R.id.tb, home);
        transaction.commit();
    }

    @Override
    public void onTabSelected(int position) {
        Log.d(TAG, "onTabSelected() called with: " + "position = [" + position + "]");
        FragmentManager fm=getSupportFragmentManager();
        //开启事务
        FragmentTransaction transaction = fm.beginTransaction();
        switch (position) {
            case 0:
                if (home == null)
                    home = new HomeFragment();
                transaction.replace(R.id.tb, home);
                break;

            case 1:
                if (concern == null)
                    concern = new ConcernFragment();
                transaction.replace(R.id.tb, concern);
                break;
            case 2:
                if (append == null)
                    append = new AppendFragment();
                transaction.replace(R.id.tb, append);
                break;

            case 3:
                if (news == null)
                    news = new NewsFragment();
                transaction.replace(R.id.tb, news);
                break;

            case 4:
                if (my == null)
                    my = new MyFragment();
                transaction.replace(R.id.tb, my);
                break;
            default:
                break;
        }
        transaction.commit();// 事务提交
    }

    /**
     * 设置未选中Fragment 事务
     */
    @Override
    public void onTabUnselected(int position) {

    }

    /**
     * 设置释放Fragment 事务
     */
    @Override
    public void onTabReselected(int position) {

    }
}