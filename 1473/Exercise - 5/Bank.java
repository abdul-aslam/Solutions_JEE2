package com.htc.bankaccount;

import java.util.Arrays;



public class Bank implements IBankServiceProvider {
	
	private BankAccount[ ] bankAccount;

	public Bank(BankAccount[] bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	public BankAccount[] getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount[] bankAccount) {
		this.bankAccount = bankAccount;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(bankAccount);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (!Arrays.equals(bankAccount, other.bankAccount))
			return false;
		return true;
	}

	@Override
	public BankAccount checkAccount(String accountNo) throws AccountNotFoundException
	{
		BankAccount bank=null;
		boolean bankFnd = false;

		for(int i = 0 ; i < bankAccount.length ; i++)
		{
			if (bankAccount[i].getAccountNo().equalsIgnoreCase(accountNo))
			{
				bank =  bankAccount[i];
				bankFnd = true;
			}
		}

		if (!bankFnd)
		{
			throw new AccountNotFoundException(" Bank Account Not Found");
		}

		return bank;

	}

	@Override
	public double getBalance(BankAccount account)  throws AccountNotFoundException {
		double  amount = 0.0;

		this.checkAccount(account.getAccountNo());
		amount =  account.getAmount();
		return amount;
	}

	@Override
	public boolean depositMoney(BankAccount account, double amount) throws AccountNotFoundException,
	DepositAmountException{
		boolean depositFlag = false;

		this.checkAccount(account.getAccountNo());
		
		if (amount > 0 )
		{
		   amount = amount + account.getAmount();
		   account.setAmount(amount);
		  depositFlag = true;
		}
		else
		{
			throw new DepositAmountException("The depoist amount cannot be entered as negative");
		}

		return depositFlag;

	}


	@Override
	public boolean withdrawMoney(BankAccount account, double amount) throws AccountNotFoundException,
	InsufficientFundException
	{
		double currentBalanceAmt = 0.0;
		boolean withdrawFlag = false;

		this.checkAccount(account.getAccountNo());
		currentBalanceAmt = account.getAmount();

		if (amount <= currentBalanceAmt)
		{
			currentBalanceAmt = currentBalanceAmt - amount;
			account.setAmount(currentBalanceAmt);
			withdrawFlag= true;
		}


		if(!withdrawFlag)
		{
			throw new InsufficientFundException("Insufficeint amount in the account to withdraw");
		}

		return withdrawFlag;
	}

	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount) throws AccountNotFoundException,InsufficientFundException
	{
		// TODO Auto-generated method stub

		double fromAccountAmt = 0.0;
		double toAccountAmt = 0.0;
		boolean transferFlag = false;

		this.checkAccount(fromAccount.getAccountNo());
		this.checkAccount(toAccount.getAccountNo());
		fromAccountAmt = fromAccount.getAmount();
		toAccountAmt = toAccount.getAmount();

		if(fromAccountAmt == 0.0)
		{
			throw new InsufficientFundException("Insufficeint amount in the From account to tranfer");
		}
		else
		{
			toAccountAmt = toAccountAmt + fromAccountAmt;
			toAccount.setAmount(toAccountAmt);
			fromAccount.setAmount(0);
			transferFlag = true;
		}


		return transferFlag;

	}

	@Override
	public String toString() {
		return "Bank []";
	}

	     

}
