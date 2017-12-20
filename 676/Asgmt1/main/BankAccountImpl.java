package com.htc.Asgmt1.main;

//Made by Ernest Paulino

import com.htc.Asgmt1.entity.BankAccount;

public class BankAccountImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount mine = new BankAccount("12345","Marlon Brando");
		
		System.out.println("Account Number:  " + mine.getAccountNo());
		System.out.println("Account Name:    " + mine.getAccountName());
		System.out.println("Account Balance: " + mine.getBalance());
		
	}

}
