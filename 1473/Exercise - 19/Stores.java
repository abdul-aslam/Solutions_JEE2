package com.htc.comparator;

import java.util.Collections;
import java.util.List;

public class Stores {
	
	private String storeid;
	private String storeName;
	private List<Product> products ;
	
	public Stores()
	{
		this.storeid ="";
		this.storeName = "";
		this.products = null;
    }
	public Stores(String storeid, String storeName, List<Product> products) {
		super();
		this.storeid = storeid;
		this.storeName = storeName;
		this.products = null;
	}
	public String getStoreid() {
		return storeid;
	}
	public void setStoreid(String storeid) {
		this.storeid = storeid;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		result = prime * result + ((storeName == null) ? 0 : storeName.hashCode());
		result = prime * result + ((storeid == null) ? 0 : storeid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stores other = (Stores) obj;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		if (storeName == null) {
			if (other.storeName != null)
				return false;
		} else if (!storeName.equals(other.storeName))
			return false;
		if (storeid == null) {
			if (other.storeid != null)
				return false;
		} else if (!storeid.equals(other.storeid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Stores [storeid=" + storeid + ", storeName=" + storeName + ", products=" + products + "]";
	}


	public List<Product> sortProductPrice()
	{
		Collections.sort(products, new PriceComparator());
	
		return products;
	}
 

	
	

}
