package com.video.Kanyleo.model;

import com.video.Kanyleo.utils.ApiService;
import com.video.Kanyleo.utils.RetrofitManager;

import okhttp3.OkHttpClient;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by len on 2017/12/26.
 */

public class VodeoModel implements IVodeoModel {
    @Override
    public void getSP(int min_time,Observer observer) {
        OkHttpClient client=new OkHttpClient.Builder().build();
        RetrofitManager.getInstance(ApiService.HOST,client)
                .setCreate(ApiService.class).getSP(min_time)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(observer);
    }
}
