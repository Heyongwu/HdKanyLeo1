package com.video.Kanyleo.sinatv;

import com.video.Kanyleo.bean.ExtraBean;

import com.video.Kanyleo.utils.OnNetListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yw_Ambition on 2018/1/2.
 */

public class SinaTvPrecenter {
    private ISinaTvActivity iSinaTvActivity;
    private final ISinaTvModel isinaTvModel;

    public SinaTvPrecenter(ISinaTvActivity iSinaTvActivity) {
        this.iSinaTvActivity = iSinaTvActivity;
        isinaTvModel = new SinaTvModel();
    }
    public void showBanner(int min){
        isinaTvModel.showBanner(new OnNetListener<ExtraBean>() {
            @Override
            public void onSuccess(ExtraBean liveBean2) {
                List<ExtraBean.BannerBean.BannersBean> banners = liveBean2.getBanner().getBanners();
                List<String> lists = new ArrayList<>();
                for (int i = 0; i <banners.size() ; i++) {
                    List<String> list = banners.get(i).getUrl_list();
                    lists.addAll(list);
                }
                iSinaTvActivity.showBanner(lists);
            }

            @Override
            public void onFailure(Exception e) {

            }
        },min);
    }
}
