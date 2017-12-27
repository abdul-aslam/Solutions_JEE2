package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stores {

		private int storeId;
		private String storeName;
		private ArrayList<Product> prodList;
		
		public Stores(int storeId, String storeName, ArrayList<Product> prodList) {
			super();
			this.storeId = storeId;
			this.storeName = storeName;
			this.prodList = prodList;
		}
		public int getStoreId() {
			return storeId;
		}
		public void setStoreId(int storeId) {
			this.storeId = storeId;
		}
		public String getStoreName() {
			return storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
		public ArrayList<Product> getProdList() {
			return prodList;
		}
		public void setProdList(ArrayList<Product> prodList) {
			this.prodList = prodList;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + storeId;
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
			if (storeId != other.storeId)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Stores [storeId=" + storeId + ", storeName=" + storeName + ", prodList=" + prodList + "]";
		}
		
		public List<Product> getListOfProducts()
		{
			 Collections.sort(prodList);
			 
			 return prodList;
			
		}
		
		
		
}
