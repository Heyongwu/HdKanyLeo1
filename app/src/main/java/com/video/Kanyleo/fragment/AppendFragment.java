package com.video.Kanyleo.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.video.Kanyleo.R;

import java.io.File;


/**
 * Created by len on 2017/12/26.
 */

public class AppendFragment extends Fragment {
    private String path= Environment.getExternalStorageDirectory()+"/xixi.png";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getContext(), R.layout.add,null);
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(path)));
        startActivityForResult(intent, 2000);
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //2.得到返回来图片的路径拿到照片 进行剪裁
        if(requestCode==2000&&resultCode==getActivity().RESULT_OK){
            //调取系统的裁剪功能
            Intent intent = new Intent("com.android.camera.action.CROP");
            //得到图片，并设置图片的类型
            intent.setDataAndType(Uri.fromFile(new File(path)), "image/*");
            //设置是否支持裁剪
            intent.putExtra("crop", true);
            //设置剪裁的比例
            intent.putExtra("aspectX", 1);
            intent.putExtra("aspectY", 1);
            //设置图片输出的大小
            intent.putExtra("outputX", 250);
            intent.putExtra("outputY", 250);
            //是否支持人脸识别
            intent.putExtra("onFaceDetection", false);
            //将剪裁好的照片返回给data
            intent.putExtra("return-data", true);
            startActivityForResult(intent, 3000);
        }
    }
}
