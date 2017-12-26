package com.htc.exercise5and6and15and19;

import java.util.ArrayList;
import java.util.Collections;

public class StoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 Store str= new Store(null);
			 
		     ArrayList<Product> products=new ArrayList<>();
			  
			  			
			  products.add(new Product("A01","Pen",10.00,50,10,20));
			  products.add(new Product("A02","Pencil",5.00,50,10,20));
			  products.add(new Product("A03","Eraser",4.00,50,10,20));
			  products.add(new Product("A04","Notepad",15.00,50,10,20));
			  products.add(new Product("A05","Book",20.00,50,10,20));
			  
			  for (Product product : products) {
				System.out.println(product);
			}
			  
			str.sortProducts(products);
			 
			System.out.println("sorted list based on price");	 
								
	       for (Product product : products) {
		      System.out.println(product);
	       } 
	}
}


