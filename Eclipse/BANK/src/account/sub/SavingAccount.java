package account.sub;

import account.Account;

public class SavingAccount extends Account 
{
	static float int_rate;
	
	static
	{
		int_rate = 4.5f ;
	}
	
	public SavingAccount() 
	{
		super();
		
	}
	
	public SavingAccount(int accno, String name, double balance, double rembal) {
		super(accno, name, balance);
	}
	

	@Override
	public String toString() 
	{
		return super.toString();
	}

	@Override
	public void withdraw(double amt) 
	{
			balance = balance -amt;
			if( balance > 2000)
			{
				System.out.println("Amount Balance in Saving Account - "+balance);
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
	}

	@Override
	public double calBalance() 
	{
		balance += (balance*int_rate/100);
		
		return balance;
	}
	

}
