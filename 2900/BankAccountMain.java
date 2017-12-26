package com.htc.exercise1stwk.main;

public class BankAccountMain {
  public static void main(String[] args) {
	  BankAccount bk= new BankAccount("100","SUUU");
	  
	  bk.setAccountName("Saving");
	  bk.setAccountNo("102");
	  System.out.println(bk.getAccountName());
	  System.out.println(bk.getAccountNo());
	  System.out.println(bk.balance);
  }
}
