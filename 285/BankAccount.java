package htc.package4;

public class BankAccount {
	private String accountNo;
	private String accountName;
	private double balance;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public BankAccount(String accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public BankAccount() {
		super();
		this.accountNo = " ";
		this.accountName = " ";
		this.balance = 0.00;
	}
	
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance=1000.00;
	}
		
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance
				+ ", getAccountNo()=" + getAccountNo() + ", getAccountName()=" + getAccountName() + ", getBalance()="
				+ getBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public static void main(String[] args) {
		BankAccount BA = new BankAccount("11111", "Smith");
		System.out.println(BA);
	}
}
