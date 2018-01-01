package com.video.Kanyleo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.video.VideoAdapter;
import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.video.VideoPresenter;
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
        //允许刷新，加载更多
        rv.setPullRefreshEnabled(true);
        rv.setLoadingMoreEnabled(true);
        return view;
    }




    @Override
    public void showSP(final List<VoBean.DataBeanX.DataBean> splist) {
        list = new ArrayList<>();
        list.addAll(splist);
        rv.setLayoutManager(new GridLayoutManager(getContext(),2));
        //调用Adapter展示数据，这个判断是为了不重复创建MyAdapter的对象

            videoAdapter = new VideoAdapter(getContext(),splist);
            rv.setAdapter(videoAdapter);

        rv.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                splist.clear();
                min++;
                videoPresenter.showVideo(min+1);

                videoAdapter.notifyDataSetChanged();
                rv.refreshComplete();

            }

            @Override
            public void onLoadMore() {
                min++;
                Toast.makeText(getContext(),"加载更多...."+min,Toast.LENGTH_SHORT).show();
                videoPresenter.showVideo(min);
                videoAdapter.notifyDataSetChanged();

//                rv.loadMoreComplete();
            }
        });





    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
