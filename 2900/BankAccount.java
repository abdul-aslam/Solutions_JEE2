package com.htc.exercise1stwk.main;

public class BankAccount {
 private String  accountNo;
 private String accountName;
 public double balance;
 
 public BankAccount() {
	 
 }
 
public BankAccount(String accountNo, String accountName) {
	this.accountNo = accountNo;
	this.accountName = accountName;
	this.balance = 1000.00;
   }

@Override
public String toString() {
	return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
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



}
