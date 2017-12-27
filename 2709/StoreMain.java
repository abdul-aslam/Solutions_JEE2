package assignment2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StoreMain {

	public static void main(String[] args) {
		
		Product prd1 = new Product(100 , "Pen " , 560);
		Product prd2 = new Product(101 , "Ball " , 60);
		Product prd3 = new Product(102 , "Eraser " , 40);
		Product prd4 = new Product(103 , "Scale " , 110);
		Product prd5 = new Product(104 , "Board " , 1000);
		Product prd6 = new Product(105 , "Drive " , 600);
		Product prd7 = new Product(106 , "Glue " , 50);
		
		ArrayList<Product> storearray= new ArrayList<Product>();
		
		storearray.add(prd1);storearray.add(prd2);storearray.add(prd3);storearray.add(prd4);
		storearray.add(prd5);storearray.add(prd6);storearray.add(prd7);
		Collections.sort(storearray);
		
		
		Stores vijayStr = new Stores(700,"Vijaya Stroes" , storearray);
		
		System.out.println( "Sorted List of Products in " +  vijayStr.getStoreName() + "is " + vijayStr.getProdList());
		
		
	}

}
