package com.htc.Exercise4.entity;

/* Follow the given instructions and create an application using Java.
(i) Create a ‘BankAccount’ class with 3 data members, accountNo[use String],
 accountName and balance.
(ii) Overload the BankAccount constructor to accept only accountNo and
 accountName variables.
(iii) Initialize the balance with 1000. 
 */

public class BankAccount {
	private String accountNo;
	private String accountName;
	private static Double balance = 1000.00;
	
	
	public BankAccount() {
		super();
	}

	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
	
	
	

}
