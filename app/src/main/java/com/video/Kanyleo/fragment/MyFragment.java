package com.video.Kanyleo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.video.Kanyleo.CompileActivity;
import com.video.Kanyleo.ModificationActivity;
import com.video.Kanyleo.R;


/**
 * Created by len on 2017/12/26.
 */

public class MyFragment extends Fragment {

    private TextView name;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getContext(), R.layout.wd,null);
        ImageView compile = view.findViewById(R.id.iv_compile);
        ImageView she = view.findViewById(R.id.shezhi);
        name = view.findViewById(R.id.name);
        compile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CompileActivity.class);
                startActivityForResult(intent, 1);
            }
        });
        she.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ModificationActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==2){
            String names = data.getStringExtra("name");
            name.setText(names);

        }
    }
}
