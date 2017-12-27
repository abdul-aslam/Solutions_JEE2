package assignment2;

import java.util.Comparator;

public class PriceComparator implements Comparator<ProductEx18>{

	@Override
	public int compare(ProductEx18 o1, ProductEx18 o2) {
		return o1.getProductPrice() - o2.getProductPrice();
	}
	
	

}
