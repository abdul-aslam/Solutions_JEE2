package com.htc.exercise5and6and15and19;

import java.util.Date;

public class Product {
  private String productId;
  private String prodDesc;
  private double price;
  private int quantityOnHan;
  private int reorderLevel;
  private int reorderQty;
public Product(String productId, String prodDesc, double price, int quantityOnHan, int reorderLevel, int reorderQty) {
	super();
	this.productId = productId;
	this.prodDesc = prodDesc;
	this.price = price;
	this.quantityOnHan = quantityOnHan;
	this.reorderLevel = reorderLevel;
	this.reorderQty = reorderQty;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProdDesc() {
	return prodDesc;
}
public void setProdDesc(String prodDesc) {
	this.prodDesc = prodDesc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantityOnHan() {
	return quantityOnHan;
}
public void setQuantityOnHan(int quantityOnHan) {
	this.quantityOnHan = quantityOnHan;
}
public int getReorderLevel() {
	return reorderLevel;
}
public void setReorderLevel(int reorderLevel) {
	this.reorderLevel = reorderLevel;
}
public int getReorderQty() {
	return reorderQty;
}
public void setReorderQty(int reorderQty) {
	this.reorderQty = reorderQty;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", prodDesc=" + prodDesc + ", price=" + price + ", quantityOnHan="
			+ quantityOnHan + ", reorderLevel=" + reorderLevel + ", reorderQty=" + reorderQty + "]";
}
  
  
}
