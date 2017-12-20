public class BankAccount
{
	
	public String accountNo; 
    public String accountName;
    public double accountBalance;
    
	public BankAccount(String accountNo, String accountName) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		accountBalance = 1000.00;
	}
	public BankAccount() {
		super();
		
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
    
   
}
