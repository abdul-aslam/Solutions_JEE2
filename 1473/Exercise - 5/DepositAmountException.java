package com.htc.bankaccount;

public class DepositAmountException extends Exception {
	
	private String depositAmtExcepMsg;
	
	public DepositAmountException()
	{
		depositAmtExcepMsg = " Invalid deposit amount entered";
	}

	public DepositAmountException(String depositAmtExcepMsg) {
		super();
		this.depositAmtExcepMsg = depositAmtExcepMsg;
	}

	@Override
	public String toString() {
		return "DepositAmountException [depositAmtExcepMsg=" + depositAmtExcepMsg + "]";
	}
	

}
