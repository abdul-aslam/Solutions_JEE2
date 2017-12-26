package com.htc.exercise5and6and15and19;

public class BankAccount {
 private int  accountNo;
 private String accountName;
 private double balance;
 private static int lastAssignedNo = 0;
 
 
  
/*public BankAccount(String accountNo, String accountName) {
	this.accountNo = accountNo;
	this.accountName = accountName;
	this.balance = 1000.00;
   } */

public BankAccount(String accountName, double balance) {
	super();
	this.accountNo = lastAssignedNo + 1;
	this.accountName = accountName;
	this.balance = balance;
	lastAssignedNo = lastAssignedNo + 1;
	
}


@Override
public String toString() {
	return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
}

public int getAccountNo() {
	return accountNo;
}

public void setAccountNo(int accountNo) {
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
