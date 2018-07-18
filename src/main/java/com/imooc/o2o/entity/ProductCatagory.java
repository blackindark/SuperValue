package com.imooc.o2o.entity;

import java.util.Date;

public class ProductCatagory {
	private Long productCatagoryid;
	private Long shopId;
	private String productCatagoryName;
	private Integer priority;
	private Date createTime;
	public Long getProductCatagoryid() {
		return productCatagoryid;
	}
	public void setProductCatagoryid(Long productCatagoryid) {
		this.productCatagoryid = productCatagoryid;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getProductCatagoryName() {
		return productCatagoryName;
	}
	public void setProductCatagoryName(String productCatagoryName) {
		this.productCatagoryName = productCatagoryName;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
