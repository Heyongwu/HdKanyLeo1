package com.video.Kanyleo.sinatv;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.video.Kanyleo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.widget.media.AndroidMediaController;
import tv.danmaku.ijk.media.widget.media.IjkVideoView;

public class Main3Activity extends AppCompatActivity {

    @BindView(R.id.ijvideo)
    IjkVideoView ijvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String ss = intent.getStringExtra("ss");
        ActionBar bar = getSupportActionBar();
        bar.hide();
        IjkMediaPlayer.loadLibrariesOnce(null);
        IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        AndroidMediaController controller = new AndroidMediaController(this, false);
        ijvideo.setMediaController(controller);
        ijvideo.setVideoURI(Uri.parse(ss));
        ijvideo.start();

    }
    //    在生命周期中设置 暂停
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onPause() {
        super.onPause();
        ijvideo.pause();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        IjkMediaPlayer.native_profileEnd();
        finish();
    }
    @Override
    protected void onResume() {
        super.onResume();
        ijvideo.resume();
    }


}
