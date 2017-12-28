package com.htc.exc.Eighteen;

import java.util.ArrayList;
import java.util.List;

public class EighteenMainCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products=new ArrayList<>();
		
		products.add(new Product(101,"Pen",10.45,100));
		products.add(new Product(102,"Pencil",5.45,100));
		products.add(new Product(103,"Eracer",3.45,100));
		products.add(new Product(104,"Ruler",20.45,100));
		
		Stores ABCstore=new Stores("S123","ABCstore",products);
		
		try {
			System.out.println(" Price for the quantity ordered is : " + ABCstore.sellItem(101, 10));
			System.out.println(" Price for the quantity ordered is : " + ABCstore.sellItem(106, 10));
			}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			ABCstore.updateStock(102, 10);
			ABCstore.updateStock(106, 10);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
			
		}
		

	

}
