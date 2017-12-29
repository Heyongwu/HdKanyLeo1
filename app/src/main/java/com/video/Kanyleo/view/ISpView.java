package com.video.Kanyleo.view;

import com.video.Kanyleo.bean.Sp_Bean;

import java.util.List;

/**
 * Created by len on 2017/12/26.
 */

public interface ISpView {
    public void showSP(List<Sp_Bean.DataBeanX.DataBean> splist);
    public int getTime();
}
