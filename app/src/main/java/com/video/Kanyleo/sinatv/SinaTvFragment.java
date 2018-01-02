package com.video.Kanyleo.sinatv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.video.Kanyleo.R;

import java.util.List;


/**
 * Created by len on 2017/12/26.
 */

public class SinaTvFragment extends Fragment implements ISinaTvActivity{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getContext(), R.layout.sinatv,null);

        return view;
    }

    @Override
    public void showBanner(List<String> list) {
        String s = list.get(0);
        String s1 = list.get(1);
        String s2 = list.get(2);
        String s3 = list.get(3);
        String s4 = list.get(4);

    }
}
