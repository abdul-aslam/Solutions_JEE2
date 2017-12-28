package com.htc.trainingexcerise.week1;

public interface iBankServiceProvider {
	BankAccount checkAccount(String accountNo);
	
	
	double getBalance( BankAccount account);
	
	
	boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException;
	
	
	boolean withdrawMoney(BankAccount account, double amount) throws InvalidAmountException,InsufficientFundException;
	
	
	boolean transferMoney(BankAccount fromAccount, BankAccount
	toAccount,double amount) throws InvalidAmountException,InsufficientFundException;
	
	
}