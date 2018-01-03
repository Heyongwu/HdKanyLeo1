package com.video.Kanyleo.sinatv;

import com.video.Kanyleo.bean.LiveBean1;
import com.video.Kanyleo.bean.LiveBean2;
import com.video.Kanyleo.net.ApiService;
import com.video.Kanyleo.net.RetrofitHelper;
import com.video.Kanyleo.utils.OnNetListener;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Yw_Ambition on 2018/1/2.
 */

public class SinaTvModel implements ISinaTvModel {
    @Override
    public void showBanner(final OnNetListener<LiveBean2> onNetListener, int min) {
        ApiService serviceAPI = RetrofitHelper.getServiceAPI();
        Flowable<LiveBean2> getbeanner = serviceAPI.getbeanner(min);
        getbeanner.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<LiveBean2>() {
                    @Override
                    public void accept(LiveBean2 cityBean) throws Exception {

                        onNetListener.onSuccess(cityBean);
                    }
                });
    }


    @Override
    public void showLive(OnNetListener<LiveBean1> onNetListener, int min) {

    }
}
