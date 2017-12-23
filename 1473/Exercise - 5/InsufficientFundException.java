package com.htc.bankaccount;

public class InsufficientFundException extends Exception {
	
	private String insuffAccMsg ;

	public InsufficientFundException()
	{
		this.insuffAccMsg = " Insufficient account balance";
	}
	public InsufficientFundException(String insuffAccMsg) {
		super();
		this.insuffAccMsg = insuffAccMsg;
	}

	@Override
	public String toString() {
		return "InsufficientFundException [insuffAccMsg=" + insuffAccMsg + "]";
	}
	

}
