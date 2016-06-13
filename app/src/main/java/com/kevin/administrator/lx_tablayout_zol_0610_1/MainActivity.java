package com.kevin.administrator.lx_tablayout_zol_0610_1;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Context mContext = this;
    private TabLayout tabLayout_main;
    private ViewPager viewPager_main;
   private List<Fragment> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout_main = (TabLayout) findViewById(R.id.tabLayout_main);
        viewPager_main = (ViewPager) findViewById(R.id.viewPager_main);
        initTablayout();




    }

    private void initTablayout() {
        tabLayout_main.setTabTextColors(Color.BLUE, Color.GREEN);
        tabLayout_main.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout_main.setSelectedTabIndicatorHeight(10);
        tabLayout_main.setSelectedTabIndicatorColor(Color.RED);
       /* tabLayout_main.addTab(tabLayout_main.newTab().setText("头条"));
        tabLayout_main.addTab(tabLayout_main.newTab().setText("新闻"));
        tabLayout_main.addTab(tabLayout_main.newTab().setText("评测"));
        tabLayout_main.addTab(tabLayout_main.newTab().setText("手机"));
        tabLayout_main.addTab(tabLayout_main.newTab().setText("数码"));
        tabLayout_main.addTab(tabLayout_main.newTab().setText("攒机"));
        tabLayout_main.addTab(tabLayout_main.newTab().setText("外设"));
        tabLayout_main.addTab(tabLayout_main.newTab().setText("导购"));
        tabLayout_main.addTab(tabLayout_main.newTab().setText("热榜"));
       -------------------------冲突了，不能用--------------------------*/
        List<Fragment> list = new ArrayList<>();

        MyFragment fragment1 = new MyFragment(mContext);
        Bundle bundle = new Bundle();
        bundle.putInt("zwk", 0);
        fragment1.setArguments(bundle);

        MyFragment fragment2 = new MyFragment(mContext);
        bundle = new Bundle();
        bundle.putInt("zwk", 1);
        fragment2.setArguments(bundle);

        MyFragment fragment3 = new MyFragment(mContext);
        bundle = new Bundle();
        bundle.putInt("zwk", 2);
        fragment3.setArguments(bundle);

        MyFragment fragment4 = new MyFragment(mContext);
        bundle = new Bundle();
        bundle.putInt("zwk", 3);
        fragment4.setArguments(bundle);

        MyFragment fragment5 = new MyFragment(mContext);
        bundle = new Bundle();
        bundle.putInt("zwk", 4);
        fragment5.setArguments(bundle);

        MyFragment fragment6 = new MyFragment(mContext);
        bundle = new Bundle();
        bundle.putInt("zwk", 5);
        fragment6.setArguments(bundle);
        MyFragment fragment7 = new MyFragment(mContext);
        bundle = new Bundle();
        bundle.putInt("zwk", 6);
        fragment7.setArguments(bundle);
        MyFragment fragment8 = new MyFragment(mContext);
        bundle = new Bundle();
        bundle.putInt("zwk", 7);
        fragment8.setArguments(bundle);
        MyFragment fragment9 = new MyFragment(mContext);
        bundle = new Bundle();
        bundle.putInt("zwk", 8);
        fragment9.setArguments(bundle);
        list.add(fragment1);
        list.add(fragment2);
        list.add(fragment3);
        list.add(fragment4);
        list.add(fragment5);
        list.add(fragment6);
        list.add(fragment7);
        list.add(fragment8);
        list.add(fragment9);
        Mypageradapter adapater = new Mypageradapter(getSupportFragmentManager(), list);
        viewPager_main.setAdapter(adapater);
        //viewpager和tablayout相关联   只需要这一步就可实现相关联。必须在seradapter之后使用

        tabLayout_main.setupWithViewPager(viewPager_main);



       /* viewPager_main.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout_main) {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }
        });*/



 /* tabLayout_main.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
      @Override
      public void onTabSelected(TabLayout.Tab tab) {

          Toast.makeText(MainActivity.this, "tab"+tab.getText(), Toast.LENGTH_SHORT).show();
      }

      @Override
      public void onTabUnselected(TabLayout.Tab tab) {

      }

      @Override
      public void onTabReselected(TabLayout.Tab tab) {

      }
  });*/


    }


}
