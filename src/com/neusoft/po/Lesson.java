package com.neusoft.po;

import java.util.Date;

public class Lesson {

	private int lid;
	private String lname;
	private String imgurl;
	private double lprice;
	private String ldesc;
	private String category;
	private int qid;
	private Date datetime;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public double getLprice() {
		return lprice;
	}
	public void setLprice(double lprice) {
		this.lprice = lprice;
	}
	public String getLdesc() {
		return ldesc;
	}
	public void setLdesc(String ldesc) {
		this.ldesc = ldesc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "Lesson [lid=" + lid + ", lname=" + lname + ", imgurl=" + imgurl + ", lprice=" + lprice + ", ldesc="
				+ ldesc + ", category=" + category + ", qid=" + qid + ", datetime=" + datetime + "]";
	}
	
}
