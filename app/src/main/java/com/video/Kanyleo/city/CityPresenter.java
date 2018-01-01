package com.video.Kanyleo.city;

import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.utils.OnNetListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yw_Ambition on 2018/1/1.
 */

public class CityPresenter {
    private ICityActivity iCityActivity;
    private final ICityModel icityModel;

    public CityPresenter(ICityActivity iCityActivity) {
        this.iCityActivity = iCityActivity;
        icityModel = new CityModel();
    }
    public void showCity(int min){
        icityModel.showCity(new OnNetListener<VoBean>() {
            @Override
            public void onSuccess(VoBean cityBean) {
                List<VoBean.DataBeanX> databean = cityBean.getData();
                List<VoBean.DataBeanX.DataBean> list = new ArrayList<>();
                for (int i = 0; i < databean.size(); i++) {
                    VoBean.DataBeanX dataBeanX = databean.get(i);
                    VoBean.DataBeanX.DataBean data = dataBeanX.getData();
                    list.add(data);
                }
                iCityActivity.showCt(list);
            }

            @Override
            public void onFailure(Exception e) {

            }
        },min);
    }
}
