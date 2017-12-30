package com.video.Kanyleo.net;

import com.video.Kanyleo.utils.Api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Yw_Ambition on 2017/12/29.
 */

public class RetrofitHelper {
    private static OkHttpClient okHttpClient;
    private static ApiService apiService;
    static {
        intiokHttpClient();
    }

    public static OkHttpClient intiokHttpClient() {
        if(okHttpClient == null){
            synchronized (RetrofitHelper.class){
                if(okHttpClient == null){
                    okHttpClient = new OkHttpClient.Builder()
                            .build();
                }
            }
        }
        return okHttpClient;
    }
    public static ApiService getServiceAPI(){
        if(apiService==null){
            synchronized (ApiService.class){
                if(apiService==null){
                    apiService=Oncreat(ApiService.class,Api.HOSTONE);
                }
            }
        }
        return apiService;
    }
    public static<T> T Oncreat(Class<T> tClass,String url){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        return retrofit.create(tClass);
    }
}
