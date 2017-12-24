package com.htc.bankaccount;

public interface IBankServiceProvider {
	
	public BankAccount checkAccount(String accountNo) throws AccountNotFoundException ;
	public double getBalance( BankAccount account)  throws AccountNotFoundException;
	public  boolean depositMoney(BankAccount account, double amount)  throws AccountNotFoundException,InvalidAmountException;
	public boolean withdrawMoney(BankAccount account, double amount) throws AccountNotFoundException,InsufficientFundException;
	public  boolean transferMoney(BankAccount fromAccount, BankAccount     toAccount)throws AccountNotFoundException,InsufficientFundException;


}
