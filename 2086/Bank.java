package com.htc.trainingexcerise.week1;

import java.util.ArrayList;

public class Bank implements iBankServiceProvider{

	static ArrayList<BankAccount> bankAccountArray=new ArrayList<BankAccount>();
	static int lastassignedNo=0;
	
	Bank()
	{
		super();
	}
	
	public Bank(String accountNm) {
		super();
		BankAccount bankAccount=new BankAccount(String.valueOf(lastassignedNo+1),accountNm);
		bankAccountArray.add(bankAccount);
		//this.bankAccountArray.add(bankAccount);
		//System.out.println("check");
		lastassignedNo+=1;		
	}
	
	
	

	public ArrayList<BankAccount> getBankAccountArray() {
		return bankAccountArray;
	}




	public void setBankAccountArray(ArrayList<BankAccount> bankAccountArr) {
		bankAccountArray = bankAccountArr;
	}




	@Override
	public BankAccount checkAccount(String accountNo) {
		// TODO Auto-generated method stub
		//This checks whether the given account number is available in the array
		//or not. If exists, it should return the object of BankAccount class, else
		//return null. Reuse this method in all the other methods given below.
		for(BankAccount bankAccount:bankAccountArray) {
			if(bankAccount.getAccountNo().equals(accountNo))
			{
				return bankAccount;
			}
		}
		return null;
	}

	@Override
	public double getBalance(BankAccount account) {
		// TODO Auto-generated method stub
		//This will return the balance in an account for the given account
		return account.getBalance();
	}

	@Override
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException  {
		// TODO Auto-generated method stub
		//This deposits the given amount into the given account number after
		//verifying whether the given account is present in the array or not.
		boolean depositSuccess=false;
		String accountNumb=account.getAccountNo();
		BankAccount bankAccount=checkAccount(accountNumb);
		
		if(bankAccount!=null)
		{	
			if(amount>=0) {
				bankAccount.setBalance(bankAccount.getBalance()+amount);
				depositSuccess=true;	
			}
			
		}
		if(!depositSuccess) {
			throw new InvalidAmountException("Invalid Amount to deposit");
		}
		return depositSuccess;
	}

	@Override
	public boolean withdrawMoney(BankAccount account, double amount) throws InvalidAmountException,InsufficientFundException {
		// TODO Auto-generated method stub
		//This will withdraw the given amount from the given account after
		//verifying the existence of account as well as balance.
		String accountNumb=account.getAccountNo();
		BankAccount bankAccount=checkAccount(accountNumb);
		if(bankAccount!=null)
		{	if(bankAccount.getBalance()>amount) 
			{
			bankAccount.setBalance(bankAccount.getBalance()-amount);
			return true;
			}
		else throw new InsufficientFundException("Insufficient Funds");
		
		}
		return false;
	}

	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundException{
		// TODO Auto-generated method stub
		//This transfers the money from one account to another account after
		//verifying both the accounts are existing or not as well as balance of the
		//‘fromAccount’.
		String accountNumb=fromAccount.getAccountNo();
		BankAccount bankAccount=checkAccount(accountNumb);
		if(bankAccount!=null)
		{	if(bankAccount.getBalance()>=amount) 
			{
			
			BankAccount toBankAccount=checkAccount(toAccount.getAccountNo());
			if(toBankAccount!=null)
			{	
				toBankAccount.setBalance(toBankAccount.getBalance()+amount);
				bankAccount.setBalance(bankAccount.getBalance()-amount);
			}
			}
			else throw new InsufficientFundException("Insufficient Funds");
		}return false;
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Bank bank1=new Bank("AAAA");
		Bank bank2=new Bank("BBBB");
		Bank bank3=new Bank("CCCC");
		Bank bank4=new Bank("DDDD");
		Bank bank=new Bank();
		
		System.out.println(" Check Acct 1  -->"+bank.checkAccount("1").getAccountName());
		System.out.println(" Check Balance 2  -->"+bank.getBalance(  bank.checkAccount("2")));
		
		try {
			System.out.println("  Deposit -->"+bank.depositMoney(bank.checkAccount("2"),-100)+"\n\n\n");
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" Check Balance 1  -->"+bank.getBalance(  bank.checkAccount("1")));
		
		try {
			System.out.println("  Withdraw -->"+bank.withdrawMoney(bank.checkAccount("2"),5000));
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Check Balance 2  -->"+bank.getBalance(  bank.checkAccount("2")));
		
		try {
			System.out.println(" Transfer  -->"+bank.transferMoney(bank.checkAccount("1"),bank.checkAccount("3"),15));
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Check Balance 1  -->"+bank.getBalance(  bank.checkAccount("1")));
		System.out.println(" Check Balance 3  -->"+bank.getBalance(  bank.checkAccount("3")));
		
	}
}
