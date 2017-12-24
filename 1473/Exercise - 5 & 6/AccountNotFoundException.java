package com.htc.bankaccount;

public class AccountNotFoundException extends Exception {
	private String accNotFoundMsg;

	public AccountNotFoundException()
	{
		this.accNotFoundMsg = " Bank Account id is invalid";
	}
	public AccountNotFoundException(String accMessage) {
		super();
		this.accNotFoundMsg = accMessage;
	}
	@Override
	public String toString() {
		return "AccountNotFoundException [accNotFoundMsg=" + accNotFoundMsg + "]";
	}

	

	
}
