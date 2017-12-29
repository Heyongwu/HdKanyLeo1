package com.video.Kanyleo.utils;

import android.os.Environment;
import android.os.Handler;

import java.io.File;
import java.security.MessageDigest;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by yfeng on 2017/10/12.
 */

public class OkHttpUtils {
    private Handler handler = new Handler();
    public Handler getHandler(){
        return handler;
    }
    //单例
    private static OkHttpUtils okHttpUtils = new OkHttpUtils();
    private OkHttpUtils(){};
    public static OkHttpUtils getInstance(){
        return okHttpUtils;
    }

    private OkHttpClient client;
    private void initOkHttpClient(){

        if(client == null){
            File file = new File(Environment.getExternalStorageDirectory()+"/cache");
            if(!file.exists()){
                file.mkdirs();
            }


            client = new OkHttpClient.Builder()
                    .connectTimeout(8, TimeUnit.SECONDS)
                    .writeTimeout(8,TimeUnit.SECONDS)
                    .readTimeout(8, TimeUnit.SECONDS)
                    //参数1：缓存文件
                    //设置最大的缓存大小  如果超出  则会使用LRU算法进行替换
                    .cache(new Cache(file, 1024*1024*10))
                    .build();
        }
    }

    //公用的get请求方法  完成的功能不确定
    public void doGet(String url, Callback callback){
        initOkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    //公用的get请求方法  完成的功能不确定
    public void doPost(String url, Callback callback){
        initOkHttpClient();

        RequestBody body = new FormBody.Builder()
                .add("userId", "1234")//添加键值对
                .add("name", "4321")
                .add("portraitUri", "")
                .build();
        String nonce = new Random().nextInt(10000) + "";
        String timestamp = System.currentTimeMillis() + "";
        String secret = "7BEEC8zOomS4v";
        Request request = new Request.Builder()
                .addHeader("App-Key","82hegw5u8db2x")
                .addHeader("Nonce",nonce)
                .addHeader("Timestamp",timestamp)
                .addHeader("Signature",getSha1(secret + nonce + timestamp))
                .addHeader("Content-Type","application/x-www-form-urlencoded")
                .url(url).post(body).build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    public static String getSha1(String str){
        if(str==null||str.length()==0){
            return null;
        }
        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9',
                'a','b','c','d','e','f'};
        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));

            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j*2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

}
