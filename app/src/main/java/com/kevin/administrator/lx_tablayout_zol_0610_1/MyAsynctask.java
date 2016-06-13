package com.kevin.administrator.lx_tablayout_zol_0610_1;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import java.util.List;

/**
 * Created by Administrator on 2016/6/12.
 */
public class MyAsynctask extends AsyncTask<String,Void,List<MyInfo>> {
    private Context context;
    private ListView listView;
    private ProgressDialog progressDialog;
    public MyAsynctask(Context context,ListView listView) {
        this.context=context;
        this.listView=listView;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog=new ProgressDialog(context);
        progressDialog.setTitle("提示");
        progressDialog.setMessage("loading...");
        progressDialog.show();
    }

    @Override
    protected List<MyInfo> doInBackground(String... params) {
      byte[] bytes=Httputils.getHttpToResult(params[0]);
        String jsonString=new String(bytes,0,bytes.length);
        List<MyInfo> list=Personjson.paserJsonToList(jsonString);
        return list;
    }

    @Override
    protected void onPostExecute(List<MyInfo> myInfos) {
        super.onPostExecute(myInfos);
        MyListAdapter adapter=new MyListAdapter(myInfos,context);
        listView.setAdapter(adapter);
        progressDialog.dismiss();

    }
}
