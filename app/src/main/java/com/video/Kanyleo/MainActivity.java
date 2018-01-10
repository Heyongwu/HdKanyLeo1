package com.video.Kanyleo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.video.Kanyleo.setting.ImgApp2;

public class MainActivity extends AppCompatActivity {
    int time=2;
    SharedPreferences sp;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //隐藏标题栏
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        final boolean isLogin = ImgApp2.sp.getBoolean("isLogin", false);
        sp=getSharedPreferences("UserID",MODE_PRIVATE);
        final boolean flag = sp.getBoolean("UserID", false);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                time--;
                if(isLogin==true) {
                    Intent intent = new Intent(MainActivity.this, LoginNRActivity.class);
                    startActivity(intent);
                    finish();
                    return ;
                }else if(isLogin==false){
                    Intent intent = new Intent(MainActivity.this, PrimaryActivity.class);
                    startActivity(intent);
                    finish();
                    return;
                }
                handler.postDelayed(this,1000);
            }
        },1000);

    }

}
