package countryExcepMain;

import java.util.Scanner;

import countryExcep.InvalidCountryException;

public class Main {
	

	public static void main(String[] args) 
	{
		String username;
		String userCountry;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name = ");
		username = sc.next();
		System.out.println("Enter Country =");
		userCountry = sc.next();
		try 
		{
		registerUser(username , userCountry);
		
		System.out.println("Welcome to "+userCountry);
		}
		catch (InvalidCountryException e)
		{
			System.out.println(e);
		}
		
		
				
	}
	
	public static void registerUser(String username , String userCountry) throws InvalidCountryException 
	{
		if(userCountry.equals("INDIA") || userCountry.equals("India") || userCountry.equals("india") )
		{
			System.out.println("User Registration Done Succesfully ");
		}
		else
		{
			throw new InvalidCountryException();
		}
	}

}
