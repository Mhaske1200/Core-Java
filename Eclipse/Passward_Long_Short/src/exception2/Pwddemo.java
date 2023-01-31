package exception2;

import java.util.Scanner;

public class Pwddemo 
{

	public static void main(String[] args)throws Exception
	{
		System.out.println("Enter the pwd");
		Scanner sc = new Scanner(System.in);
		String pwd = sc.next();
		
		if(pwd.length()<8)
		{
			throw new Pwdtooshort();
		}
		if(pwd.length()>12)
		{
			throw new Pwdtoolong();
		} 
		System.out.println("Correct Password");

	}
}
