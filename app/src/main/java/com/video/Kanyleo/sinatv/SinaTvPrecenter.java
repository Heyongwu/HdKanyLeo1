package com.video.Kanyleo.sinatv;

import com.video.Kanyleo.bean.LiveBean2;
import com.video.Kanyleo.bean.LiveBean3;
import com.video.Kanyleo.utils.Api;
import com.video.Kanyleo.utils.OnNetListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yw_Ambition on 2018/1/2.
 */

public class SinaTvPrecenter {
    private ISinaTvActivity iSinaTvActivity;
    private  ISinaTvModel isinaTvModel;

    public SinaTvPrecenter(ISinaTvActivity iSinaTvActivity) {
        this.iSinaTvActivity = iSinaTvActivity;
        isinaTvModel = new SinaTvModel();
    }
    public void showBanner(int min){
        isinaTvModel.showBanner(new OnNetListener<LiveBean2>() {
            @Override
            public void onSuccess(LiveBean2 liveBean2) {
//                List<ExtraBean.BannerBean.BannersBean> banners = liveBean2.getBanner().getBanners();
//                List<ExtraBean.BannerBean.BannersBean> list = new ArrayList<>();
//                for (int i = 0; i <banners.size() ; i++) {
//                    ExtraBean.BannerBean.BannersBean bannersBean = banners.get(i);
//                    list.addAll(banners);
//                }
                List<String> img = new ArrayList<>();
                img.add(Api.s1);
                img.add(Api.s2);
                img.add(Api.s3);
                img.add(Api.s4);
                img.add(Api.s5);
                iSinaTvActivity.showBanner(img);
            }

            @Override
            public void onFailure(Exception e) {

            }
        },min);
    }
    public void shwoLive(int min){
        isinaTvModel.showLive(new OnNetListener<LiveBean3>() {
            @Override
            public void onSuccess(LiveBean3 liveBean1) {
                List<LiveBean3.DataBeanX> data = liveBean1.getData();
                List<LiveBean3.DataBeanX.DataBean.OwnerBean> list = new ArrayList<>();
                for (int i = 0; i < data.size(); i++) {
                    LiveBean3.DataBeanX.DataBean.OwnerBean owner = data.get(i).getData().getOwner();
                    list.add(owner);
                }
                iSinaTvActivity.showLive(list);
            }

            @Override
            public void onFailure(Exception e) {

            }
        },min);
    }
}
