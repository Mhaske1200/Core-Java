package namemain;

import java.util.Scanner;

import nameexception.NameException;

public class Main {


	public static void main(String[] args) 
	{
		String firstname , lastname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name - ");
		firstname = sc.next();
		System.out.println("Enter Last Name - ");
		lastname = sc.next();
		
		
		try 
		{
			checkname(firstname, lastname);
		}
		catch ( NameException e)
		{
			System.out.println(e);
		}
		
		
	}
	
	public static void checkname(String firstname , String lastname) throws NameException
	{
		
		if((firstname.charAt(0)) >= 65 && (firstname.charAt(0)) <= 90 && (lastname.charAt(0)) >= 65 && (lastname.charAt(0)) <= 90 )
		{
			System.out.println("Welcome "+firstname+ ""+lastname);
		}
		else
		{
			throw new NameException();
		}
	}

}
