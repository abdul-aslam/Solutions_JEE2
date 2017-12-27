package com.htc.comparator;

import java.util.Comparator;

public class Product  {
	
	private String productId;
	private String productDesc;
	private double price;
	
	public Product()
	{
		this.productId = "";
		this.productDesc =  "";
		this.price = 0.0;
	}
	public Product(String productId, String productDesc, double price) {
		super();
		this.productId = productId;
		this.productDesc = productDesc;
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productDesc == null) ? 0 : productDesc.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productDesc == null) {
			if (other.productDesc != null)
				return false;
		} else if (!productDesc.equals(other.productDesc))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productDesc=" + productDesc + ", price=" + price + "]";
	}
	
		

	
	
	

}
