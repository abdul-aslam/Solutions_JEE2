package com.htc.exc.five;

import java.util.ArrayList;
import java.util.List;

public class Bank  implements IBankServiceProvider {

	private static int lastAssignedNo=0;
	List<BankAccount> ba = new ArrayList<>();
	int accountNo=0;
	
	public Bank(List<BankAccount> ba) {
		super();

	
		for(BankAccount bacc:ba) {
			accountNo= lastAssignedNo + 1;
			lastAssignedNo = lastAssignedNo + 1;
			bacc.setAccountNo(accountNo);

		}
	
		this.ba = ba;
	}

	@Override
	public BankAccount checkAccount(int accountNo) throws InvalidAccountNoException {
		// TODO Auto-generated method stub
		BankAccount bAcct = null;
		boolean flag = false;
		
		for(BankAccount bacc:ba) {
			if (bacc.getAccountNo() == accountNo)
			{
				bAcct = bacc;
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			throw new InvalidAccountNoException("Entered AccountNo "  + accountNo +" is Invalid");
		}
		return bAcct;
	}

	@Override
	public double getBalance(int accountNo) throws InvalidAccountNoException {
		// TODO Auto-generated method stub
		double balance = 0;
		boolean flag = false;
		
		for(BankAccount bacc:ba) {
			if (bacc.getAccountNo() == accountNo)
			{
				balance = bacc.getBalance();
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			throw new InvalidAccountNoException("Entered AccountNo "  + accountNo +" is Invalid");
		}
		
		
		return balance;

		
	}

	@Override
	public boolean depositMoney(int accountNo, double amount) throws InvalidAmountException, InvalidAccountNoException {
		// TODO Auto-generated method stub
		double balance = 0;
		boolean flag = false;

		if (amount<0) {
			throw new InvalidAmountException("Amount entered is invalid"+amount);
		}

		for(BankAccount bacc:ba) {
			if (bacc.getAccountNo() == accountNo)
			{
				balance = bacc.getBalance()+ amount;
				bacc.setBalance(balance);
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			throw new InvalidAccountNoException("Entered AccountNo "  + accountNo +" is Invalid");
		}
		
		return flag;


	}

	@Override
	public boolean withdrawMoney(int accountNo, double amount) throws InvalidAmountException, InsufficientFundException, InvalidAccountNoException {
		// TODO Auto-generated method stub
		double balance = 0;
		boolean flag = false;
		
		if (amount<0) {
			throw new InvalidAmountException("Amount entered is invalid"+amount);
		}
		
		for(BankAccount bacc:ba) {
			if (bacc.getAccountNo() == accountNo)
			{
				if (amount <= bacc.getBalance()) {
				balance = bacc.getBalance()- amount;
				bacc.setBalance(balance);
				flag = true;
				break;
				}
				else
				{
					throw new InsufficientFundException("Amount entered "+amount +" is greater than Balance " +bacc.getBalance() 
					+ " for the account# " +bacc.getAccountNo());
				}
			}
		}
		
		if(!flag) {
			throw new InvalidAccountNoException("Entered AccountNo "  + accountNo +" is Invalid");
		}
		return flag;


		
	}

	@Override
	public boolean transferMoney(int fromAccount, int toAccount, double amount) throws InvalidAmountException, InsufficientFundException, InvalidAccountNoException {
		// TODO Auto-generated method stub
		BankAccount bAcct = null;
		boolean flag = false;
		boolean flag1 = false;
		double balance = 0;
		
		if (amount<0) {
			throw new InvalidAmountException("Amount entered is invalid"+amount);
		}
		
		for(BankAccount bacc:ba) {
			if (bacc.getAccountNo() == fromAccount)
			{
				for(BankAccount btoAcct:ba) {
					if(btoAcct.getAccountNo() == toAccount) {
						if (amount <= bacc.getBalance()) {
							
						
							balance = bacc.getBalance()- amount;
							bacc.setBalance(balance);
							
							balance = 0;
							balance = btoAcct.getBalance()+amount;
							btoAcct.setBalance(balance);
							flag = true;
							break;
						}
						else
						{
							throw new InsufficientFundException("Amount entered "+amount +" is greater than Balance " +bacc.getBalance() 
							+ " for the account# " +bacc.getAccountNo());
						}
					}
				}
				flag1 = true;
				
			}
		}
		
		if(!flag1) {
			throw new InvalidAccountNoException("Entered from AccountNo "  + fromAccount +" is Invalid");
		}
		if(!flag) {
			throw new InvalidAccountNoException("Entered to AccountNo "  + toAccount +" is Invalid");
		}
		
		return flag;

	
	}
	
	

	
}
