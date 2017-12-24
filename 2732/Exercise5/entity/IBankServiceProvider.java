package com.htc.Exercise5.entity;

public interface IBankServiceProvider {
	
	public Bank checkAccount(int accountNo);
	
	public double getBalance(Bank account);
	
	public boolean depositMoney(Bank account, double amount);
	
	public boolean depositMoney(Bank fromAccount, Bank toAccount, double amount);
	

}
