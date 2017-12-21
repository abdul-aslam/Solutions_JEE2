package com.htc.corejavaexercises3;

public class BankAccount {

	private String accountNo;
	private String accountName;
	private double balance =1000;
	
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
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}
	
	public static void main(String[] args) {		
		BankAccount bankAccount=new BankAccount("ABC12345", "XXXXX");
		System.out.println(bankAccount.accountNo+" "+bankAccount.accountName+" "+bankAccount.balance);
	}
}
