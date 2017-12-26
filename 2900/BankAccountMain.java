package com.htc.exercise5and6and15and19;

public class BankAccountMain {
  public static void main(String[] args) {
	  
	  Bank bnk=new Bank(null);
	  
	  BankAccount[] bankaccount= {new BankAccount("Oindu",100.00),
			                      new BankAccount("Surya",200.00)};
	  
	  
	  
	  bnk.setBankaccount(bankaccount);
	  for (BankAccount bankAccount2 : bankaccount) {
		  System.out.println(bankAccount2);
	  }
      try {
	  System.out.println("Checking Account: :" + bnk.checkAccount(2));
      System.out.println("Checking Balance: "+ bnk.getBalance(bnk.checkAccount(1)));
      System.out.println("Deposite: " + bnk.depositMoney(bnk.checkAccount(1), 200.00));      
      System.out.println("Deposite: " + bnk.depositMoney(bnk.checkAccount(1), 100.00)); 
      System.out.println("Checking balance after deposite" + bnk.checkAccount(1));
      System.out.println("WithdraMoney" + bnk.withdrawMoney(bnk.checkAccount(1), 100.00)); 
      System.out.println("Checking balance after withdraw" + bnk.checkAccount(1));
      System.out.println("Transfer Money" + bnk.transferMoney(bnk.checkAccount(1), bnk.checkAccount(2), 30.00));
      }catch (InvalidAmountException iame) {
    	  System.out.println(iame.getMessage());
      }catch (InsufficientFundException ife) {
    	  System.out.println(ife.getMessage());
      }
	  System.out.println("After all the operation");
      for (BankAccount bankAccount2 : bankaccount) {
		 System.out.println(bankAccount2);
	}
  }
}
