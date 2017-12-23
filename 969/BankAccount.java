package com.htc.exercises.main;

public class BankAccount {
	
	String accountNo;
	String accountName;
	double balance = 1000;
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount("AC10001", "Smith");
		System.out.println(ba);
	}

}
