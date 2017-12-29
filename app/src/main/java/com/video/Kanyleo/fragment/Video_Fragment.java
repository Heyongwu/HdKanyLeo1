package com.video.Kanyleo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.adapter.VideoAdapter;
import com.video.Kanyleo.bean.Sp_Bean;
import com.video.Kanyleo.presenter.VodeoPresenter;
import com.video.Kanyleo.view.ISpView;

import java.util.List;

/**
 * Created by len on 2017/12/26.
 */

public class Video_Fragment extends Fragment implements ISpView {
    private View view;
    private XRecyclerView mRv;
    VideoAdapter spAdapter;
    VodeoPresenter spPresenter;
    int min_time=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.sp, null);
        initView();
        spPresenter=new VodeoPresenter(this);
        spPresenter.spData(min_time);
        return view;
    }

    private void initView() {
        mRv = (XRecyclerView) view.findViewById(R.id.rv);
    }

    @Override
    public void showSP(List<Sp_Bean.DataBeanX.DataBean> splist) {
        GridLayoutManager manager=new GridLayoutManager(getContext(),2);
        mRv.setLayoutManager(manager);
        spAdapter=new VideoAdapter(getContext(),splist);
        mRv.setAdapter(spAdapter);
        mRv.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                spPresenter.spData(min_time);
                min_time++;
                spAdapter.notifyDataSetChanged();
                mRv.refreshComplete();

            }

            @Override
            public void onLoadMore() {

                min_time++;
                spPresenter.spData(min_time);
                mRv.loadMoreComplete();
            }
        });
    }

    @Override
    public int getTime() {
        Log.i("111111",""+min_time);
        return min_time;
    }
}
