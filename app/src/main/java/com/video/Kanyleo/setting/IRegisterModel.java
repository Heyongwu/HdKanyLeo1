package com.video.Kanyleo.setting;


import com.video.Kanyleo.utils.OnNetListener;
import com.video.Kanyleo.bean.LoginBean;

/**
 * Created by 何永武 on 2017/11/15.
 */

public interface IRegisterModel {
    public void register(String account, String pwd, OnNetListener<LoginBean> onNetListener);
}
