package com.htc.exercise5and6and15and19;

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
	
	public ArrayList<Product> sortProducts(ArrayList<Product> products) {
		Collections.sort(products, new PriceComparator());
		return products;
		
	}
}
