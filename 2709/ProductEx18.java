package assignment2;

import java.util.Comparator;

public class ProductEx18 implements Comparator<ProductEx18>{
	
	private int productId;
	private String productName;
	private int productPrice;
	private int quantityOnHand;
	private int reorderLevel;
	private int reorderQty;
	
	
	public ProductEx18(int productId, String productName, int productPrice, int quantityOnHand, int reorderLevel,
			int reorderQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantityOnHand = quantityOnHand;
		this.reorderLevel = reorderLevel;
		this.reorderQty = reorderQty;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	
	
	public int getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	public int getReorderQty() {
		return reorderQty;
	}
	public void setReorderQty(int reorderQty) {
		this.reorderQty = reorderQty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
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
		ProductEx18 other = (ProductEx18) obj;
		if (productId != other.productId)
			return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "\n ProductEx18 [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", quantityOnHand=" + quantityOnHand + ", reorderLevel=" + reorderLevel + ", reorderQty=" + reorderQty
				+ "]";
	}
	@Override
	public int compare(ProductEx18 o1, ProductEx18 o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
