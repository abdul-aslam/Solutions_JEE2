
public class BankAccount {
	
	String accountNo, accountName;
	int balance;
	
	BankAccount(String accNo) {
		balance = 1000;
		this.accountNo = accNo;
		System.out.println("accountNo  = " +accountNo);
	}
	
	BankAccount(String accNo,String accName) {
		balance = 1000;
		this.accountName = accName;
		accountNo = accNo;
		System.out.println("accountNo" +accountNo + "  " + "accountName  = " +accountName);
	
	}
	
	void display(){
		System.out.println("Inside Display ");
		System.out.println("accountNo" +accountNo + " " + "accountName  = " +accountName +" " +"balance = "+balance);
	}
	
	public static void main(String args[]){
		BankAccount obj = new BankAccount("12345");
		BankAccount obj1 = new BankAccount("123456789","ABC");
		obj.display();obj1.display();
		
		
	}
	
}
