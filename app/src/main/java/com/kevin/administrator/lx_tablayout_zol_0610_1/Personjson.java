package com.kevin.administrator.lx_tablayout_zol_0610_1;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * {
 * "doc_update_nums": "172",
 * "list": [
 * {
 * "id": "5877189",
 * "stitle": "曝新MacBook Pro渲染图 \"iPhone 7\"大亮",
 * "sdate": "2016-06-10 20:09:03",
 * "type": "0",
 * "comment_num": 0,
 * "url": "http://4g.zol.com.cn/587/5877189.html",
 * "imgsrc": "http://2c.zol-img.com.cn/article/12_170x300/468/li1z3KVAKgAcU.jpg",
 * "imgsrc2": "http://2c.zol-img.com.cn/article/12_440x330/468/li1z3KVAKgAcU.jpg"
 * },
 * Created by Administrator on 2016/5/31.
 */
public class Personjson {
    public static List<MyInfo> paserJsonToList(String jsonString) {
        List<MyInfo> list = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray jsonArray = jsonObject.getJSONArray("list");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jo = jsonArray.getJSONObject(i);
                String stitle = jo.getString("stitle");
                String sdate = jo.getString("sdate");
                String imgsrc = jo.getString("imgsrc2");
                int comment_num = jo.getInt("comment_num");

                MyInfo info = new MyInfo();
                info.setComment_num(comment_num);
                info.setImgsrc(imgsrc);
                info.setSdate(sdate);
                info.setStitle(stitle);
                list.add(info);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}