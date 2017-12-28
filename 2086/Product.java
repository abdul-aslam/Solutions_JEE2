package com.htc.trainingexcerise.week1;

import java.util.Comparator;

public class Product
{
	private int productId;
	private String productName;
	private double price;
	private int quantityOnHand;
	private int reorderLevel;
	private int reorderQty;

	public Product(int productId, String productName, double price, int quantityOnHand, int reorderLevel,
			int reorderQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
		this.reorderLevel = reorderLevel;
		this.reorderQty = reorderQty;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public static Comparator<Product> getProdNameComparator() {
		return ProdNameComparator;
	}

	public static void setProdNameComparator(Comparator<Product> prodNameComparator) {
		ProdNameComparator = prodNameComparator;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantityOnHand=" + quantityOnHand + ", reorderLevel=" + reorderLevel + ", reorderQty=" + reorderQty
				+ "]";
	}


	public static Comparator<Product> ProdNameComparator = new Comparator<Product>() 
	{

		@Override
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			String productName1 = ((Product)o1).getProductName().toUpperCase();
			String productName2 = ((Product) o2).getProductName().toUpperCase();

			   //ascending order
			   return productName1.compareTo(productName2);

			   //descending order
			   //return productName2.compareTo(productName1);
		}

	};
	
	
	public static Comparator<Product> ProductPriceComparator = new Comparator<Product>() 
	{

		@Override
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			   //ascending order
			   return new Double(o1.getPrice()).compareTo(new Double(o2.getPrice()));

			   //descending order
			   //return new Double(o2.getPrice()).compareTo(new Double(o1.getPrice()));
		}

	};
}
