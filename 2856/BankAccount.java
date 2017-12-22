package com.htc.excercise4.kishorebabu;

public class BankAccount
{
	
	public String accountNo;
	public String accountName;
	public static double balance=1000;
	
	
	
	public BankAccount( String accountNo, String accountName)
	{
		this.accountNo=accountNo;
		this.accountName=accountName;
		
	}
	
	public BankAccount( String accountNo, String accountName, double balance)
	{
		this.accountNo=accountNo;
		this.accountName=accountName;
		this.balance=balance;
		
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


	public static void setBalance(double balance) {
		BankAccount.balance = balance;
	}


	public static void main(String[] args)
	{
	  BankAccount ba1=new BankAccount("A102","Savings");
	  
	  //System.out.println("First Account Number: ");
	  System.out.println("Account Number: "+ba1.getAccountNo());
	  System.out.println("Account Name: "+ba1.getAccountName());
	  System.out.println("Balance: "+balance);
	  
	  
	}
	
}	


