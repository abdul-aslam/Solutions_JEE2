package com.training5;

import com.training4.BankAccount;

public class Bank {
	
	static private int lastAssignedNo = 0;
	
	private BankAccount[] accounts;

	public BankAccount[] getAccounts() {
		return accounts;
	}

	public void setAccounts(BankAccount[] accounts) {
		this.accounts = accounts;
	}

	public static int getLastAssignedNo() {
		return lastAssignedNo++;
	}

}
