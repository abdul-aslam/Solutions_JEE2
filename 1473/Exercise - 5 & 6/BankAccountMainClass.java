package com.htc.bankaccount;

import java.util.Scanner;

public class BankAccountMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String accountNo  ;
		String fromAccNo;
		String toAccNo;
		double depositAmt = 0.0;
		double withdrawAmt = 0.0;
		
		

		// loading the value into the Bank account collection
		BankAccount[] accData= {
				new BankAccount("Pradeep",5000),
				new BankAccount("Anu",6000),
				new BankAccount("Karthi",8000),
				new BankAccount("Raj",7000),
			
		};

		
			
		//Creating the instance for Bank class
		Bank bank = new Bank(accData);

		//Creating the instanace of the Bank Account class
		BankAccount accExists = new BankAccount();

		

		try
		{
			Scanner inputReader = new Scanner(System.in);
			System.out.println("Enter the Account No");
			accountNo = inputReader.next();

			// Check whether the account exists or not
			accExists = bank.checkAccount(accountNo);
			if(accExists != null)
			{
				System.out.println("Account exists in the Bank");
			}
						
             System.out.println();
			//Getting the account balace for the given account
			System.out.println("Account Number  :" + accountNo +" \t Account Balance : " + bank.getBalance(accExists));
	
		
			System.out.println();
			//Get the amount to be deposit from the user
			System.out.println("Enter the amount to be deposited in the Account " + accountNo);
			depositAmt = inputReader.nextDouble();
			
			// Logic for depositing the amount to bank account
			if (bank.depositMoney(accExists,depositAmt)) 
			{
				System.out.println("Amount deposited to the account  " + accountNo + "  and account balance:" +bank.getBalance(accExists) );
			}
			else
			{
				System.out.println(" Amount not deposited to the account " + accountNo);
			}
            
			System.out.println();
			//Logic for withdrawing the amount from the account
			System.out.println("Enter the amount to be withdrawn from the Account " + accountNo);
			withdrawAmt = inputReader.nextDouble();


			if (bank.withdrawMoney(accExists,withdrawAmt)) 
			{
				System.out.println("Amount is withdrawn from  to the account  " + accountNo+ "  and account balance:" +bank.getBalance(accExists) );

			}

            System.out.println();
			// Transfer the amount from one account to another account.
			System.out.println("Enter the  From Account no for money transfer ");
			fromAccNo = inputReader.next();
			System.out.println("Enter the  To Account no for money transfer");
			toAccNo = inputReader.next();

            System.out.println();
			System.out.println("Current baalance in From Account before transfer  :"+ bank.getBalance(bank.checkAccount(fromAccNo)));
			System.out.println("Current balance in To  Account before transfer        : "+ bank.getBalance(bank.checkAccount(toAccNo)));
			System.out.println();
			
			if (bank.transferMoney(bank.checkAccount(fromAccNo), bank.checkAccount(toAccNo))) 
			{

				System.out.println("From Account Balance after money transfer:"+bank.getBalance(bank.checkAccount(fromAccNo)));
				System.out.println("To Account Balance after money transfer:"+ bank.getBalance(bank.checkAccount(toAccNo)));
			}
			else
			{
				System.out.println(" Amount is not transferred from account " + fromAccNo + "  to  account " + toAccNo);
			}
				
		}
		catch(AccountNotFoundException a)
		{
			System.out.println(a.toString());
		}
		catch(InsufficientFundException i)
		{
			System.out.println(i.toString());
		}
		catch(InvalidAmountException d)
		{
			System.out.println(d.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
		
	
	
		

	}



}
