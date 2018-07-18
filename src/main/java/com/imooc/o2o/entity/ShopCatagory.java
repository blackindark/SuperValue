package com.imooc.o2o.entity;

import java.util.Date;

public class ShopCatagory {
	private Long shopCatagoryId;
	private String shopCatagoryName;
	private String shopCatageryDesc;
	private String shopCatagoryImg;
	private Integer priority;
	private Date creatTime;
	private Date lastEditTime;
	private ShopCatagory parent;
	public Long getShopCatagoryId() {
		return shopCatagoryId;
	}
	public void setShopCatagoryId(Long shopCatagoryId) {
		this.shopCatagoryId = shopCatagoryId;
	}
	public String getShopCatagoryName() {
		return shopCatagoryName;
	}
	public void setShopCatagoryName(String shopCatagoryName) {
		this.shopCatagoryName = shopCatagoryName;
	}
	public String getShopCatageryDesc() {
		return shopCatageryDesc;
	}
	public void setShopCatageryDesc(String shopCatageryDesc) {
		this.shopCatageryDesc = shopCatageryDesc;
	}
	public String getShopCatagoryImg() {
		return shopCatagoryImg;
	}
	public void setShopCatagoryImg(String shopCatagoryImg) {
		this.shopCatagoryImg = shopCatagoryImg;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public ShopCatagory getParent() {
		return parent;
	}
	public void setParent(ShopCatagory parent) {
		this.parent = parent;
	}
	
}
