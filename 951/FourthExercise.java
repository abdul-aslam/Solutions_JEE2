package com.htc.exercies;

public class FourthExercise {

	public FourthExercise() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.setAccountNo("SA12345");
		b1.setAccountName("Savings Account");
		b1.setBalance(2000.00);
		System.out.println("Savings Account " +b1);
		
		BankAccount b2 = new BankAccount("CA12345","Checking Account",2300.00);
		System.out.println("Savings Account " +b2);
		
		BankAccount b3 = new BankAccount("CC12345","Creditcard Account");
		System.out.println("Savings Account " +b3);
		
		
	}
}
