package com.video.Kanyleo.video;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.view.IVideoView;

import net.steamcrafted.loadtoast.LoadToast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import tuesda.walker.circlerefresh.CircleRefreshLayout;


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
    private LoadToast lt;
    private ViewGroup root;

    private class MyRunnable implements Runnable
    {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                min++;
                videoPresenter.showVideo(min);

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
        view = View.inflate(getContext(), R.layout.sp, null);
        refreshLayout = view.findViewById(R.id.refresh_layout);
        root =
                (ViewGroup) view.findViewById(android.R.id.content);
        lt = new LoadToast(getContext());
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

        refreshLayout.setOnRefreshListener(
                new CircleRefreshLayout.OnCircleRefreshListener() {
                    @Override
                    public void refreshing() {
//                        // do something when refresh starts
                        splist.clear();
                        MyRunnable myRunnable = new MyRunnable() ;
                        new Thread(myRunnable).start();
                        videoAdapter.notifyDataSetChanged();

//                        Toast.makeText(getContext(), "xiala", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void completeRefresh() {
                        // do something when refresh complete
                        min++;
//                        Toast.makeText(getContext(),"刷新成功",Toast.LENGTH_SHORT).show();
                        lt.setText("刷新成功");
                        lt.show();
                        lt.setBorderColor(getContext().getResources().getColor(R.color.paleturquoise));
                        lt.setProgressColor(getContext().getResources().getColor(R.color.mediumpurple));
//                        videoPresenter.showVideo(min);
//                        videoAdapter.notifyDataSetChanged();
//                        rv.loadMoreComplete();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                /**
                                 *要执行的操作
                                 */
                                lt.hide();
                            }
                        }, 1000);//3秒后执行Runnable中的run方法

                    }
                });
        rv.setLoadingListener(new XRecyclerView.LoadingListener() {

            @Override
            public void onRefresh() {

            }

            @Override
            public void onLoadMore() {
                new Handler().postDelayed(new Runnable(){

                    public void run() {

                        min++;

                        videoPresenter.showVideo(min);
                        videoAdapter.notifyDataSetChanged();
                        rv.loadMoreComplete();

                    }

                }, 1000);
                lt.setText("加载更多");
                lt.show();
                lt.setBorderColor(getContext().getResources().getColor(R.color.paleturquoise));
                lt.setProgressColor(getContext().getResources().getColor(R.color.mediumpurple));
//                        videoPresenter.showVideo(min);
//                        videoAdapter.notifyDataSetChanged();
//                        rv.loadMoreComplete();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        /**
                         *要执行的操作
                         */
                        lt.hide();
//                        lt.success();
                    }
                }, 1000);//3秒后执行Runnable中的run方法
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
