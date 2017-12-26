package com.htc.exercise18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Store {
	
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	public Store(List<Product> products) {
		super();
		this.products = products;
	}

	@Override
	public String toString() {
		return "Store [products=" + products + "]";
	}

	void sellItem(int productCode, int qtyRequired) throws ProductNotFoundException{
		boolean found=false;
     	double totPrice = 0;
     	double unitPrice = 0;
     	for (int i=0;i<products.size();i++) {
			if ((products.get(i).getProductId()== productCode)) {
				found = true;
				if (products.get(i).getQuantityOnHan()>=qtyRequired) {
					totPrice = qtyRequired * products.get(i).getPrice();
					products.get(i).setQuantityOnHan(products.get(i).getQuantityOnHan()- qtyRequired);
					if (products.get(i).getQuantityOnHan() <= products.get(i).getReorderLevel())
						System.out.println("Product: " + products.get(i).getProdDesc() + " needs to order " + products.get(i).getReorderQty());
					unitPrice = products.get(i).getPrice();
					break;
				}
			}
				
		}
		if (found==true) {
			System.out.println("Sales Receipt");
			System.out.println("Unit Price: " + unitPrice);
			System.out.println("Required Item:" + qtyRequired);
			System.out.println("Total Price: " + totPrice);
			
		}else
			throw new ProductNotFoundException("Product not found");
			
	}
	void updateStock(int productCode, int arrivedQty)  throws ProductNotFoundException{
		boolean found=false;
     	int totalQty = 0;
     	int tprodId = 0;
     	String tprodName = " ";
     	
     	
		 for (int i=0;i<products.size();i++) {
			if ((products.get(i).getProductId()== productCode)) {
				found = true;
				tprodId = products.get(i).getProductId();
				tprodName = products.get(i).getProdDesc();
				totalQty = products.get(i).getQuantityOnHan() + arrivedQty;
				products.get(i).setQuantityOnHan(totalQty);
				break;
				
				}
			}
		 if (found==true) {
				System.out.println("Stock Update with below Items");
				System.out.println("Product Id: " + tprodId);
				System.out.println("Product Description: " + tprodName);
				System.out.println("Arrived Quantity:" + arrivedQty);
				System.out.println("Total Quantity On Hand" + totalQty);
								
			}else
				throw new ProductNotFoundException("Product not found");
	}
}
	
