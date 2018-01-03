package com.video.Kanyleo.fragment;

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
import com.video.Kanyleo.city.CityFragment;
import com.video.Kanyleo.sinatv.SinatvFragment;
import com.video.Kanyleo.video.VideoFragment;


/**
 * Created by len on 2017/12/26.
 */

public class HomeFragment extends Fragment {
    private TabLayout mLtb;
    private ViewPager mLvp;
    String[] itemName = {"直播","视频","同城"};
    TbLoginAdapter tbLoginAdapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=View.inflate(getContext(), R.layout.home,null);
        initView();
        tbLoginAdapter=new TbLoginAdapter(getChildFragmentManager());
        mLtb.setupWithViewPager(mLvp);
        mLvp.setAdapter(tbLoginAdapter);
        return view;
    }
    private void initView() {
        mLtb = view.findViewById(R.id.ltb);
        mLvp = view.findViewById(R.id.lvp);
    }
    class TbLoginAdapter extends FragmentPagerAdapter {

        public TbLoginAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                //注意：activity中导入的包必须和碎片一致 v4包
                case 0:
                    return new SinatvFragment();
                case 1:
                    return new VideoFragment();
                case 2:
                    return new CityFragment();
            }
            return new VideoFragment();
        }

        @Override
        public int getCount() {
            return itemName.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return itemName[position];
        }
    }
}
