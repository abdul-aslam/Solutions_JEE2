package com.htc.Exercise5and6;

import java.util.ArrayList;

public class Bank implements IBankServiceProvider {
   public ArrayList<BankAccount> bankAccounts = new ArrayList<>();
   static int lastAssignedNo = 0;
   
public ArrayList<BankAccount> getBankAccounts() {
	return bankAccounts;
}
public Bank(ArrayList<BankAccount> bankAccounts) {
	super();
	this.bankAccounts = bankAccounts;
}

public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
	this.bankAccounts = bankAccounts;
}
public static int getLastAssignedNo() {
	return Bank.lastAssignedNo;
}
public static void setLastAssignedNo(int lastAssignedNo) {
	 Bank.lastAssignedNo = lastAssignedNo;
}
   
   public void AddAccount(BankAccount bankAccount) {
	   bankAccounts.add(bankAccount);
  }
 
   public BankAccount checkAccount(String accountNo) {
	   BankAccount BA1 = new BankAccount();
	   BA1 = null;
	   for (BankAccount acctlist:this.bankAccounts)  {
		   if (acctlist.getAccountNo().equals(accountNo)) {
			   BA1 = acctlist;
			   break;
		   }
		}
	   return BA1;
   } 
   
   public double getBalance(BankAccount account) {
	   BankAccount BA1 = new BankAccount();
	   BA1 = this.checkAccount(account.getAccountNo());
	   if (BA1.equals(null)) 
	   	   return -1.0;
	   else
	 	   return BA1.getBalance();
	}
   
   public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException {
	   if (amount <= 0)
	   {   String E1 = "Amount less than or equal to zero can't be deposited";
	   InvalidAmountException ife = new InvalidAmountException(E1);
	   throw ife;
	   }  
	   BankAccount BA1 = new BankAccount();
	   BA1 = this.checkAccount(account.getAccountNo());
	   if (BA1.equals(null)) 
		   return false;
	   else {
		   BA1.setBalance(BA1.getBalance() + amount);
		   return true;
	   }
   }   
   
   public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException,InvalidAmountException {
	   if (amount <= 0)
	   {   	String E1 = "Amount less than or equal to zero can't be withdrawn";
	   		InvalidAmountException ife = new InvalidAmountException(E1);
	   		throw ife;
       }  	   
	   BankAccount BA1 = new BankAccount();
	   BA1 = this.checkAccount(account.getAccountNo());
	   if (BA1.equals(null)) 
			   return false;
	   else {
		   if (BA1.getBalance() < amount) 
		   {   String E1 = "Insuffient fund to withdraw";
			   InsufficientFundException ife = new InsufficientFundException(E1);
			   throw ife;
		   }
		   BA1.setBalance(BA1.getBalance() - amount);
		   return true;
	   }
	}   
   
   public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundException,InvalidAmountException {
	   if (amount <= 0)
	   {   String E1 = "Amount less than or equal to zero can't be transferred";
	   InvalidAmountException ife = new InvalidAmountException(E1);
	   throw ife;
       }  
	   BankAccount fromAcct = new BankAccount();
	   fromAcct = this.checkAccount(fromAccount.getAccountNo());
	   BankAccount toAcct = new BankAccount();
	   toAcct = this.checkAccount(toAccount.getAccountNo());
	   double fromBalance = fromAcct.getBalance();
	   if (fromBalance < amount) 
	   {   String E1 = "Insuffient fund to transfer";
	   	   InsufficientFundException ife = new InsufficientFundException(E1);
	       throw ife;
	   }
	   if (fromAcct.equals(null) || toAcct.equals(null) || fromBalance < amount) 
	 	   return false;
	   else {
	       toAcct.setBalance(toAcct.getBalance() + amount);
	       fromAcct.setBalance(fromAcct.getBalance() - amount);
	       return true;
       }
   }   
   
@Override
public String toString() {
	return "Bank [bankAccounts=" + bankAccounts + ", getBankAccounts()=" + getBankAccounts() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public static void main(String[] args) {
	
	BankAccount BA1;
	ArrayList<BankAccount> AccountsList = new ArrayList<>();
	BA1 = new BankAccount("First",7000);
	AccountsList.add(BA1);
	Bank BA = new Bank(AccountsList);
	BankAccount BA2 = new BankAccount("Second",5000);
	BA.AddAccount(BA2);
	BankAccount BA3 = new BankAccount("Third",15000);
	BA.AddAccount(BA3);
	System.out.println("CheckAccount 2: " + BA.checkAccount("2"));
	System.out.println("Get Balance from Account1 (7000): " + BA.getBalance(BA1));
	try
	{
	if (BA.depositMoney(BA2,5000) == true)
	{
		System.out.println("Deposit 5,000 into Account2 (5000+5000) is successful ");
	    System.out.println("Balance of account 2 after deposit : " + BA.getBalance(BA2));
	}    
	if (BA.withdrawMoney(BA3,12000) == true)
	{
		System.out.println("Withdraw 12,000 from Account3 (15000-12000) is successful");
		System.out.println("Balance of account 3 after withdraw : " + BA.getBalance(BA3));
	}
	if (BA.transferMoney(BA1,BA2,-1000) == true)
	{
		System.out.println("Transfer 2000 from BA1 to BA2 (7000-2000, 10000+2000) is successful");
		System.out.println("Balance after transfer, account 1 and account 2 : " + BA.getBalance(BA1) + "and" + BA.getBalance(BA2));
	}
	}
	catch (InvalidAmountException e)
	{
		System.out.println(e.getErrorMessage());
		e.printStackTrace();
	}
	catch (InsufficientFundException e1)
	{
		System.out.println(e1.getErrorMessage());
		e1.printStackTrace();
	}
	catch (Exception e2)
	{
		System.out.println("In common Exception");
		e2.printStackTrace();
	}
	finally 
	{
		System.out.println("In finally block finally!!");
	}
	}
}

