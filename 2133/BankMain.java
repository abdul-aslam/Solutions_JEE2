package com.htc.CoreJava1.main;
import java.util.Scanner;

public class BankMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount[] bankacc = new BankAccount[4];
		bankacc[0] = new BankAccount ("SB1111111", "Praveen Ashokkumar");	
		bankacc[1] = new BankAccount ("SB2222222", "Harsha Rayala");
		bankacc[2] = new BankAccount ("SB3333333", "Ramchand Venkatasamy");
		bankacc[3] = new BankAccount ("SB4444444", "Arun Jayagopal");
		Bank bank = new Bank(bankacc);
		
		//String accNum = new Scanner(System.in).nextLine();
		String accNum = "SB2222222";
		
		BankAccount isaccexists;
		
		isaccexists = bank.checkAccount(accNum);
		
		if(isaccexists!= null)
		{
			System.out.println("Account# "+accNum+" exists "+isaccexists.toString());
			
			double accBalance = bank.getBalance(bankacc[0]);
			if(accBalance!= 0)
				System.out.println("Account# "+bankacc[0].accountNo+" balance is: "+accBalance);
			else
				System.out.println("Account# "+bankacc[0].accountNo+" not found, or account balance is: "+accBalance);
			
			//         deposit amount    //
			
			double depAmount = 2500d; //deposit amount
			
			boolean suceess = bank.depositMoney(bankacc[0],depAmount);
			if(suceess)
				System.out.println("$"+depAmount+" has been deposited in to Account# "+bankacc[0].accountNo+", new balance is: "+bankacc[0].accountBalance);
			else
				System.out.println("Unable to deposit $"+depAmount+ " into Account# "+bankacc[0].accountNo+" as acc# not found");
			
			//         Withdraw amount    //
			
			double withdrawlAmount = 100d; 
			
			suceess = bank.withdrawMoney(bankacc[0],withdrawlAmount);
			if(suceess)
				System.out.println("$"+withdrawlAmount+" has been withdrawn from Account# "+bankacc[0].accountNo+", new balance is: "+bankacc[0].accountBalance);
			else if (bank.checkAccount(bankacc[0].accountNo) != null)
					System.out.println("Unable to withdraw $"+withdrawlAmount+ " from Account# "+bankacc[0].accountNo+" because of insufficient funds");
			else
				System.out.println("Unable to withdraw $"+withdrawlAmount+ " from Account# "+bankacc[0].accountNo+" as acc# not found");
		
			//         Transfer amount    //
			
			double amount = 500d;
			suceess = bank.transferMoney(bankacc[0],bankacc[1],amount);
			if(suceess)
				System.out.println("$"+amount+" has been transfered from Account# "+bankacc[0].accountNo+" to "+""+bankacc[1].accountNo+", new balance in from account is: "+bankacc[0].accountBalance+" and new balance in to account is: "+bankacc[1].accountBalance);
			else if (bank.checkAccount(bankacc[0].accountNo) == null)
				System.out.println("Unable to transfer $"+amount+ " from Account# "+bankacc[0].accountNo+" as acc# not found");
			else if (bank.checkAccount(bankacc[1].accountNo) == null)
				System.out.println("Unable to transfer $"+amount+ " to Account# "+bankacc[1].accountNo+" as acc# not found");
			else
				System.out.println("Unable to transfer $"+amount+ " from Account# "+bankacc[0].accountNo+" to "+bankacc[1].accountNo+" because of insufficient funds");
			
		}
		else
			System.out.println("Account# "+accNum+" not found..");
		

		

	}
}
