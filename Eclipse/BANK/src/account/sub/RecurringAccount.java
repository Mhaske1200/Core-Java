package account.sub;

import java.util.Scanner;

import account.Account;

public class RecurringAccount extends Account 
{
	double installment;
	int no_of_installments;
	static float int_rate;
	Scanner sc = new Scanner(System.in);
	static
	{
		int_rate = 4.5f ;
	}
	

	public RecurringAccount() 
	{
		super();
	}

	public RecurringAccount(int accno, String name, double balance, double installment , int no_of_installment) 
	{
		super(accno, name, balance);
		this.installment = installment;
		this.no_of_installments = no_of_installment;
	}
	


	@Override
	public String toString() {
		return super.toString()+ "RecurringAccount [installment=" + installment + "]";
	}

	@Override
	public void withdraw(double amt) 
	{
		System.out.println("Withdraw is Not Possible in Reccuring Account ");
	}

	@Override
	public double calBalance() 
	{	
		double finalbalance = balance + ( installment * no_of_installments);
		
		double totalbalance = finalbalance+(finalbalance*int_rate/100);
		
		return totalbalance;
	}
	
	
	
}
