package com.video.Kanyleo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CompileActivity extends AppCompatActivity {

    private EditText name;
    private TextView bao;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compile);
        name = findViewById(R.id.bian_name);
        bao = findViewById(R.id.baocun);
        intent = new Intent();
        bao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = CompileActivity.this.name.getText().toString();
                intent.putExtra("name",names);
                setResult(2,intent);
                CompileActivity.this.finish();
            }
        });

    }
}
