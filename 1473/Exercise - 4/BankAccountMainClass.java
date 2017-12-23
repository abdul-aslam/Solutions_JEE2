package com.htc.bankaccount;

import java.util.Scanner;

public class BankAccountMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String accNumber;
		String accName;
		Scanner inputReader = new Scanner(System.in);
		
		System.out.println("Enter the Bank Account No   : ");
		accNumber = inputReader.next();
		System.out.println("Enter the Back Account Name : ");
		accName = inputReader.next();
		
		
		
		BankAccount bankAcc = new BankAccount(accNumber,accName);
		
		//output using the getter method
		System.out.println("");
		System.out.println("Output using the getter method");
		System.out.println("Bank Account No         : "+bankAcc.getAccountNo());
		System.out.println("Bank Account Name    : "+bankAcc.getAccountName());
		System.out.println("Bank Account Balance : "+bankAcc.getBalance());

		
		//output using the toString method
		System.out.println("");
		System.out.println("To String Method output");
		System.out.println(bankAcc.toString());

	}

}
