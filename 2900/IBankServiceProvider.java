package com.htc.exercise5and6and15and19;

public interface IBankServiceProvider {
	BankAccount checkAccount(int accountNo);
	double getBalance(BankAccount account);
	boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException;
	boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException;
	boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundException; 
}
