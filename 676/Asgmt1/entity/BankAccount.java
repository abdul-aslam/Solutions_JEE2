package com.htc.Asgmt1.entity;

//Made by Ernest Paulino

	public class BankAccount {
	private String accountNo;//instance variable
	private String accountName;//instance variable
	private double balance;//instance variable

	// Default constructor
	public BankAccount() {
	}

	// Constructor accepts only accountNo and accountName
	public BankAccount(String accountNo, String accountName) {
	super();
	this.accountNo = accountNo;
	this.accountName = accountName;
	this.balance = 1000;
	}

	// Constructor with all fields defined
	public BankAccount(String accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	// Getter and Setter methods 
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
	

}