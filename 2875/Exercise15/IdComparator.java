package com.htc.exc.fifteen;

import java.util.Comparator;

public class IdComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getProductid().compareTo(o2.getProductid());
	}


}
