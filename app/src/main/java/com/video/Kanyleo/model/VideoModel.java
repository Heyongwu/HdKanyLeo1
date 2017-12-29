package com.video.Kanyleo.model;

import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.net.ApiService;
import com.video.Kanyleo.net.RetrofitHelper;
import com.video.Kanyleo.utils.OnNetListener;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by len on 2017/12/26.
 */

public class VideoModel implements IVideoModel {

    @Override
    public void showVideo(final OnNetListener<VoBean> onNetListener) {
        ApiService serviceAPI = RetrofitHelper.getServiceAPI();
        Flowable<VoBean> video = serviceAPI.getVideo();
        video.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<VoBean>() {
                    @Override
                    public void accept(VoBean voBean) throws Exception {
                        onNetListener.onSuccess(voBean);
                    }
                });

    }

}