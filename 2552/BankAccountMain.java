package com.htc.cjavaexercises1.entity;

public class BankAccountMain {
	
	/* Main method */
	public static void main(String[] args) {
		  BankAccount b1=new BankAccount("C101","Clark");
		  BankAccount b2=new BankAccount("C456","Thomas");
		  			
		    System.out.println("Bank Account: 1");
		    System.out.println("---------------");
			System.out.println("accountNo:"+b1.getAccountNo());
			System.out.println("accountName:"+b1.getAccountName());
			System.out.println("Balance:"+b1.getBalance());
			
			System.out.println("");
			
			System.out.println("Bank Account: 2");
			System.out.println("---------------");
			System.out.println("accountNo:"+b2.getAccountNo());
			System.out.println("accountName:"+b2.getAccountName());
			System.out.println("Balance:"+b2.getBalance());
		
	  }

}
