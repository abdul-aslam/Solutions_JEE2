package com.htc.exercies;

public class BankAccount {
    private String accountNo;
    private String accountName;
    private Double balance;
	public BankAccount() {
		// TODO Auto-generated constructor stub
		accountNo = "";
		accountName = "";
		balance = 0.00;
	
	}
	public BankAccount(String accountNo, String accountName, Double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = 1000.00;
		
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
		return "BankAccount [accountNo=" + accountNo + ", accountName="
				+ accountName + ", balance=" + balance + "]";
	}

}
