package com.video.Kanyleo.sinatv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.video.Kanyleo.R;

import butterknife.ButterKnife;

public class PlaySinatvActivity extends AppCompatActivity {
//    @BindView(R.id.ijvideo)
//    IjkVideoView ijvideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_sinatv);
        ButterKnife.bind(this);
//        Intent intent = getIntent();
//        String sss = intent.getStringExtra("sss");
//        IjkMediaPlayer.loadLibrariesOnce(null);
//        IjkMediaPlayer.native_profileBegin("libijkplayer.so");
//        AndroidMediaController controller = new AndroidMediaController(this, false);
//        ijvideo.setMediaController(controller);
//        ijvideo.setVideoURI(Uri.parse(sss));
//        ijvideo.start();


//        videoView = findViewById(R.id.videoView);
//        videoView.setVideoURI(Uri.parse(sss));
//        MediaController controller = new MediaController(this);
//        videoView.setMediaController(controller);
//        controller.setMediaPlayer(videoView);
//        videoView.start();
    }
}
