package assignment2;

public class BankMain {

	public static void main(String[] args) {
		BankAccount bankAcc1 = new BankAccount("SBI12345","Bhaskar"); bankAcc1.setBalance(10000.00);
		BankAccount bankAcc2 = new BankAccount("SBI89785","Sridhar"); bankAcc2.setBalance(20000.00);
		BankAccount bankAcc3 = new BankAccount("SBI56891","Jawa");    bankAcc3.setBalance(30000.00);
		BankAccount bankAcc4 = new BankAccount("SBI22331","Dinesh");  bankAcc4.setBalance(40000.00);
		BankAccount bankAcc5 = new BankAccount("SBI77777","Jesh");    bankAcc5.setBalance(50000.00);
		
		BankAccount[] bankAccArray = new BankAccount[5];
		bankAccArray[0] = bankAcc1;bankAccArray[1] = bankAcc2;bankAccArray[2] = bankAcc3;
		bankAccArray[3] = bankAcc4;bankAccArray[4] = bankAcc5;
		
		Bank sbiBank = new Bank(bankAccArray); 
		
		System.out.println("*****************************************************************");
		
		System.out.println("SBI77777 Bank Details " +sbiBank.checkAccount("SBI77777"));
		System.out.println(bankAcc1.getAccountNo() + " Balanace is " + sbiBank.getBalance(bankAcc1));
		
		System.out.println("*****************************************************************");
		
			try {
				System.out.println(bankAcc3.getAccountNo() + " Original Balanace is   "+bankAcc3.getBalance() );
				sbiBank.depositMoney(bankAcc3, 30000.00);
				System.out.println(bankAcc3.getAccountNo() + " Deposited 30000.00 and New Balanace is   "+bankAcc3.getBalance() );
				}catch(InvalidAmountException iae){
							System.out.println(iae.getErrorMessage());
				}
		System.out.println("*****************************************************************");
			try {
				System.out.println(bankAcc5.getAccountNo() + "  Original Balanace is "+bankAcc5.getBalance() );
				sbiBank.withdrawMoney(bankAcc5, 40000.00);
				System.out.println(bankAcc5.getAccountNo() + "  WithDrawal of  40000.00 and New Balanace is "+bankAcc5.getBalance() );
			
				}catch(InsufficientFundException isf){
				System.out.println(isf.getErrorMessage());
				}catch(InvalidAmountException iae){
					System.out.println(iae.getErrorMessage());
				}
			
			System.out.println("*****************************************************************");
			try {
				System.out.println( "Balanace in" + bankAcc1.getAccountNo()+ "-->  " + bankAcc1.getBalance() );
				System.out.println( "Balanace in" + bankAcc2.getAccountNo()+ "-->  " + bankAcc2.getBalance() );
				sbiBank.transferMoney(bankAcc1, bankAcc2, 60000);
				System.out.println(bankAcc1.getAccountNo() + " did 69000.00 to " + bankAcc2.getAccountNo() );
				System.out.println( "New Balanace in" + bankAcc1.getAccountNo()+ "-->  " + bankAcc1.getBalance() );
				System.out.println( "New Balanace in" + bankAcc2.getAccountNo()+ "-->  " + bankAcc2.getBalance() );
			
				}catch(InsufficientFundException isf){
				System.out.println(isf.getErrorMessage());
				}
			

	}

}
