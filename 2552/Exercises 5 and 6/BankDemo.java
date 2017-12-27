package com.htc.cjavaexercises1.entity;

//Exercises 5 and 6

public class BankDemo {

	public static void main(String[] args) {
		
		Bank bank=new Bank(null);
		
		BankAccount bankaccount[] = {new BankAccount(Integer.toString(bank.getLastAssignedNo()),"Clark"),
								     new BankAccount(Integer.toString(bank.getLastAssignedNo()),"Thomas"),
									 new BankAccount(Integer.toString(bank.getLastAssignedNo()),"Jones")};	
		
		bank.setBankAccount(bankaccount); 							 
									 
		System.out.println("accountno\taccount holder name\tbalance");
		
		for (int i = 0; i < bank.getBankAccount().length; i++) {
		
			System.out.println(bankaccount[i].getAccountNo()+"\t\t"+bankaccount[i].getAccountName()+"\t\t"+bankaccount[i].getBalance());
		}
		
		System.out.println("Check to see if account available in the array: Account 1");
		System.out.println("---------------------------------------------------------");
		BankAccount b; 
		b=bank.checkAccount("1");
		if (b != null) {
		System.out.println("Account found");
	 	System.out.println("Accountno:"+b.getAccountNo());
		System.out.println("AccountName:"+b.getAccountName());
		System.out.println("Account found:"+b.getBalance());  }
		else {
			System.out.println("Account not found:");
		};
		
		System.out.println("Check to see if account available in the array: Account 6");
		System.out.println("---------------------------------------------------------");
		b=bank.checkAccount("6");
		if (b != null) {
		System.out.println("Account found");
	 	System.out.println("Accountno:"+b.getAccountNo());
		System.out.println("AccountName:"+b.getAccountName());
		System.out.println("Account found:"+b.getBalance());  }
		else {
			System.out.println("Account not found:");
		};
		
		System.out.println("Show Balance: Account: 1");
		System.out.println("------------------------");
		double amt = bank.getBalance(bankaccount[1]);
		System.out.println("Balance:"+amt);
		
		
		System.out.println("Deposit Money (100): Account 1");
		System.out.println("------------------------------");
		boolean status;
		try {
		status = bank.depositMoney(bankaccount[1],100);
		
		if (status=true) {
			
			System.out.println("deposit successful");
		for (int i = 0; i < bank.getBankAccount().length; i++) {
			
			System.out.println(bankaccount[i].getAccountNo()+"\t\t"+bankaccount[i].getAccountName()+"\t\t"+bankaccount[i].getBalance());
		}
		
		}
		} catch (InvalidAmountException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("With draw Money (200): Account: 2");
		System.out.println("---------------------------------");
		
		try {
		status = bank.withdrawMoney(bankaccount[2],200);
		
		if (status=true) {
			
			System.out.println("withdrawal successful");
		for (int i = 0; i < bank.getBankAccount().length; i++) {
			
			System.out.println(bankaccount[i].getAccountNo()+"\t\t"+bankaccount[i].getAccountName()+"\t\t"+bankaccount[i].getBalance());
		}
		
		}
		
		} catch (InsufficientFundException e)
		{
			System.out.println(e.getMessage());

		}
		
		
		System.out.println("Transfer Money (100): Account 0 -> Account 2");
		System.out.println("--------------------------------------------");
		status = bank.transferMoney(bankaccount[0],bankaccount[2],100);
		
		if (status=true) {
			
			System.out.println("transferMoney successful");
		for (int i = 0; i < bank.getBankAccount().length; i++) {
			
			System.out.println(bankaccount[i].getAccountNo()+"\t\t"+bankaccount[i].getAccountName()+"\t\t"+bankaccount[i].getBalance());
		}
		
		}
		
		System.out.println("InvalidAmountException while deposit (-100): Account 1");
		System.out.println("----------------------------------------");
		
		try {
		status = bank.depositMoney(bankaccount[1],-100);
		
		if (status=true) {
			
			System.out.println("Deposit successful");
		for (int i = 0; i < bank.getBankAccount().length; i++) {
			
			System.out.println(bankaccount[i].getAccountNo()+"\t\t"+bankaccount[i].getAccountName()+"\t\t"+bankaccount[i].getBalance());
		}
		
		}
		} catch (InvalidAmountException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("InsufficientFundException while withdraw (2200): Account: 2");
		System.out.println("--------------------------------------------");
		
		try {
		status = bank.withdrawMoney(bankaccount[2],2200);
		
		if (status=true) {
			
			System.out.println("withdrawal successful");
		for (int i = 0; i < bank.getBankAccount().length; i++) {
			
			System.out.println(bankaccount[i].getAccountNo()+"\t\t"+bankaccount[i].getAccountName()+"\t\t"+bankaccount[i].getBalance());
		}
		
		}
		
		} catch (InsufficientFundException e)
		{
			System.out.println(e.getMessage());

		}
		
		
	    
	}	
	 }
	
	
	
	
		

		
	
	
