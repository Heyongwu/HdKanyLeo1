package com.video.Kanyleo.sinatv;

import com.video.Kanyleo.bean.ExtraBean;
import com.video.Kanyleo.bean.LiveBean1;
import com.video.Kanyleo.utils.OnNetListener;

/**
 * Created by Yw_Ambition on 2018/1/2.
 */

public interface ISinaTvModel {
    void showBanner(OnNetListener<ExtraBean> onNetListener, int min);
    void showLive(OnNetListener<LiveBean1> onNetListener, int min);
}