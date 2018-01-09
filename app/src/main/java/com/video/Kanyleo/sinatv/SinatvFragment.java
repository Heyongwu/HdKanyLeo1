package com.video.Kanyleo.sinatv;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.bean.LiveBean3;
import com.youth.banner.Banner;

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
public class SinatvFragment extends Fragment implements ISinaTvActivity{
    @BindView(R.id.sinatv_rlv)
    XRecyclerView sinatvRlv;
    Unbinder unbinder;
    private int min = 0;
    private Banner banner;
    private SinaTvPrecenter sinaTvPrecenter;

    private LinearLayout mLarge;
    private LinearLayout mSmall;
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
                sinaTvPrecenter.shwoLive(min);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message message = new Message() ;
            message.what = 0 ;
            myHandler.sendMessage(message) ;
        }
    }
    private LoadToast lt;
    List<LiveBean3.DataBeanX.DataBean.OwnerBean> ownerlist = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.sinatv, null);
        sinaTvPrecenter = new SinaTvPrecenter(this);
        mLarge = (LinearLayout) view.findViewById(R.id.large);
        mSmall = (LinearLayout) view.findViewById(R.id.small);
        sinaTvPrecenter.shwoLive(min);
        sinaTvPrecenter.showBanner(min);
        refreshLayout = view.findViewById(R.id.refresh_layout);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }
    @Override
    public void showBanner(List<String> list) {

    }
    @Override
    public void showLive(List<LiveBean3.DataBeanX.DataBean> list) {

         final SinatvAdapter adapter;
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        sinatvRlv.setLayoutManager(manager);
        mSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
                sinatvRlv.setLayoutManager(manager);
            }
        });
        mLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayoutManager manager = new LinearLayoutManager(getContext());
                sinatvRlv.setLayoutManager(manager);
            }
        });
//        LinearLayoutManager manager = new LinearLayoutManager(getContext());
//        sinatvRlv.setLayoutManager(manager);
        //            intent.putExtra("sss",dataBean.getStream_url().getRtmp_pull_url());

        adapter = new SinatvAdapter(getContext(), list);
        sinatvRlv.setAdapter(adapter);
        lt = new LoadToast(getContext());
        final List<String> flvlist = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            LiveBean3.DataBeanX.DataBean dataBean = list.get(i);
            String url = dataBean.getStream_url().getRtmp_pull_url();
            flvlist.add(url);
        }
        Banner banner = new Banner(getContext());
        adapter.addheader(banner);
        adapter.setOnItemClick(new SinatvAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position, String url) {
                Intent intent = new Intent(getContext(), Main3Activity.class);
                intent.putExtra("ss",url);
                startActivity(intent);
            }
        });

        refreshLayout.setOnRefreshListener(
                new CircleRefreshLayout.OnCircleRefreshListener() {
                    @Override
                    public void refreshing() {
//                        // do something when refresh starts
                        ownerlist.clear();
                        MyRunnable myRunnable = new MyRunnable() ;
                        new Thread(myRunnable).start();
                        adapter.notifyDataSetChanged();
//                        Toast.makeText(getContext(), "xiala", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void completeRefresh() {
                        // do something when refresh complete
                        min++;

//                        videoPresenter.showVideo(min);
//                        videoAdapter.notifyDataSetChanged();
//                        rv.loadMoreComplete();

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
//                        lt.success();
                            }
                        }, 1000);//3秒后执行Runnable中的run方法

                    }
                });
        sinatvRlv.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {}
            @Override
            public void onLoadMore() {

                new Handler().postDelayed(new Runnable(){

                    public void run() {
                        min++;
                        sinaTvPrecenter.shwoLive(min);
                        adapter.notifyDataSetChanged();
                        sinatvRlv.loadMoreComplete();

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
