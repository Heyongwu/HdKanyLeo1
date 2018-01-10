package com.video.Kanyleo.sinatv.ijk;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dl7.player.media.IjkPlayerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.net.LiveMessage;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class IjkFragment extends Fragment {
    @BindView(R.id.ijvideo)
    IjkPlayerView ijvideo;
    private String uri;
    private Unbinder bind;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }
    @Subscribe(sticky = true)
    public void getMes(LiveMessage eventMessage) {
        uri = eventMessage.url;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_ijk,null);
        bind = ButterKnife.bind(this, view);
        ijvideo.init()
                .setVideoPath(uri)
                .setMediaQuality(IjkPlayerView.MEDIA_QUALITY_HIGH)
                .enableDanmaku()
                .start();
        return view;
    }


    //    在生命周期中设置 暂停
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onPause() {
        super.onPause();
        ijvideo.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        ijvideo.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bind.unbind();
        EventBus.getDefault().unregister(this);
    }
}
