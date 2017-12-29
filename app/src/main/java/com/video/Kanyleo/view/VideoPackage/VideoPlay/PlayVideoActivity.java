package com.video.Kanyleo.view.VideoPackage.VideoPlay;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import com.video.Kanyleo.R;

public class PlayVideoActivity extends AppCompatActivity {
    private  VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);
        Intent intent = getIntent();
        String ss = intent.getStringExtra("ss");
        videoView =  findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse(ss));
//        MediaController controller = new MediaController(this);
//        videoView.setMediaController(controller);
//        controller.setMediaPlayer(videoView);
        videoView.start();

    }
}
