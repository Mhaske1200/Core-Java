package account;

public abstract class Account 
{
	int accno;
	String name;
	protected double balance;
	public Account() 
	{
		accno = 0000;
		name = "Unknown";
		balance = 0.000;
	}
	public Account(int accno, String name, double balance) 
	{
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}
	public abstract void withdraw(double amt);
	
	public abstract double calBalance();
	
	
}
