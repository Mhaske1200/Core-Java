package account;

import java.util.Scanner;

import account.sub.RecurringAccount;
import account.sub.SavingAccount;

public class Main {

	public static void main(String[] args) 
	{
		int ch;
		Account[]acc = new Account[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to American Express");
		System.out.println("Please Select Account Type to Proceed");
		
		for(int i = 0 ; i<2 ; i++)
		{
			
		System.out.println("Enter Account Number :: ");
		int accno = sc.nextInt();
		
		System.out.println("Enter Account Holder Name :: ");
		String name = sc.next();
		
		System.out.println("Enter Balance :: ");
		double balance = sc.nextDouble();
		
		System.out.println("Kindly Enter 1. For Saving Account :: ");
		System.out.println("       Enter 2. For Recurring Account ::");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			{
				double amount;
				System.out.println("Enter Amount to Withdraw :: ");
				amount = sc.nextDouble();
				acc[i]=new SavingAccount(accno,name,balance,amount);
				double x = acc[i].calBalance();
				System.out.println("Amount after Adding Interest Rate = "+x);
				acc[i].withdraw(amount);
				break;
			}
		case 2:
			{
				double amount = 0;
				System.out.println("Enter Amount of Installment :: ");
				double installment= sc.nextInt();
				System.out.println("Enter Number of Installments :: ");
				int no_of_installments= sc.nextInt();
				acc[i]=new RecurringAccount(accno , name , balance , installment , no_of_installments );
				acc[i].withdraw(amount);
				double x = acc[i].calBalance();
				System.out.println("Amount after Adding Interest Rate = "+x);
				break;
			}
		default :
		{
			System.out.println("Invalid Choice");
			break;
		}
		
		}

		}
		for(int i = 0 ; i<2 ; i++)
		{
			System.out.println(acc[i].toString());
			if(acc[i] == null)
			{
				System.out.println("Invlid Choice Entered for "+acc[i]);
			}
		}
		sc.close();
	}

}
