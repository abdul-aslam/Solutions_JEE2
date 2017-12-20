package com.htc.exc.four;

public class BankAccount {
	private String accountNo;
	private String accountName;
	private double balance;
	
	BankAccount(){
		accountNo=null;
		accountName=null;
		balance=1000;
	}

	
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = 1000;
	}


	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
	
	
	

}
