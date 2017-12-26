package com.htc.exercise5and6and15and19;

import java.util.Arrays;

public class Bank implements IBankServiceProvider{
 
	private BankAccount[] bankaccount;

	
	public Bank(BankAccount[] bankaccount) {
		super();
		this.bankaccount = bankaccount;
	}
	
	

	@Override
	public String toString() {
		return "Bank [bankaccount=" + Arrays.toString(bankaccount) + "]";
	}



	public BankAccount[] getBankaccount() {
		return bankaccount;
	}

	public void setBankaccount(BankAccount[] bankaccount) {
		this.bankaccount = bankaccount;
	}



	@Override
	public BankAccount checkAccount(int accountNo) {
		// TODO Auto-generated method stub
		for(int i=0;i<bankaccount.length;i++) {
			if (bankaccount[i].getAccountNo()== accountNo) {
				return bankaccount[i];
			}
			}
		return null;
		}
		
	



	@Override
	public double getBalance(BankAccount account) {
		// TODO Auto-generated method stub
		for(int i=0;i<bankaccount.length;i++) {
			if (bankaccount[i]== account) 
				return bankaccount[i].getBalance();
			
			}
		return 0;
	}



	@Override
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		double amt=0;
		for(int i=0;i<bankaccount.length;i++) {
			if (bankaccount[i]== account) 
				if (amount > 50000.00) {
					throw new InvalidAmountException(" Invalid Amount, as it is more than 50k, pan card needs to submit along with deposite");
				}
				
			else {
			
				amt = bankaccount[i].getBalance() + amount;
			    bankaccount[i].setBalance(amt);
			    return true;
			
			}

			}
		return false;
	}



	@Override
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException {
		// TODO Auto-generated method stub
		double amt=0;
		for(int i=0;i<bankaccount.length;i++) {
			if (bankaccount[i]== account) 
				if (amount > bankaccount[i].getBalance()) {
					throw new InsufficientFundException("funds are not enough");
				}
				else {
					amt = bankaccount[i].getBalance() - amount;
				    bankaccount[i].setBalance(amt);
				    return true;
				}
		
			}
		return false;
	}



	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundException {
		// TODO Auto-generated method stub
		double famt=0;
		double tfmt=0;
		    
		
		for(int i=0;i<bankaccount.length;i++) {
			if (bankaccount[i]== fromAccount) {
				for (int j=0;j<bankaccount.length;j++) {
				   if (bankaccount[j]== toAccount) {
			       famt = bankaccount[i].getBalance() - amount;
				   tfmt = bankaccount[j].getBalance() + amount;
				   
				   bankaccount[i].setBalance(famt);
				   bankaccount[j].setBalance(tfmt);
				   
				   return true;
				   
			       }
		    	}

			}
		
	  }
		return false;
	}
}

	
	

