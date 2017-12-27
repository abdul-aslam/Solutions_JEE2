package com.htc.exc.Eighteen;

public class ProductNotFoundException extends Exception{

	private String msg;

	public ProductNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [msg=" + msg + "]";
	}
	
	
	
}
