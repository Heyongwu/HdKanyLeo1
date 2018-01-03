package com.video.Kanyleo.sinatv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.sinatv, null);
        sinaTvPrecenter = new SinaTvPrecenter(this);
        sinaTvPrecenter.shwoLive(min);
        sinaTvPrecenter.showBanner(min);

        banner = view.findViewById(R.id.banner);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void showBanner(List<String> list) {
        String s = list.get(0);
        String s1 = list.get(1);
        String s2 = list.get(2);
        String s3 = list.get(3);
        String s4 = list.get(4);
        banner.setImageLoader(new GlideImageLoader());
        List<String> img = new ArrayList<String>();
        img.add(s);
        img.add(s1);
        img.add(s2);
        img.add(s3);
        img.add(s4);
        banner.setImages(img);
        banner.start();
    }
    @Override
    public void showLive(List<LiveBean3.DataBeanX.DataBean.OwnerBean> list) {
        SinatvAdapter adapter = new SinatvAdapter(getContext(), list);
        sinatvRlv.setLayoutManager(new LinearLayoutManager(getContext()));
        sinatvRlv.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
