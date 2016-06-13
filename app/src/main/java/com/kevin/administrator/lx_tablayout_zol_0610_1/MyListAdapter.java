package com.kevin.administrator.lx_tablayout_zol_0610_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Administrator on 2016/6/10.
 */
public class MyListAdapter extends BaseAdapter {
    private List<MyInfo> list;
    private Context context;

    public MyListAdapter(List<MyInfo> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_fragment, null);
            mHolder = new ViewHolder();
            mHolder.textView_stitle = (TextView) convertView.findViewById(R.id.textView_stitle);
            mHolder.textView_sdate = (TextView) convertView.findViewById(R.id.textView_sdate);
            mHolder.textView_comment_num = (TextView) convertView.findViewById(R.id.textView_comment_num);
            mHolder.imageView_imgsrc2 = (ImageView) convertView.findViewById(R.id.imageView_imgsrc2);
            convertView.setTag(mHolder);
        } else {
            mHolder = (ViewHolder) convertView.getTag();
        }
        mHolder.textView_stitle.setText(list.get(position).getStitle() + "");
        mHolder.textView_sdate.setText(list.get(position).getSdate());
        mHolder.textView_comment_num.setText(list.get(position).getComment_num()+"");
        String imagePath = list.get(position).getImgsrc();
        Glide.with(context).load(imagePath).into(mHolder.imageView_imgsrc2);
        return convertView;
    }

    class ViewHolder {
        private TextView textView_stitle;
        private TextView textView_sdate;
        private TextView textView_comment_num;
        private ImageView imageView_imgsrc2;
    }


}
