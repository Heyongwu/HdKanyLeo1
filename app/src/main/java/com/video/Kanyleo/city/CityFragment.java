package com.video.Kanyleo.city;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.bean.VoBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import tuesda.walker.circlerefresh.CircleRefreshLayout;


/**
 * Created by len on 2017/12/26.
 */

public class CityFragment extends Fragment implements ICityActivity{
    Unbinder unbinder;
    @BindView(R.id.city_rv)
    XRecyclerView cityRv;
    private List<VoBean.DataBeanX.DataBean> list;
    private int min = 0;
    private CityPresenter cityPresenter;
    private CityAdapter cityAdapter;
    private CircleRefreshLayout refreshLayout;
    private Button mStop;
    private Handler myHandler = new Handler()
    {
        //接收子线程的信息
        public void handleMessage(Message msg)
        {
            //根据接收的消息进行相关操作
            switch(msg.what){
                case 0:
                    refreshLayout.finishRefreshing();
                    break ;
            }


        }
    } ;
    private class MyRunnable implements Runnable
    {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                min++;
                cityPresenter.showCity(min);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = new Message() ;
            message.what = 0 ;
            myHandler.sendMessage(message) ;
        }
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.city, null);
        refreshLayout = view.findViewById(R.id.refresh_layout);
        cityPresenter = new CityPresenter(this);
        cityPresenter.showCity(min);
//        //允许刷新，加载更多
//        cityRv.setPullRefreshEnabled(true);
//        cityRv.setLoadingMoreEnabled(true);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void showCt(final List<VoBean.DataBeanX.DataBean> splist) {
        list = new ArrayList<>();
        list.addAll(splist);
        cityRv.setLayoutManager(new StaggeredGridLayoutManager(2,  StaggeredGridLayoutManager.VERTICAL));
        //调用Adapter展示数据，这个判断是为了不重复创建MyAdapter的对象
        cityAdapter = new CityAdapter(getContext(),splist);
        cityRv.setAdapter(cityAdapter);
        refreshLayout.setOnRefreshListener(
                new CircleRefreshLayout.OnCircleRefreshListener() {
                    @Override
                    public void refreshing() {
//                        // do something when refresh starts
                        splist.clear();
                        MyRunnable myRunnable = new MyRunnable() ;
                        new Thread(myRunnable).start();
                        cityAdapter.notifyDataSetChanged();

                    }

                    @Override
                    public void completeRefresh() {
                        Toast.makeText(getContext(),"刷新成功",Toast.LENGTH_SHORT).show();
                    }
                });
        cityRv.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {}
//
            @Override
            public void onLoadMore() {
//                min++;
                Toast.makeText(getContext(),"加载更多...."+min,Toast.LENGTH_SHORT).show();
                cityPresenter.showCity(min);
                cityAdapter.notifyDataSetChanged();
                cityRv.loadMoreComplete();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
