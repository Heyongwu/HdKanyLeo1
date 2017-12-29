package com.video.Kanyleo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.adapter.VideoAdapter;
import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.presenter.VideoPresenter;
import com.video.Kanyleo.view.IVideoView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by len on 2017/12/26.
 */

public class VideoFragment extends Fragment implements IVideoView {
    @BindView(R.id.rv)
    XRecyclerView rv;
    Unbinder unbinder;
    private View view;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.sp, null);
        new VideoPresenter(this).showVideo();
        unbinder = ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void showSP(List<VoBean.DataBeanX.DataBean> splist) {
        rv.setLayoutManager(new GridLayoutManager(getContext(),2));
        VideoAdapter videoAdapter = new VideoAdapter(getContext(),splist);
        rv.setAdapter(videoAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
