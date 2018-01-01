package com.video.Kanyleo.city;

import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.net.ApiService;
import com.video.Kanyleo.net.RetrofitHelper;
import com.video.Kanyleo.utils.OnNetListener;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Yw_Ambition on 2018/1/1.
 */

public class CityModel implements ICityModel{

    @Override
    public void showCity(final OnNetListener<VoBean> onNetListener, int min) {
        ApiService serviceAPI = RetrofitHelper.getServiceAPI();
        Flowable<VoBean> city = serviceAPI.getVideo(min);
        city.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<VoBean>() {
                    @Override
                    public void accept(VoBean cityBean) throws Exception {
                        onNetListener.onSuccess(cityBean);
                    }
                });

    }
}
