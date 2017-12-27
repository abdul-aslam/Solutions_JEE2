package com.htc.exc.Eighteen;

import java.util.ArrayList;
import java.util.List;

public class Stores {

	private String storeId;
    private String storeName;
	List<Product> product = new ArrayList<>();

	public Stores(String storeId, String storeName, List<Product> product) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.product = product;
	}

	double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException{
		boolean flag = false;
		double price = 0;
		int qty = 0;
		for(Product prod:product) {
			if (prod.getProductId()==productCode) {
				if (qtyRequired <= prod.getQuantityOnHand()) {
					flag = true;
					price = qtyRequired * prod.getPrice();
					if (prod.getQuantityOnHand()<= prod.getReorderLevel()) {
						qty = prod.getQuantityOnHand() + prod.getReorderQty();
						prod.setQuantityOnHand(qty);
						System.out.println("Quantity instock reached base level");
						System.out.println("Purchase order made");
					}
					break;
				}
				else
				{
					qty = prod.getQuantityOnHand() + prod.getReorderQty();
					prod.setQuantityOnHand(qty);
					System.out.println("Quantity of product place is greater than instock");
					System.out.println("Purchase order made");
					break;
				}
			}
		}
		
		
		if(flag) {
			return price;
		}
		else {
			throw new ProductNotFoundException("Product id "+ productCode + " not found in the list");
		}
		
	}
	
	void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException{
		
		int qty = 0;
		boolean flag = false;
		
		for(Product prod:product) {
			if (prod.getProductId()==productCode) {
				qty = prod.getQuantityOnHand() + arrivedQty;
				prod.setQuantityOnHand(qty);
				
				System.out.println("Quantity of product " +prod.getProductName() + " instock is updated");
				System.out.println("Total no. of stocks available : " + qty);
				flag = true;
				
				break;
			}
		}
		
		if(!flag) {
			throw new ProductNotFoundException("Product id "+ productCode +" not found in the list"); 
		}

		
	}
	
	
}
