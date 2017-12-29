package com.video.Kanyleo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.video.Kanyleo.ModificationActivity;
import com.video.Kanyleo.R;


/**
 * Created by len on 2017/12/26.
 */

public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getContext(), R.layout.wd,null);
        ImageView compile = view.findViewById(R.id.iv_compile);
        ImageView she = view.findViewById(R.id.shezhi);
        compile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        she.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ModificationActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }
}
