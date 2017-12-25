package com.htc.excercise4.kishorebabu;

public class BankAccount
{
	
	public String accountNo;
	public String accountName;
	public static double balance=1000;
	
	
	
	public BankAccount( String accountNo, String accountName, double balance)
	{
		this.accountNo=accountNo;
		this.accountName=accountName;
		BankAccount.balance=balance;
		
	}
	

	public BankAccount( String accountNo, String accountName)
	{
		this(accountNo, accountName, 1000.00);
		this.accountNo=accountNo;
		this.accountName=accountName;
		
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


	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName="
				+ accountName + ", balance=" + balance + "]";
	}
	
	public static void main(String[] args)
	{
	  BankAccount ba1=new BankAccount("A101","Savings",2000);
	  System.out.println(ba1);	  
	  BankAccount ba2=new BankAccount("A102","Savings");	 
	  System.out.println(ba2);
	}
	
}	


