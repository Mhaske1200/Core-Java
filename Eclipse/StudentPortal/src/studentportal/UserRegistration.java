package studentportal;

import java.util.Scanner;

public class UserRegistration extends Student {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		Student s1 = new Student();
		System.out.println("Enter Username");
		String a  =sc.next();
			 
		System.out.println("Enter UserCountry");
		String b  =sc.next();
			try
			{
				s1.registerUser(a,b);
			}
			catch(InvalidCountryException e)
			{
				System.out.println(e.getMessage());
			}
						
	}

}
