package com.htc.hw1;

import java.io.Serializable;

public class BankAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1026979377714032939L;
	private String accountNo;
	private String accountName;
	private double balance;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = 1000;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}

	
	
	
	
	
	
}
