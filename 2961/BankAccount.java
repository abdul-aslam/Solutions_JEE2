package exercise;

public class BankAccount {
	private String accountNo;
	private String accountName;
	private int balance;
	
	public BankAccount(String accountNo, String accountName){
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = 1000;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() { 
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
