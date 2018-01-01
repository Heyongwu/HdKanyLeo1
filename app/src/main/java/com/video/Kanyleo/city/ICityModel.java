package com.video.Kanyleo.city;

import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.utils.OnNetListener;

/**
 * Created by Yw_Ambition on 2018/1/1.
 */

public interface ICityModel {
    void showCity(OnNetListener<VoBean> onNetListener, int min);
}
