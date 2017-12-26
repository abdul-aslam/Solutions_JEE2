package com.htc.exercise18;

public class ProductNotFoundException extends Exception {
	String cause;

	public ProductNotFoundException(String cause) {
		super();
		this.cause = cause;
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [cause=" + cause + "]";
	}
	
	public String getMessage()
	{
		return cause;
	}

}
