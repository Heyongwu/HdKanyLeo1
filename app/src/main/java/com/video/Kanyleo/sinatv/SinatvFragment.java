package com.video.Kanyleo.sinatv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.bean.LiveBean3;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
/**
 * Created by len on 2017/12/26.
 */
public class SinatvFragment extends Fragment implements ISinaTvActivity {
    @BindView(R.id.sinatv_rlv)
    XRecyclerView sinatvRlv;
    Unbinder unbinder;
    private int min = 0;
    private Banner banner;
    private SinaTvPrecenter sinaTvPrecenter;

    private LinearLayout mLarge;
    private LinearLayout mSmall;

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
        adapter = new SinatvAdapter(getContext(), list);
        sinatvRlv.setAdapter(adapter);
        Banner banner = new Banner(getContext());
        adapter.addheader(banner);
        sinatvRlv.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                min++;
                ownerlist.clear();
                sinaTvPrecenter.shwoLive(min);
                adapter.notifyDataSetChanged();
                sinatvRlv.refreshComplete();
            }

            @Override
            public void onLoadMore() {
                min++;
                sinaTvPrecenter.shwoLive(min);
                adapter.notifyDataSetChanged();
                sinatvRlv.loadMoreComplete();
            }
        });

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
