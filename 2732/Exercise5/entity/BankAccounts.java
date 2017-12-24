package com.htc.Exercise5.entity;

import java.util.Scanner;

import com.htc.Exercise5.entity.Bank;
import com.htc.Exercise5.entity.IBankServiceProvider;

public class BankAccounts implements IBankServiceProvider
{
			
	Bank[] bankAccount = new Bank[5] ; {
	
	bankAccount[0] = new Bank("Abc",1000.00);
	bankAccount[1] = new Bank("Def",2000.00);
	bankAccount[2] = new Bank("Ghi",3000.00);
	bankAccount[3] = new Bank("Jkl",5000.00);
	bankAccount[4] = new Bank("Mno",1000.00);
	}
	/*public BankAccounts(Bank[] bankAccount) {
			super();
			this.bankAccount = bankAccount;
		}
		

	public Bank[] getBankAccount() {
		return bankAccount;
	}


	public void setBankAccount(Bank[] bankAccount) {
		this.bankAccount = bankAccount;
	} */


	@Override
	public Bank checkAccount(int accountNo) {
		// TODO Auto-generated method stub
		for (Bank acc : bankAccount)
		{
			if (acc.getAccNum() == accountNo)
				return acc;
		}
		
		return null;
	}

	@Override
	public double getBalance(Bank account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean depositMoney(Bank account, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean depositMoney(Bank fromAccount, Bank toAccount, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
