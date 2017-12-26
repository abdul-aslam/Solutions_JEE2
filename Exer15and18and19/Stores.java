package com.htc.Exer15and18and19;

import java.util.ArrayList;
import java.util.Collections;

public class Stores {
	ArrayList<Product> products = new ArrayList<>();
	
	public Stores() {
		super();
		this.products = null;
	}
	
	public Stores(ArrayList<Product> products) {
		super();
		this.products = products;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	public ArrayList<Product> sortByDesc() {
		Collections.sort(this.products);
		return this.products;
	}
	
	@Override
	public String toString() {
		return "Stores [products=" + getProducts() + "]";
	}

	public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException
	{
	    String productId = String.valueOf(productCode);
	    double totalAmt = 0.0;
	    boolean flag = false;
 	    for (Product prod:this.products)
	    	if (prod.getProductId().equals(productId)) {
	    		System.out.println("Number of " + prod.getProductDesc() + " sold : " + String.valueOf(qtyRequired));
	    		totalAmt=prod.sellProduct(qtyRequired);
	    		flag=true;
	    	}	
 	    if (!flag)	
	    	throw new ProductNotFoundException("ProductNotFoundException in sellItem for productId " + productId);
	    else {
	    	return totalAmt;
	    }
	}
	public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException
	{
	    String productId = String.valueOf(productCode);
	    boolean flag = false;
	    for (Product prod:this.products)
	    	if (prod.getProductId().equals(productId)) {
	    		System.out.println("Number of " + prod.getProductDesc() + " in stock before update : " + prod.getQuantityOnHand());
	    		prod.updateProductQuantity(arrivedQty);
	    		System.out.println("Number of " + prod.getProductDesc() + " in stock after update : " + prod.getQuantityOnHand());
	    		flag=true;
	    		break;
	    	}	
 	    if (!flag)	
	    	throw new ProductNotFoundException("ProductNotFoundException in updateStock for productId " + productId);
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("1111","Folders",5.99,50));
		products.add(new Product("2222","Pens",4.99,100));
		products.add(new Product("3333","Notebooks",2.99,500));
		products.add(new Product("4444","Pencils",1.99,200));
		Stores storeOrig = new Stores(products);
		System.out.println("Original List : " + storeOrig);
		Stores storeSort = new Stores(storeOrig.sortByDesc());
		System.out.println("Sorted List by Description : " + storeSort);
		try
		{
			System.out.println("Total Amount Sold :" + storeSort.sellItem(Integer.parseInt("2222"),50));
			storeSort.updateStock(Integer.parseInt("3333"),5);
		}
		catch (ProductNotFoundException e)
		{
			System.out.println(e.getErrorMessage());
			e.printStackTrace();
	
		}
		System.out.println("Original List : " + storeOrig);
		Collections.sort(storeOrig.getProducts(), new priceComparator());
		System.out.println("Sorted List by Price : " + storeOrig);
	}
}

