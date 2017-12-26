package com.htc.Exer15and18and19;

import java.util.Comparator;

public class priceComparator implements Comparator<Product> {
    @Override
	public int compare(Product p1, Product p2) {
		return new Double(p1.getPrice()).compareTo(new Double(p2.getPrice()));
	}
}
