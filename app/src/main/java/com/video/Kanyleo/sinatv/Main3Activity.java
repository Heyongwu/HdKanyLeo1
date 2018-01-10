package com.video.Kanyleo.sinatv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.video.Kanyleo.R;
import com.video.Kanyleo.net.LiveMessage;
import com.video.Kanyleo.net.LiveMessage2;
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
        String url = intent.getStringExtra("url");
        String image = intent.getStringExtra("image");
        String fire = intent.getStringExtra("fire");
        String nickname = intent.getStringExtra("nickname");
        EventBus.getDefault().postSticky(new LiveMessage(url));
        EventBus.getDefault().postSticky(new LiveMessage2(image,fire,nickname));

//        EventBus.getDefault().postSticky(new LiveMessage2(image));

        ActionBar bar = getSupportActionBar();
        bar.hide();
        IjkFragment ijkFragment = new IjkFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flmain, ijkFragment).commit();
        new IjkDialogFragment().show(getSupportFragmentManager(),"DialogFragment");
    }
}
