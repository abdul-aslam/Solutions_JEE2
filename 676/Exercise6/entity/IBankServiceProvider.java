package com.htc.Exercise6.entity;

//Made by Ernest Paulino

	public interface IBankServiceProvider {
		
		BankAccount checkAccount(String accountNo);
		
		double getBalance(BankAccount account);
		
		boolean depositMoney(BankAccount account, double amount)
					throws 	InvalidAmountException; 
							
		
		boolean withdrawMoney(BankAccount account, double amount) 
					throws 	InsufficientFundException;
		
		boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) 
					throws InsufficientFundException;
		
		}
	

