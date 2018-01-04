package com.video.Kanyleo.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.video.Kanyleo.R;
import com.video.Kanyleo.video.VideoFragment;


/**
 * Created by len on 2017/12/26.
 */

public class NewsFragment extends Fragment {
    private TabLayout mTb01;
    private ViewPager mVp01;
    String[] itemName01 = {"八卦","消息"};
    TbAdapter01 tbAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getContext(), R.layout.news,null);
        mTb01 = (TabLayout) view.findViewById(R.id.tb01);
        mVp01 = (ViewPager) view.findViewById(R.id.vp01);
        tbAdapter=new TbAdapter01(getActivity().getSupportFragmentManager());
        mTb01.setupWithViewPager(mVp01);
        mVp01.setAdapter(tbAdapter);
        return view;
    }
    class TbAdapter01 extends FragmentPagerAdapter {


        public TbAdapter01(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                //注意：activity中导入的包必须和碎片一致 v4包
                case 0:
                    return new GossipFragment();
                case 1:
                    return new NewsFragment();
            }
            return new VideoFragment();
        }

        @Override
        public int getCount() {
            return itemName01.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return itemName01[position];
        }
    }
}
