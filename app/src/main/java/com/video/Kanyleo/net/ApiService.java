package com.video.Kanyleo.net;

import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.utils.Api;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * Created by len on 2017/12/26.
 */

public interface ApiService {


    @GET(Api.VIDEO)
    Flowable<VoBean> getVideo();
}