package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StoresEx1819 {

	
	public static void main(String[] args) {
		
		ProductEx18 prd1 = new ProductEx18(100 , "Pen " , 560 , 60, 10 , 20 );
		ProductEx18 prd2 = new ProductEx18(101 , "Ball " , 60 , 80, 5 , 20);
		ProductEx18 prd3 = new ProductEx18(102 , "Eraser " , 30 , 90, 15 , 30);
		ProductEx18 prd4 = new ProductEx18(103 , "Scale " , 110 , 80, 45 , 30);
		ProductEx18 prd5 = new ProductEx18(104 , "Board " , 1000 , 77, 20 , 90);
		ProductEx18 prd6 = new ProductEx18(105 , "Drive " , 600 , 52 , 20, 100);
		ProductEx18 prd7 = new ProductEx18(106 , "Glue " , 50 , 80,10,20);
		
		
		ArrayList<ProductEx18> prodList = new ArrayList<ProductEx18>();
		
		prodList.add(prd1);prodList.add(prd2);prodList.add(prd3);prodList.add(prd4);
		prodList.add(prd5);prodList.add(prd6);prodList.add(prd7);
		
		StoresEx18 prod = new StoresEx18(prodList);
		try
		{
			System.out.println("**********************************************************");
			
			System.out.println("Details before Order \n " + prod.getProd(101) );
			System.out.println("\n purchase order is made : Order Value is SellItem(101, 10) : --->  " + prod.sellItem(101, 10) );
			System.out.println(" \n Details After Order \n " + prod.getProd(101) );
			
			System.out.println("\n **********************************************************");
			
			System.out.println("Details before Stock Update \n " + prod.getProd(106) );
			prod.updateStock(106, 20);
			System.out.println(" \n Details After Stock Update \n " + prod.getProd(106) );
			
			System.out.println("\n **********************************************************");
			
			System.out.println("Sorting Products using Name Comparator" );
			
			Collections.sort(prodList,new PriceComparator());
			
			for (ProductEx18 prod1 : prodList)
				System.out.println(prod1);
			
			
			
		}catch(ProductNotFoundException pnf)
		{
			System.out.println(pnf.getErrorMessage());
		}

	}

}
