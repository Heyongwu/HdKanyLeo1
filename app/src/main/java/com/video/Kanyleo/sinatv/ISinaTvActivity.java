package com.video.Kanyleo.sinatv;

import com.video.Kanyleo.bean.LiveBean3;

import java.util.List;

/**
 * Created by Yw_Ambition on 2018/1/2.
 */

public interface ISinaTvActivity {
    //banner
    void showBanner(List<String> list);
    void showLive(List<LiveBean3.DataBeanX.DataBean.OwnerBean> list);


}
