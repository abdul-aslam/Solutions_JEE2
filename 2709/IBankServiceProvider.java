package assignment2;

public interface IBankServiceProvider {
	
	public BankAccount checkAccount(String accountNo);
	public double getBalance( BankAccount account);
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException;
	public boolean withdrawMoney(BankAccount account, double amount)throws InvalidAmountException,InsufficientFundException;
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundException;
	


}
