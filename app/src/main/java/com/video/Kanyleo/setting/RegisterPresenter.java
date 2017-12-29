package com.video.Kanyleo.setting;


import com.video.Kanyleo.utils.OnNetListener;
import com.video.Kanyleo.bean.LoginBean;

;

/**
 * Created by 何永武 on 2017/11/15.
 */

public class RegisterPresenter {
    private static IRegisterActivity iRegisterActivity;
    private final IRegisterModel iregisterModel;

    public RegisterPresenter(IRegisterActivity iRegisterActivity) {
        this.iRegisterActivity = iRegisterActivity;
        iregisterModel = new RegisterModel();
    }
    public void register(){
        String account = iRegisterActivity.getAccount();
        String pwd = iRegisterActivity.getPwd();
        iregisterModel.register(account, pwd, new OnNetListener<LoginBean>() {
            @Override
            public void onSuccess(LoginBean loginBean) {
                iRegisterActivity.show(loginBean.getMsg());
                iRegisterActivity.ToLogin();
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }
}
