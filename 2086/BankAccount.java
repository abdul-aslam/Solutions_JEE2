package com.htc.trainingexcerise.week1;
/* Week1 - Exercise question 4 */
public class BankAccount {

	private String accountNo,accountName;
	private double balance=1000;
	
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount=new BankAccount("12345", "AAAAA");
		System.out.println(bankAccount.accountNo+" "+bankAccount.accountName+" "+bankAccount.balance);
	}

}
