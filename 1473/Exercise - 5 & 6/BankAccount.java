package com.htc.bankaccount;

public class BankAccount {

	private String accountNo;
	private String accountName;
	private double amount;
	public static int lastAssignedNo;
	
	static
	{
		lastAssignedNo = 0;
	}

	public BankAccount()
	{
		this.accountName ="";
		this.accountNo ="";
		this.amount = 0.0;
	}
	public BankAccount(String accountName, double amount) {
		super();
		this.accountName = accountName;
		this.amount = amount;
		this.lastAssignedNo = this.lastAssignedNo + 1;
		this.setAccountNo( Integer.toString(this.lastAssignedNo));
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public static int getLastAssignedNo() {
		return lastAssignedNo;
	}

	public static void setLastAssignedNo(int lastAssignedNo) {
		BankAccount.lastAssignedNo = lastAssignedNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", amount=" + amount + "]";
	}
	
	
	
	
		
	
	
}
