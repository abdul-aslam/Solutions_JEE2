package com.training5;

import com.training4.BankAccount;

public class Exercise5 {

	public static void main(String[] args) {

		Bank myBank = new Bank();
		BankAccount[] accounts = new BankAccount[3];
		
		accounts[0] = new BankAccount(Integer.toString(Bank.getLastAssignedNo()), "Tom");
		accounts[1] = new BankAccount(Integer.toString(Bank.getLastAssignedNo()), "Dick");
		accounts[2] = new BankAccount(Integer.toString(Bank.getLastAssignedNo()), "Harry");
		
		myBank.setAccounts(accounts);
		
		for ( BankAccount acct : myBank.getAccounts() ) {
			System.out.println(acct);
		}
	
	}

}
