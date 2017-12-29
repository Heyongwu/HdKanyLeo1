package com.video.Kanyleo.setting;


import com.video.Kanyleo.utils.OnNetListener;
import com.video.Kanyleo.bean.LoginBean;

/**
 * Created by 何永武 on 2017/11/14.
 */

public interface ILoginModel {
    public void Login(String account, String pwd, OnNetListener<LoginBean> onNetListener);
}
