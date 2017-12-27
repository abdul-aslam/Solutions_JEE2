package com.htc.exc.five;

import java.util.ArrayList;
import java.util.List;

public class FiveMainCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<BankAccount> ba = new ArrayList<>();
		ba.add(new BankAccount("AAA"));
		ba.add(new BankAccount("BBB",6000.23));
		ba.add(new BankAccount("CCC"));
		
		Bank b = new Bank(ba);
		
		
		//Check account
		try {
			System.out.println("Account details for 2:" + b.checkAccount(2));
		} catch (InvalidAccountNoException e) {
			// TODO Auto-generated catch block
			System.out.println(e);;
		}
		
		//Get Balance
		try {
			System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
		} catch (InvalidAccountNoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Deposit amount
		try {
			boolean deposited = b.depositMoney(2, 22232.00);
			System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
		} catch (InvalidAmountException | InvalidAccountNoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//withdraw amount
		try {
			boolean withdraw = b.withdrawMoney(2, 2300);
			System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
		} catch (InvalidAmountException | InsufficientFundException | InvalidAccountNoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//transfer amount
		
		try {
			System.out.println("Available Balance for the Accounts before transfer");
			System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
			System.out.println("Available Balance for the Account # 3:" + b.getBalance(3));
			
			boolean transfer = b.transferMoney(2, 3, 3000);
			
			System.out.println("Available Balance for the Accounts after transfer");
			System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
			System.out.println("Available Balance for the Account # 3:" + b.getBalance(3));
			
		} catch (InvalidAmountException | InsufficientFundException | InvalidAccountNoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Exception handling
		//Check account
				try {
					System.out.println("Account details for 2:" + b.checkAccount(6));
				} catch (InvalidAccountNoException e) {
					// TODO Auto-generated catch block
					System.out.println(e);;
				}
				
				//Get Balance
				try {
					System.out.println("Available Balance for the Account # 2:" + b.getBalance(7));
				} catch (InvalidAccountNoException e) {
					// TODO Auto-generated catch block
					System.out.println(e);;
				}
				
				//Deposit amount
				try {
					boolean deposited = b.depositMoney(2, -200);
					System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
				} catch (InvalidAmountException | InvalidAccountNoException e) {
					// TODO Auto-generated catch block
					System.out.println(e);;
				}
				
				
				//withdraw amount
				try {
					boolean withdraw = b.withdrawMoney(2, 23003333);
					System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
				} catch (InvalidAmountException | InsufficientFundException | InvalidAccountNoException e) {
					// TODO Auto-generated catch block
					System.out.println(e);;
				}
				
				
				//transfer amount
				
				try {
					System.out.println("Available Balance for the Accounts before transfer");
					System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
					System.out.println("Available Balance for the Account # 3:" + b.getBalance(3));
					
					boolean transfer = b.transferMoney(2, 3, 3000323);
					
					System.out.println("Available Balance for the Accounts after transfer");
					System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
					System.out.println("Available Balance for the Account # 3:" + b.getBalance(3));
					
				} catch (InvalidAmountException | InsufficientFundException | InvalidAccountNoException e) {
					// TODO Auto-generated catch block
					System.out.println(e);;
				}

				try {
					System.out.println("Available Balance for the Accounts before transfer");
					System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
					System.out.println("Available Balance for the Account # 3:" + b.getBalance(3));
					
					boolean transfer = b.transferMoney(2, 7, 1000);
					
					System.out.println("Available Balance for the Accounts after transfer");
					System.out.println("Available Balance for the Account # 2:" + b.getBalance(2));
					System.out.println("Available Balance for the Account # 3:" + b.getBalance(3));
					
				} catch (InvalidAmountException | InsufficientFundException | InvalidAccountNoException e) {
					// TODO Auto-generated catch block
					System.out.println(e);;
				}
		

	}

}

