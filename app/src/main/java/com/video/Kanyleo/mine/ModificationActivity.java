package com.video.Kanyleo.mine;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.video.Kanyleo.R;
import com.video.Kanyleo.setting.ImgApp2;
import com.video.Kanyleo.PrimaryActivity;

public class ModificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modification);
        //隐藏标题栏
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        TextView tui = findViewById(R.id.my_tui);
        ImageView tui02 = findViewById(R.id.my_back2);
        tui02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //    通过AlertDialog.Builder这个类来实例化我们的一个AlertDialog的对象
                AlertDialog.Builder builder = new AlertDialog.Builder(ModificationActivity.this);
                //    设置Title的内容
                builder.setTitle("退出操作");
                //    设置Content来显示一个信息
                builder.setMessage("确定退出登录吗？");
                //    设置一个PositiveButton
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        ImgApp2.edit.putBoolean("isLogin",false);
                        ImgApp2.edit.commit();
                        Intent intent = new Intent(ModificationActivity.this, PrimaryActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
                //    设置一个NegativeButton
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(ModificationActivity.this, "您取消了删除" + which, Toast.LENGTH_SHORT).show();
                    }
                });
                //    设置一个NeutralButton
                builder.setNeutralButton("忽略", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(ModificationActivity.this, "您忽略了该操作" + which, Toast.LENGTH_SHORT).show();
                    }
                });
                //    显示出该对话框
                builder.show();
            }
        });
    }
}
