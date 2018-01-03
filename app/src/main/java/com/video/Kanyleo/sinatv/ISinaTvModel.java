package com.video.Kanyleo.sinatv;

import com.video.Kanyleo.bean.LiveBean2;
import com.video.Kanyleo.bean.LiveBean3;
import com.video.Kanyleo.utils.OnNetListener;

/**
 * Created by Yw_Ambition on 2018/1/2.
 */

public interface ISinaTvModel {
    void showBanner(OnNetListener<LiveBean2> onNetListener, int min);
    void showLive(OnNetListener<LiveBean3> onNetListener, int min);
}
