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

import java.util.ArrayList;
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
    private int min = 0;
    private List<VoBean.DataBeanX.DataBean> list;
    private VideoAdapter videoAdapter;
    private VideoPresenter videoPresenter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.sp, null);
        videoPresenter = new VideoPresenter(this);
        videoPresenter.showVideo(min);
        unbinder = ButterKnife.bind(this, view);

        return view;
    }


    @Override
    public void showSP(final List<VoBean.DataBeanX.DataBean> splist) {
        list = new ArrayList<>();
        list.addAll(splist);
        rv.setLayoutManager(new GridLayoutManager(getContext(),2));
        //调用Adapter展示数据，这个判断是为了不重复创建MyAdapter的对象
        if (videoAdapter==null){
            videoAdapter = new VideoAdapter(getContext(),splist);
            rv.setAdapter(videoAdapter);
        }else {
            videoAdapter.notifyDataSetChanged();
        }
        rv.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                splist.clear();
                videoPresenter.showVideo(min);
                min++;
                videoAdapter.notifyDataSetChanged();
                rv.refreshComplete();

            }

            @Override
            public void onLoadMore() {
                videoPresenter.showVideo(min);
                min++;
                rv.loadMoreComplete();
            }
        });





    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
