package com.htc.Exercise6.mian;
 
//Made by Ernest Paulino

import com.htc.Exercise6.entity.BankAccount;
import com.htc.Exercise6.entity.IBankServiceProvider;
import com.htc.Exercise6.entity.InsufficientFundException;
import com.htc.Exercise6.entity.InvalidAmountException;
 
public class Bank implements IBankServiceProvider{
 
	static Bank custAccount = new Bank();
    // Creating array of BankAccount         
    static BankAccount[] accountHolders = new BankAccount[3];

@Override
public BankAccount checkAccount(String accountNo) {
	// Check if account no. is in the array
	for (int i = 0; i < accountHolders.length; i++) {
		if (accountHolders[i].getAccountNo().equals(accountNo)) {
    		return accountHolders[i];
    	}
	}
	return null;
}


@Override
public double getBalance(BankAccount account) {
	BankAccount findAccountBalance = new BankAccount();
	
	// Calling checkAccount to check if account no. is in the array
	findAccountBalance = custAccount.checkAccount(account.getAccountNo());
	
    if (findAccountBalance != null) {
		System.out.println("Account Number " + 
				findAccountBalance.getAccountNo() +
			   " found on array.");
		System.out.println("Account Balance is  " + 
				findAccountBalance.getBalance());
		// Displaying Array contents for verification purposes only
		System.out.println(findAccountBalance);
		return (findAccountBalance.getBalance());
    }
    else
    {
		System.out.println("Account Number " + 
				account.getAccountNo() +
			   " is not found on array.");
		return 0;
    }

}


@Override
public boolean depositMoney(BankAccount account, double amount)
	throws 	InvalidAmountException
	{
	BankAccount findAccountBalance = new BankAccount();
	
	// Calling checkAccount to check if account no. is in the array
	findAccountBalance = custAccount.checkAccount(account.getAccountNo());
	
    if (findAccountBalance != null) {
		System.out.println("Account Number " + 
				findAccountBalance.getAccountNo() +
			   " found on array.");
		System.out.println("Current Account Balance is  " + 
				findAccountBalance.getBalance());
		// Displaying Array contents for verification purposes only
		System.out.println(findAccountBalance);
		System.out.println("Deposit Amount is  " + 
				amount);		
		
		if (amount < 0) {
			throw new InvalidAmountException
					("Deposit Denied - Deposit amount is less than zero.");
		}
		else {
			// Adding deposit amount to balance
			findAccountBalance.setBalance(amount + findAccountBalance.getBalance());
			return true;
		}
    }
    else
    {
		System.out.println("Account Number " + 
				account.getAccountNo() +
			   " is not found on array.");
		return false;
    }
}


@Override
public boolean withdrawMoney(BankAccount account, double amount)
	throws 	InsufficientFundException
	{
	BankAccount findAccountBalance = new BankAccount();
	
	// Calling checkAccount to check if account no. is in the array
	findAccountBalance = custAccount.checkAccount(account.getAccountNo());
	
    if (findAccountBalance != null) {
		System.out.println("Account Number " + 
				findAccountBalance.getAccountNo() +
			   " found on array.");
		System.out.println("Current Account Balance is  " + 
				findAccountBalance.getBalance());
		// Displaying Array contents for verification purposes only
		System.out.println(findAccountBalance);
		System.out.println("Withdrawal Amount is  " + 
				amount);		
		
		if (amount > findAccountBalance.getBalance()) {
			System.out.println("Withdrawal Denied");
			System.out.println("Withdrawal Amount of "+
					amount +
					" is greater than current Account Balance of " +
					findAccountBalance.getBalance());
			throw new InsufficientFundException
					("Withdrawal Denied - Insufficient Funds.");
		}
		else
		{
			// Subtracting deposit amount to balance
			findAccountBalance.setBalance(findAccountBalance.getBalance() - amount);
			return true;
		}
    }
    else
    {
		System.out.println("Account Number " + 
				account.getAccountNo() +
			   " is not found on array.");
		return false;
    }

}

@Override
public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) 
		throws 	InsufficientFundException
	{
	BankAccount findfromAccountBalance = new BankAccount();
	BankAccount findtoAccountBalance   = new BankAccount();
	
	// Calling checkAccount to check if account no. is in the array
	findfromAccountBalance = custAccount.checkAccount(fromAccount.getAccountNo());
	findtoAccountBalance   = custAccount.checkAccount(toAccount.getAccountNo());
	
	// From Account not found
	if (findfromAccountBalance == null)  {
		System.out.println("From Account Number " + 
				fromAccount.getAccountNo() +
			   " is not found on array.");
		return false;
	}	

	// To Account not found
	if (findtoAccountBalance == null) {
		System.out.println("To Account Number " + 
				toAccount.getAccountNo() +
			   " is not found on array.");
		return false;
	}
	
    // Check From Account balance if it can handle transfer withdrawal
	if (amount > findfromAccountBalance.getBalance()) {
		System.out.println("Transfer Denied");
		System.out.println("From Account Number " + 
				findfromAccountBalance.getAccountNo() +
			   " found on array.");
		System.out.println("From Current Account Balance is  " + 
				findfromAccountBalance.getBalance());
		System.out.println("Transfer Amount of "+
				amount +
				" is greater that current Account Balance of " +
				findfromAccountBalance.getBalance());
		throw new InsufficientFundException
		("Transfer Denied - Insufficient Funds.");
	}
	
	// All conditions valid, proceed with Transfer
	System.out.println("From Account Number " + 
			findfromAccountBalance.getAccountNo() +
		   " found on array.");
	System.out.println("From Current Account Balance is  " + 
			findfromAccountBalance.getBalance());
	
	System.out.println("To Account Number " + 
			findtoAccountBalance.getAccountNo() +
		   " found on array.");
	System.out.println("To Current Account Balance is  " + 
			findtoAccountBalance.getBalance());

	// Subtracting amount
	findfromAccountBalance.setBalance(findfromAccountBalance.getBalance() - amount);
	// Adding amount
	findtoAccountBalance.setBalance(findtoAccountBalance.getBalance() + amount);	

	System.out.println("Money transfer complete");
	
	return true;
}
   

    



public static void main(String[] args) {
    // TODO Auto-generated method stub

    // Creating input
    accountHolders[0] = new BankAccount("Marlon Brando");
    accountHolders[1] = new BankAccount("Christopher Reeves");
    accountHolders[2] = new BankAccount("Charlton Heston");
   
    // Printing out array content for data verification
    for (BankAccount accounts: accountHolders) {
            System.out.println(accounts);
    }
    
    System.out.println("*********************************************");
    
    
    // *********************************************
    
    String custaccountNo;
    BankAccount foundAccount  = new BankAccount();
    BankAccount firstAccount  = new BankAccount();
    BankAccount secondAccount = new BankAccount();
  
    // *********************************************
    // Account 2 found
    
    custaccountNo = "2";
    
    foundAccount = custAccount.checkAccount(custaccountNo);
    
    // Display status
    if (foundAccount != null) {
		System.out.println("Account Number " + 
				custaccountNo +
			   " found on array.");
		// Displaying Array contents for verification purposes only
		System.out.println(foundAccount);
    }
    else
    {
		System.out.println("Account Number " + 
				custaccountNo +
			   " is not found on array.");
    }

    System.out.println("*********************************************");
    
    // *********************************************
    // Account 3 not found
    custaccountNo = "3";
 
    foundAccount = custAccount.checkAccount(custaccountNo);
   
    // Display status
    if (foundAccount != null) {
		System.out.println("Account Number " + 
				custaccountNo +
			   " found on array.");
		// Displaying Array contents for verification purposes only
		System.out.println(foundAccount);
    }
    else
    {
		System.out.println("Account Number " + 
				custaccountNo +
			   " is not found on array.");
    }

    System.out.println("*********************************************");
    
    // *********************************************
    // Get balance
    System.out.println("Get Balance");
    foundAccount = new BankAccount();
        
    custaccountNo = "1";
    foundAccount.setAccountNo(custaccountNo);
    
    // Call getBalance to display balance
    custAccount.getBalance(foundAccount);
    
    System.out.println("*********************************************");

    // *********************************************
    // Deposit Money
    
    System.out.println("Deposit Money");
    foundAccount = new BankAccount();
    
    custaccountNo = "2";
    foundAccount.setAccountNo(custaccountNo);
    
    try {
		custAccount.depositMoney(foundAccount, 750);
	} catch (InvalidAmountException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    
    // Printing out array content for data verification
    for (BankAccount accounts: accountHolders) {
            System.out.println(accounts);
    }
    

    System.out.println("*********************************************");

    // *********************************************
    // Withdraw Money

    System.out.println("Withdraw Money");
    foundAccount = new BankAccount();
    
    custaccountNo = "0";
    foundAccount.setAccountNo(custaccountNo);
    
    try {
		custAccount.withdrawMoney(foundAccount, 750);
	} catch (InsufficientFundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    // Printing out array content for data verification
    for (BankAccount accounts: accountHolders) {
            System.out.println(accounts);
    }

    System.out.println("*********************************************");
    
    // *********************************************
    // Withdraw Money - Denied for Insufficent Funds

    System.out.println("Withdraw Money - Denied for Insufficent Funds");
    foundAccount = new BankAccount();
    
    custaccountNo = "0";
    foundAccount.setAccountNo(custaccountNo);
    
    try {
		custAccount.withdrawMoney(foundAccount, 750);
	} catch (InsufficientFundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    // Printing out array content for data verification
    for (BankAccount accounts: accountHolders) {
            System.out.println(accounts);
    }
    
    System.out.println("*********************************************");
    
    // *********************************************
    // Transfer Money

    System.out.println("Transfer Money");
    
    // Setting From Account
    custaccountNo = "2";
    firstAccount.setAccountNo(custaccountNo);

    // Setting To Account
    custaccountNo = "0";
    secondAccount.setAccountNo(custaccountNo);
    
    try {
		custAccount.transferMoney(firstAccount, secondAccount, 750);
	} catch (InsufficientFundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    // Printing out array content for data verification
    for (BankAccount accounts: accountHolders) {
            System.out.println(accounts);
    }
    
    System.out.println("*********************************************");
    
    
    // *********************************************
    // Transfer Money - Denied for Insufficent Funds

    System.out.println("Transfer Money");
    
    // Setting From Account
    custaccountNo = "2";
    firstAccount.setAccountNo(custaccountNo);

    // Setting To Account
    custaccountNo = "0";
    secondAccount.setAccountNo(custaccountNo);
    
    try {
		custAccount.transferMoney(firstAccount, secondAccount, 3050);
	} catch (InsufficientFundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    // Printing out array content for data verification
    for (BankAccount accounts: accountHolders) {
            System.out.println(accounts);
    }
    
    System.out.println("*********************************************");

    // *********************************************
    // Deposit Money - Denied, deposit amount is less than zero
    
    System.out.println("Deposit Money");
    foundAccount = new BankAccount();
    
    custaccountNo = "2";
    foundAccount.setAccountNo(custaccountNo);
    
    try {
		custAccount.depositMoney(foundAccount, -200);
	} catch (InvalidAmountException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    
    // Printing out array content for data verification
    for (BankAccount accounts: accountHolders) {
            System.out.println(accounts);
    }
    

    System.out.println("*********************************************");

    // *********************************************

    
    
    System.out.println("End of Program");
    }



	}
