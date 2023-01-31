package shop;

import java.util.Scanner;

import shop.list.Customer;
import shop.list.RegCustomer;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		double price;
		double dis;
		int choice = 0;
		System.out.println("Hello Customer !");
		System.out.println("Please Enter Valid Choice");
		System.out.println("Press 1 for Registered Customer - Press 2 for Not Registered Customer");
		System.out.println("Press 0 to Exit");
		choice = sc.nextInt();
		
		switch(choice)
		{	
			case 1 :
			{
				Customer c1 = new RegCustomer();
				System.out.println("Enter Mail ID :");
				String email = sc.next();
				System.out.println("Address :");
				String address = sc.next();
				System.out.println("Enter Registered Number :");
				int reg_no = sc.nextInt();
				System.out.println("Shopping Price :");
				price = sc.nextInt();			
				System.out.println("Amount to be Paid = "+c1.give_discount(price));
				break;
			}
			case 2 :
			{
				Customer c1 = new Customer();
				System.out.println("Enter Mail ID :");
				String email = sc.next();
				System.out.println("Address :");
				String address = sc.next();
				System.out.println("Shopping Price :");
				price = sc.nextInt();
				
				System.out.println("Amount to be Paid = "+c1.give_discount(price));
				break;
			}
			default :
			{
				System.out.println("Invalid Choice");
				break;
			}
		}
		
				
	}

}
