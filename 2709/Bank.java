package assignment2;

public class Bank implements IBankServiceProvider {
	
	BankAccount[] bankAccounts;
	static int lastAssignedNo=0;
	
	
	public Bank(BankAccount[] bankAccounts) {
		super();
		this.bankAccounts = bankAccounts;
	}
	
	@Override
	public BankAccount checkAccount(String accountNo) {
		
		for(BankAccount tempBankAcc : bankAccounts )
		{
			if(tempBankAcc.getAccountNo().equals( accountNo))
			{	
				return tempBankAcc;
			}
			
		}
		
		return null;
	}
	@Override
	public double getBalance(BankAccount account) {
		
		for(BankAccount tempBankAcc : bankAccounts )
		{
			if(tempBankAcc.getAccountNo().equals( account.getAccountNo()))
			{	
				return tempBankAcc.getBalance();
			}
			
		}
		
		return 0;
		
	}
	
	@Override
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException {

		if(amount < 0)
			throw new InvalidAmountException("Please Enter valid Amount to Deposit");
		
		
		for(BankAccount tempBankAcc : bankAccounts )
		{
			if(tempBankAcc.getAccountNo().equals( account.getAccountNo()))
			{	
				tempBankAcc.setBalance(tempBankAcc.getBalance()+ amount);
				return true;
			}
		}
		
		return false;
	}
	
	
	@Override
	public boolean withdrawMoney(BankAccount account, double amount) throws InvalidAmountException,InsufficientFundException {

		if(amount < 0)
			throw new InvalidAmountException("Please Enter valid Amount to to WithDraw");
		
		
		for(BankAccount tempBankAcc : bankAccounts )
		{
			if(tempBankAcc.getAccountNo().equals( account.getAccountNo()))
			{	
				Double tempbalance = tempBankAcc.getBalance();
				if(tempbalance > amount )
				{	
						tempBankAcc.setBalance(tempBankAcc.getBalance() - amount );
						return true;
				}
				else
					throw new InsufficientFundException("No Sufficent Amount to WithDraw Enter Lower Amounts to WithDraw");
			}
		}
		
		
		return false;
	}
	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount)
			throws InsufficientFundException {
		
				Double tempbalance = fromAccount.getBalance();
				if(tempbalance > amount )
				{	
						fromAccount.setBalance(fromAccount.getBalance() - amount );
						toAccount.setBalance(fromAccount.getBalance() + amount );
						return true;
				}
				else
					throw new InsufficientFundException("No Sufficent Amount to WithDraw Enter Lower Amounts to WithDraw");
			
		
	}

}
