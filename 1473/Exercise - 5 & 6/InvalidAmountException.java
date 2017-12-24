package com.htc.bankaccount;

public class InvalidAmountException extends Exception {

	private String invalidAmtExcepMsg;
	
	public InvalidAmountException()
	{
		this.invalidAmtExcepMsg = " Invalid deposit amount entered";
	}

	public InvalidAmountException(String depositAmtExcepMsg) {
		super();
		this.invalidAmtExcepMsg = invalidAmtExcepMsg;
	}

	@Override
	public String toString() {
		return "InvalidAmountException [invalidAmtExcepMsg=" + invalidAmtExcepMsg + "]";
	}
	
}
