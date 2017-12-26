package com.htc.Exer15and18and19;

public class ProductNotFoundException extends Exception {
	public String errorMessage = "Product Not Found";

	public ProductNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
