package com.htc.trainingexcerise.week1;

import java.util.ArrayList;
import java.util.Collections;

public class Stores {
	private static ArrayList<Product> productList;
	
	Stores(){
		productList=new ArrayList<Product>();
		productList.add(new Product(101,"Rice",100.00,46,10,50));
		productList.add(new Product(102,"Wheat",150.00,5,10,50));
		productList.add(new Product(103,"Barley",50.00,11,10,50));
	}
	
	
	private static void sortedList()
	{
		
		//Sorted by product name asc
		System.out.println("Sorted by product name asc");
		Collections.sort(productList,Product.ProdNameComparator);
		 for(Product str: productList){
				System.out.println(str);}
		 
		//Sorted by product price asc
		 System.out.println("Sorted by product price asc");
		Collections.sort(productList,Product.ProductPriceComparator);
		for(Product str: productList){
				System.out.println(str);}
	}
	
	
	static double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException
	{
		
		/*It should sell the required qty and show the total amount.
		This method also checks whether reorderLevel is reached. If yes, raise a purchase order.
		[Just print a message on the screen saying that 'purchase order is made'].*/
		boolean flag=false;
		for(Product str: productList)
		{
			if(str.getProductId()==productCode)
			{
				flag=true;
				if(str.getQuantityOnHand()>=qtyRequired)
				{
					int quantityOnHand=str.getQuantityOnHand()-qtyRequired;
					str.setQuantityOnHand(quantityOnHand);
					if(quantityOnHand<=str.getReorderLevel())
					{
						System.out.println("purchase order is made\n");
					}
					System.out.println(str.toString());
					return qtyRequired*str.getPrice();
				}
				else
					throw new ProductNotFoundException("Product Not Found");	
			}}
			if(flag==false) 
				throw new ProductNotFoundException("Product Not Found");

		return 0;
		
	}
	
	 static void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException
	{
		boolean flag=false;
		for(Product str: productList)
		{
			if(str.getProductId()==productCode)
			{
				flag=true;
				str.setQuantityOnHand(str.getQuantityOnHand()+arrivedQty);
					System.out.println("updateStock(102,50)"+str.toString());
			}}
			if(flag==false) 
				throw new ProductNotFoundException("Product Not Found");
	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stores storesObj=new Stores();
		sortedList();
		
		try {
			System.out.println("sellItem(101,6)"+sellItem(101,6));
			System.out.println("sellItem(102,6)"+sellItem(102,6));
			
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			updateStock(102,50);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}