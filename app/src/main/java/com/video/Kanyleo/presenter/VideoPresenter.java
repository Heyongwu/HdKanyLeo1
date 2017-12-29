package com.video.Kanyleo.presenter;

import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.model.IVideoModel;
import com.video.Kanyleo.model.VideoModel;
import com.video.Kanyleo.utils.OnNetListener;
import com.video.Kanyleo.view.IVideoView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by len on 2017/12/26.
 */

public class VideoPresenter {
    private static IVideoView iVideoView;
    private final IVideoModel iVideoModel;

    public VideoPresenter(IVideoView iVideoView) {
        this.iVideoView = iVideoView;
        iVideoModel = new VideoModel();
    }
    public void showVideo(){
        iVideoModel.showVideo(new OnNetListener<VoBean>() {
            @Override
            public void onSuccess(VoBean voBean) {
                List<VoBean.DataBeanX> databean = voBean.getData();
                List<VoBean.DataBeanX.DataBean> list = new ArrayList<>();
                for (int i = 0; i < databean.size(); i++) {
                    VoBean.DataBeanX dataBeanX = databean.get(i);
                    VoBean.DataBeanX.DataBean data = dataBeanX.getData();
                    list.add(data);
                }
                iVideoView.showSP(list);
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }
}
