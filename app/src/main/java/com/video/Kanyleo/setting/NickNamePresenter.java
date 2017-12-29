package com.video.Kanyleo.setting;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.video.Kanyleo.utils.AllBack;
import com.video.Kanyleo.bean.NickNamebean;
import com.video.Kanyleo.utils.OkHttp;

import java.util.HashMap;

/**
 * Created by Liu xiong biao on 2017/12/9.
 */

public class NickNamePresenter {
    private Context context;
    private NickNameView nicknameView;

    public NickNamePresenter(Context context, NickNameView nicknameView) {
        this.context = context;
        this.nicknameView = nicknameView;
    }

    public void Nicknames(HashMap<String,String> map){
        //                           //http://120.27.23.105/user/updateNickName
        OkHttp.getinstance().postData("http://120.27.23.105/user/updateNickName", map, new AllBack() {
            @Override
            public void onSuccess(String tag, Object o) {
                nicknameView.success(tag, o);
            }

            @Override
            public void onFailed(String tag, String e) {
                nicknameView.failed(tag, e);
            }
        },NickNamebean.class,"");
    }
    public boolean checkData(String name) {
        if(TextUtils.isEmpty(name)){
            Toast.makeText(context,"昵称不能为空",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

}
