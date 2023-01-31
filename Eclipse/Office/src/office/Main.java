package office;

import office.specialstaff.Admin;
import office.specialstaff.Programmer;
import office.specialstaff.SalesManager;
import office.staff.Employee;
import office.staff.Person;
import office.utility.ITraveller;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("***** Person Class ******");
		Person p1 = new Person();
		p1.display();
		System.out.println(p1.toString());
		
		Person p2 = new Person("Raj" , 15 , 01 , 2013);
		p2.display();
		System.out.println(p2.toString());
		
		System.out.println("***** Employee Class *****");
		/*
		 * Person p3 = new Employee(); // Employee Class is Abstract , Cant Create
		 * Object of Abstract Class p3.display(); System.out.println(p3.toString());
		 * 
		 * Person p4 = new Employee("Rajveer" , 15 , 1 , 2010 , 2323 , 25000.147);
		 * p4.display(); System.out.println(p4.toString());
		 */
		
		System.out.println("***** SuperStaff Class *****");
		Employee [] e = new Employee [3];
		
		e[0]= new SalesManager("ARUN KUMAR",4,5,1975,2147,98000.236,10000.00,4500.00,20.00);
		e[1]= new Programmer("SHUBHAM MHASKE",25,1,1998,2369,85000.1456,45.5,500.00,15.00);
		e[2]= new Admin("PRIYANKA JADHAV",19,2,1985,2140,45000.00,1500.00);
		
		double total=0;
		for(Employee all : e)
		{
			all.display();
			System.out.println(all.toString());
			System.out.println("Final Salary - "+all.calsal());
			total+= all.calsal();
			if ( all instanceof ITraveller && all instanceof SalesManager)
			{
			//SalesManager s = (SalesManager) all;
			System.out.println("Total Allowance = "+((SalesManager)all).calculateTA());
			}
			if ( all instanceof ITraveller && all instanceof Programmer)
			{
			System.out.println("Total Allowance = "+((Programmer)all).calculateTA());
			}
			
		}
		
		
		System.out.println("Total Salary = "+total);
	}

}
