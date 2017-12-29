package com.video.Kanyleo.setting;

/**
 * Created by 何永武 on 2017/11/14.
 */

public interface IloginActivity {
    String getAccount();
    String getPwd();
    void show(String str);
    void ToRegister();
    void ToSend(int cid, String name);
}
