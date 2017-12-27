package com.htc.cjavaexercises1.entity;

//Exercises 5 and 6

import java.util.List;

public interface IBankServiceProvider {

	BankAccount checkAccount(String accountNo);
	double getBalance(BankAccount account);
	boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException;
    boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException;
	boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount);
	
}
