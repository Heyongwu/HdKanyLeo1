package com.video.Kanyleo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.video.Kanyleo.fragment.SinatvFragment;
import com.video.Kanyleo.setting.MyLoginActivity;
import com.video.Kanyleo.video.VideoFragment;

public class PrimaryActivity extends AppCompatActivity {

    private TabLayout mTb;
    private ViewPager mVp;
    /**
     * 注册/登录
     */
    private TextView mLogin;
    String[] itemName = {"直播","视频"};
    TbAdapter tbAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nr);
        initView();

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        tbAdapter=new TbAdapter(getSupportFragmentManager());
        mTb.setupWithViewPager(mVp);
        mVp.setAdapter(tbAdapter);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrimaryActivity.this, MyLoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        mTb = (TabLayout) findViewById(R.id.tb);
        mVp = (ViewPager) findViewById(R.id.vp);
        mLogin = (TextView) findViewById(R.id.login);
    }

    class TbAdapter extends FragmentPagerAdapter{


        public TbAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                //注意：activity中导入的包必须和碎片一致 v4包
                case 0:
                    return new SinatvFragment();
                case 1:
                    return new VideoFragment();
            }
            return new VideoFragment();
        }

        @Override
        public int getCount() {
            return itemName.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return itemName[position];
        }
    }
}
