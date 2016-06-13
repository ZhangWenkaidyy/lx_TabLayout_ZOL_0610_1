package com.kevin.administrator.lx_tablayout_zol_0610_1;

/**
 * Created by Administrator on 2016/6/10.
 {
 "doc_update_nums": "172",
 "list": [
 {
 "id": "5877189",
 "stitle": "曝新MacBook Pro渲染图 \"iPhone 7\"大亮",
 "sdate": "2016-06-10 20:09:03",
 "type": "0",
 "comment_num": 0,
 "url": "http://4g.zol.com.cn/587/5877189.html",
 "imgsrc": "http://2c.zol-img.com.cn/article/12_170x300/468/li1z3KVAKgAcU.jpg",
 "imgsrc2": "http://2c.zol-img.com.cn/article/12_440x330/468/li1z3KVAKgAcU.jpg"
 },


 */

public class MyInfo {
    public String getStitle() {
        return stitle;
    }

    public void setStitle(String stitle) {
        this.stitle = stitle;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public int getComment_num() {
        return comment_num;
    }

    public void setComment_num(int comment_num) {
        this.comment_num = comment_num;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    private String stitle;

    @Override
    public String toString() {
        return "MyInfo{" +
                "stitle='" + stitle + '\'' +
                ", sdate='" + sdate + '\'' +
                ", comment_num=" + comment_num +
                ", imgsrc='" + imgsrc + '\'' +
                '}';
    }

    private String sdate;
    private int comment_num;
    private String imgsrc;

}
