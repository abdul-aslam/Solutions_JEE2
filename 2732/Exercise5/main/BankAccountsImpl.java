package com.htc.Exercise5.main;

import java.util.Scanner;

import com.htc.Exercise5.entity.Bank;
import com.htc.Exercise5.entity.BankAccounts;
import com.htc.Exercise5.entity.IBankServiceProvider;

public class BankAccountsImpl {
	
	public static void main(String[] args) {
		
		BankAccounts account = new BankAccounts();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please choose an option:");
		System.out.println("Enter 1 for checking an account");
		System.out.println("Enter 2 for getting the balance in an account");
		System.out.println("Enter 3 for depositing money in an account");
		System.out.println("Enter 4 for withdrawing money from an account");
		System.out.println("Enter 5 for transferring money between two accounts");
		System.out.println("Enter 0 to exit out");
		int opt = s.nextInt();
		
		int acnum;
		Bank acc;
		switch (opt){
		case 1: System.out.println("Please enter the account number");
				acnum = s.nextInt();
				acc = account.checkAccount(acnum);
				if (acc != null ) {
					System.out.println(acc);
					break;
				}
				else {
					System.out.println("This account number doesnt exist");
				}
		case 2: System.out.println("Please enter the account number");
				acnum = s.nextInt();
				acc = account.checkAccount(acnum);
				if (acc != null ) {
					System.out.println(acc.getBalance());
					break;
				}
				else {
					System.out.println("This account number doesnt exist");
				}
		case 3: System.out.println("Please enter the account number");
			acnum = s.nextInt();
			acc = account.checkAccount(acnum);
			if (acc != null ) {
				System.out.println("Please enter the amount to deposit");
				Double amt = s.nextDouble();
				Double bal = acc.getBalance()+amt;
				acc.setBalance(bal);
				System.out.println("The balance now is "+acc.getBalance());
				break;
			}
			else {
				System.out.println("This account number doesnt exist");
			}
		
		case 4: System.out.println("Please enter the account number");
			acnum = s.nextInt();
			acc = account.checkAccount(acnum);
			if (acc != null ) {
				System.out.println("Please enter the amount to withdraw");
				Double amt = s.nextDouble();
				Double bal = acc.getBalance()-amt;
				if (bal >= 0) {
					acc.setBalance(bal);
					System.out.println("The balance now is "+acc.getBalance());
				}
				else {
					System.out.println("Insufficient balance in account");
				}
				break;
			}
			else {
				System.out.println("This account number doesnt exist");
			}

		case 5: System.out.println("Please enter the account number to transfer money from");
			acnum = s.nextInt();
			acc = account.checkAccount(acnum);
			if (acc != null ) {
				System.out.println("Please enter the account number to transfer money to");
				int acnum2 = s.nextInt();
				Bank acc2 = account.checkAccount(acnum2);
				if (acc2 != null ) {
					System.out.println("Please enter the amount to transfer");
					Double amt = s.nextDouble();
					Double bal = acc.getBalance()-amt;
					if (bal >= 0) {
						acc.setBalance(bal);
						bal = acc2.getBalance()+amt;
						acc2.setBalance(bal);
						System.out.println("Transfer complete");
						break;
					}
					else {
						System.out.println("Insufficient balance in account for transfer");
					}
				}	
				else {
					System.out.println("Account to transfer to doesnt exist");
					break;
				}
						
			}
			else {
				System.out.println("This account number doesnt exist");
			}
		}	
	
	}
}