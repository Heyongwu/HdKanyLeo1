package com.video.Kanyleo.setting;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.video.Kanyleo.utils.CrashHandler;


public class ImgApp2 extends Application {
    public static SharedPreferences sp;
    public static SharedPreferences.Editor edit;
    private ImgApp2 instance;
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        sp = getSharedPreferences("UserID", Context.MODE_APPEND);
        edit = sp.edit();
//        instance = this;
//        ImageLoaderConfiguration build = new ImageLoaderConfiguration.Builder(this).build();
//        ImageLoader.getInstance().init(build);
//        CrashHandler handler = CrashHandler.getInstance();
//        handler.init(getApplicationContext()); //在Appliction里面设置我们的异常处理器为UncaughtExceptionHandler处理器
//        initImageloader();
    }
    public void initImageloader() {
        //配置参数
        // TODO Auto-generated method stub
        // 创建DisplayImageOptions对象
        ImageLoaderConfiguration config=ImageLoaderConfiguration.createDefault(this);
        //初始化ImageLosder并且使用以上默认配置
        ImageLoader.getInstance().init(config);
    }


}
