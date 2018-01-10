package com.video.Kanyleo.sinatv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.video.Kanyleo.R;
import com.video.Kanyleo.net.LiveMessage;
import com.video.Kanyleo.sinatv.ijk.IjkDialogFragment;
import com.video.Kanyleo.sinatv.ijk.IjkFragment;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;


public class Main3Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String ss = intent.getStringExtra("ss");
        EventBus.getDefault().postSticky(new LiveMessage(ss));
        ActionBar bar = getSupportActionBar();
        bar.hide();
        IjkFragment ijkFragment = new IjkFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flmain, ijkFragment).commit();
        new IjkDialogFragment().show(getSupportFragmentManager(),"DialogFragment");
    }
}
