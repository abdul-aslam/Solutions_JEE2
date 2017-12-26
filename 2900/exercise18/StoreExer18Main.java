package com.htc.exercise18;

import java.util.ArrayList;
import java.util.List;

public class StoreExer18Main {

	public static void main(String[] args) throws ProductNotFoundException{
		// TODO Auto-generated method stub
            
      List<Product> products = new ArrayList<>();
      
      products.add(new Product(01,"sunglass",100.00,50,10,50));
      
      Store str=new Store(products);
      
      System.out.println(products);
      try {
      str.sellItem(01,40);
      str.updateStock(02, 100);
      }catch(ProductNotFoundException pr){
    	  System.out.println(pr);
      }
      System.out.println("After Updation");
      System.out.println(products);	
	}

}
