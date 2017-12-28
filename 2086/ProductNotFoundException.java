package com.htc.trainingexcerise.week1;

public class ProductNotFoundException extends Exception {
	String errormsg;
	public ProductNotFoundException() {
		this.errormsg="Product Not Found";
	}
	public ProductNotFoundException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}

	
}
