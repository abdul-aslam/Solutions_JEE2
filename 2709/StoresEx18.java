package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StoresEx18 {

		List<ProductEx18> prodList;
		
		public StoresEx18(List<ProductEx18> prodList) {
			super();
			this.prodList = prodList;
		}
		
		
		public List<ProductEx18> getProdList() {
			return prodList;
		}
		public void setProdList(List<ProductEx18> prodList) {
			this.prodList = prodList;
		}
		
		public ProductEx18 getProd(int productId) throws ProductNotFoundException
		{
			boolean flag = false;
			
			for(ProductEx18 prod : prodList)
			{
				if(prod.getProductId() == productId)
				{	
					flag = true;
					return prod;
				}	
			}
			
			if(flag == false)
				throw new ProductNotFoundException("Product Not Found ");
			
			return null;
			
		}
		
		
		public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException
		{
			boolean flag = false;
			
			for(ProductEx18 prod : prodList)
			{
				if(prod.getProductId() == productCode)
				{	
					flag = true;
					if(qtyRequired >= prod.getReorderLevel())
					{	
						prod.setQuantityOnHand(prod.getQuantityOnHand() + prod.getReorderQty());
						prod.setQuantityOnHand(prod.getQuantityOnHand() - qtyRequired);
					}
					
					return prod.getProductPrice() * qtyRequired;
				}
			}
			
			if(flag == false)
				throw new ProductNotFoundException("Product Not Found ");
			
			return 0;
			
		}
		
		
		public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException
		{
			boolean flag = false;
			
			for(ProductEx18 prod : prodList)
			{
				if(prod.getProductId() == productCode)
				{	
					flag = true;
					prod.setQuantityOnHand(prod.getQuantityOnHand() + arrivedQty);
				}
			}
			
			if(flag == false)
				throw new ProductNotFoundException("Product Not Found ");
			
			
		}
		
		
}
