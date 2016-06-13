package com.kevin.administrator.lx_tablayout_zol_0610_1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * Created by Administrator on 2016/6/10.
 */
public class Mypageradapter extends FragmentPagerAdapter {
    private List<Fragment> list;
private String[] title={"头条",
    "新闻",
    "评测",
    "手机",
    "数码",
    "攒机",
   "外设",
    "导购",
  "热榜"};
    public Mypageradapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        Log.i("tag", "----position" + position);
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {

        return title[position];
    }
}
