package com.htc.cjavaexercises1.entity;

// Exercises 5 and 6

import java.util.Arrays;

public class Bank implements IBankServiceProvider {

	private BankAccount[] BankAccount;
	static int lastAssignedNo=0; 
	
	public Bank(com.htc.cjavaexercises1.entity.BankAccount[] bankAccount) {
		super();
		BankAccount = bankAccount;
	}
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount[] getBankAccount() {
		return BankAccount;
	}

	public void setBankAccount(BankAccount[] bankAccount) {
		BankAccount = bankAccount;
	}

	public static int getLastAssignedNo() {
		Bank.lastAssignedNo = Bank.lastAssignedNo + 1;
		return (lastAssignedNo-1);

	}

	@Override
	public BankAccount checkAccount(String accountNo) {
		// TODO Auto-generated method stub
		int i=0;
		char found='N';
		  for (BankAccount b : BankAccount) {
			   if (accountNo.equals(BankAccount[i].getAccountNo())) {
				   found='Y';
				   break;
				    };
			   i++;	
		  }
		  if (found=='N')
			  return null;
		  else 
			  return BankAccount[i];
			}

	@Override
	public double getBalance(BankAccount account) {
		// TODO Auto-generated method stub
		return account.getBalance();
 	}

	@Override
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		if ((int) amount<0)
		{
			throw new InvalidAmountException("Invalid amount to deposit");
		}
		
		int e = account.getBalance();
		account.setBalance(e + (int) amount);
			
		return true;
	}

	@Override
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException {
		// TODO Auto-generated method stub
		int e = account.getBalance();
		
		if (e<(int) amount)
		{
			throw new InsufficientFundException("Insufficient funds in the account");
		}
		
		account.setBalance(e - (int) amount);
		return true;
		
	}

	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) {
		// TODO Auto-generated method stub
		int e = fromAccount.getBalance();
		fromAccount.setBalance(e - (int) amount);
		
		e = toAccount.getBalance();
		toAccount.setBalance(e + (int) amount);
		
		return true;
	}

	@Override
	public String toString() {
		return "Bank [BankAccount=" + Arrays.toString(BankAccount) + "]";
	}

	
}
