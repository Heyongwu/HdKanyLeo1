package com.video.Kanyleo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CompileActivity extends AppCompatActivity {

    private EditText name;
    private TextView bao;
    private Intent intent;
    private EditText geqian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compile);
        //隐藏标题栏
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        geqian = findViewById(R.id.geqian);
        name = findViewById(R.id.bian_name);
        bao = findViewById(R.id.baocun);
        ImageView back = findViewById(R.id.my_back3);
        intent = new Intent();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = CompileActivity.this.name.getText().toString();
                String geqians = CompileActivity.this.geqian.getText().toString();
                intent.putExtra("geqian",geqians);
                intent.putExtra("name",names);
                setResult(2,intent);
                CompileActivity.this.finish();
            }
        });

    }
}
