package com.video.Kanyleo.setting;

import com.google.gson.Gson;
import com.video.Kanyleo.bean.LoginBean;
import com.video.Kanyleo.utils.Api;
import com.video.Kanyleo.utils.HttpUtils;
import com.video.Kanyleo.utils.OnNetListener;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by 何永武 on 2017/11/15.
 */

public class RegisterModel extends BeasModel implements IRegisterModel {
    @Override
    public void register(String account, String pwd, final OnNetListener<LoginBean> onNetListener) {
        Map<String,String> params = new HashMap<>();
        params.put("mobile",account);
        params.put("password",pwd);
        HttpUtils.getHttpUtils().doPost(Api.REGISTER, params, new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        onNetListener.onFailure(e);
                    }
                });
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                 final LoginBean loginBean = new Gson().fromJson(string, LoginBean.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        onNetListener.onSuccess(loginBean);
                    }
                });
            }
        });
    }
}
