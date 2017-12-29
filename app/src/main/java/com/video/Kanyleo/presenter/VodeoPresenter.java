package com.video.Kanyleo.presenter;

import android.util.Log;

import com.video.Kanyleo.bean.Sp_Bean;
import com.video.Kanyleo.model.VodeoModel;
import com.video.Kanyleo.view.ISpView;

import java.util.ArrayList;
import java.util.List;

import rx.Observer;

/**
 * Created by len on 2017/12/26.
 */

public class VodeoPresenter {
    ISpView view;
    VodeoModel model;
    List<Sp_Bean.DataBeanX.DataBean> splist=new ArrayList<>();

    public VodeoPresenter(ISpView view) {
        this.view = view;
        model=new VodeoModel();
    }
    public void spData(int min_time){
        min_time=view.getTime();
        model.getSP(min_time,new Observer<Sp_Bean>(){

            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.i("111111","onError()"+e.toString());
            }

            @Override
            public void onNext(Sp_Bean sp_bean) {
                for(int i=0;i<sp_bean.getData().size();i++){
                    splist.add(sp_bean.getData().get(i).getData());
                }
                view.showSP(splist);
                Log.i("111111","onNext()"+splist);
            }
        });
    }
}
