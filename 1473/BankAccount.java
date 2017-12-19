package com.htc.bankaccount;

public class BankAccount {
	
	private String accountNo;
	private String accountName;
	private int balance;
	
	// Default constructor 
	public BankAccount() {
		this.balance = 1000;
		
	}
	
	//Overloading the constructor
	public BankAccount(String accountNo, String accountName)
	{
		super();
		this.accountName = accountName;
		this.accountNo   = accountNo;
		this.balance = 1000;
		
	}
	
	//Getter and Setter properties for encapsulation
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	//Override the to string method
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}


	//Override the hash code and equal method.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		result = prime * result + balance;
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		if (balance != other.balance)
			return false;
		return true;
	}
	
	

}
