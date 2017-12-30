package com.video.Kanyleo.model;

import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.utils.OnNetListener;

/**
 * Created by len on 2017/12/26.
 */

public interface IVideoModel {
    void showVideo(OnNetListener<VoBean> onNetListener,int min);
}
