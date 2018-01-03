package com.video.Kanyleo.net;

import com.video.Kanyleo.bean.CityBean;
import com.video.Kanyleo.bean.LiveBean2;
import com.video.Kanyleo.bean.LiveBean3;
import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.utils.Api;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by len on 2017/12/26.
 */

public interface ApiService {

    @GET(Api.VIDEO)
    Flowable<VoBean> getVideo(@Query("min_time") int min);
    @GET(Api.CITY)
    Flowable<CityBean> getCity(@Query("min_time") int min);
    @GET(Api.LIVE)
    Flowable<LiveBean3> getLive(@Query("min_time") int min);
    @GET(Api.LIVE)
    Flowable<LiveBean2> getbeanner(@Query("min_time") int min);
}
