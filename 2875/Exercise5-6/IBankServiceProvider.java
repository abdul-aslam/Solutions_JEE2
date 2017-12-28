package com.htc.exc.five;

public interface IBankServiceProvider {
	
	BankAccount checkAccount(int accountNo) throws InvalidAccountNoException;
	
	double getBalance(int accountNo) throws InvalidAccountNoException;
	
	boolean depositMoney(int accountNo, double amount) throws InvalidAccountNoException,InvalidAmountException;
	
	boolean withdrawMoney(int accountNo, double amount) throws InvalidAccountNoException,InvalidAmountException,InsufficientFundException;
	
	boolean transferMoney(int fromAccount, int toAccount, double amount) throws InvalidAccountNoException,InvalidAmountException,InsufficientFundException;


}
