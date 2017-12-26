package com.htc.Exer15and18and19;

public class Product implements Comparable<Product> {
	private String productId;
	private String productDesc;
	private double price;
	private int quantityOnHand;
	private static int reorderLevel = 10;
	private static int reorderQty = 50;
		
	public Product() {
		super();
		this.productId = "";
		this.productDesc = "";
		this.price = 0.0;
		this.quantityOnHand = 0;
	}
	
	public Product(String productId, String productDesc, double price, int quantityOnHand) {
		super();
		this.productId = productId;
		this.productDesc = productDesc;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
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
	
	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int compareTo(Product comparePro) {
		return this.productDesc.compareTo(comparePro.getProductDesc());
	//	if (this.getProductDesc().equals(comparePro.getProductDesc()))
	//		return -1;
	//	else
	//		return 1;
		}
	public double sellProduct(int qtyRequired) {
		double totalAmt = this.getPrice() * qtyRequired;
		this.setQuantityOnHand(this.getQuantityOnHand() - qtyRequired);
		if (this.quantityOnHand <= Product.reorderLevel) 
			System.out.println("Purchase order is placed");
		return totalAmt;
	}
	
	public void updateProductQuantity(int arrivedQty) {
		this.setQuantityOnHand(this.getQuantityOnHand() + arrivedQty);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productDesc=" + productDesc + ", price=" + price
				+ ", quantityOnHand=" + quantityOnHand + ", getProductId()=" + getProductId() + ", getProductDesc()="
				+ getProductDesc() + ", getPrice()=" + getPrice() + ", getQuantityOnHand()=" + getQuantityOnHand()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
