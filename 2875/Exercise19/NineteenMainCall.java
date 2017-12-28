package com.htc.exc.Nineteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class NineteenMainCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> prod = new ArrayList<>();
		
		prod.add(new Product("P123","pen",10.45,new Date()));
		prod.add(new Product("P167","pencil",5.45,new Date()));
		prod.add(new Product("P15","Eracer",3.45,new Date()));
		prod.add(new Product("P183","ruler",20.45,new Date()));
		
		System.out.println("Sorted list based on Price");
		
		Collections.sort(prod, new PriceComparator());
		
		
		for(Product prods:prod) {
			System.out.println(prods);
		}
	}

}
