package com.htc.comparator;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		return new Double(o1.getPrice()).compareTo(new Double (o2.getPrice()));
	}

}
