package com.htc.comparator;

import java.util.ArrayList;
import java.util.List;

public class StoreMainClass {

	public static void main(String[] args) {
		
		List<Product> wProducts = new ArrayList<Product>();
		 
		
		wProducts.add(new Product("P100","Tea",10.50));
		wProducts.add(new  Product("P200","Milk",1.05));
		wProducts.add(new Product("P300","Egg",5.50));
		wProducts.add(new Product("P400","Bread",4.50));
		wProducts.add(new Product("P500","Coffee",15.50));
		
		//Creating an instance for the Store class
		Stores store = new Stores("S100","Walmat",null);
		
		//setting the product list in the store class
		store.setProducts(wProducts);
					
		//Calling the method to sort the products based on product price
		wProducts = store.sortProductPrice();
		
		
		System.out.println("Store id : " + store.getStoreid());
		System.out.println("Store Name : " + store.getStoreName());
		System.out.println();
		
		System.out.println("Product Details after sorting using the price");
		System.out.println();
		for(Product SortedProd : wProducts)
		{
			System.out.println(SortedProd.toString());
		}
		
		
	
		
		
		
		
		
		
		
		

	}

}
