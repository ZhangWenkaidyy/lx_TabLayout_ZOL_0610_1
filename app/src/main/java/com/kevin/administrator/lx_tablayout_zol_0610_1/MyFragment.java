package com.kevin.administrator.lx_tablayout_zol_0610_1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/6/10.
 */
public class MyFragment extends Fragment {
    private ListView listView_fragment;
    private Context context;

    public MyFragment(Context context) {
        this.context = context;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_main, null);
        listView_fragment = (ListView) view.findViewById(R.id.listView_fragment);

        Bundle bundle = getArguments();
        int dex=bundle.getInt("zwk");
        switch (dex) {
            case 0:
                new MyAsynctask(context, listView_fragment).execute(UrlString.toutiao);
                break;
            case 1:
                new MyAsynctask(context, listView_fragment).execute(UrlString.xinwen);
                break;
            case 2:
                new MyAsynctask(context, listView_fragment).execute(UrlString.ceping);
                break;
            case 3:
                new MyAsynctask(context, listView_fragment).execute(UrlString.shouji);
                break;
            case 4:
                new MyAsynctask(context, listView_fragment).execute(UrlString.shuma);
                break;
            case 5:
                new MyAsynctask(context, listView_fragment).execute(UrlString.cuanji);
                break;
            case 6:
                new MyAsynctask(context, listView_fragment).execute(UrlString.waishe);
                break;
            case 7:
                new MyAsynctask(context, listView_fragment).execute(UrlString.daogou);
                break;
            case 8:
                new MyAsynctask(context, listView_fragment).execute(UrlString.rebang);


        }

        return view;
    }
}
