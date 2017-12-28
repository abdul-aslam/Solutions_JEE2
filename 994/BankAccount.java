
public class BankAccount { 
	private String accountno;
	private String accoutname;
	private Double balance;
	
	
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getAccoutname() {
		return accoutname;
	}
	public void setAccoutname(String accoutname) {
		this.accoutname = accoutname;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public BankAccount(String accountno, String accoutname) {
		super();
		this.accountno = accountno;
		this.accoutname = accoutname;
		this.balance = 1000.00;
	}
	
	
	
}
