package instruction;

import java.util.Scanner;

public class PasswordExcep {

	public static void main(String[] args) 
	{
		try {
		String pass;
		Scanner sc = new Scanner(System.in);
		pass = sc.next();
		
		if(pass.length()>12)
		{
			return;
		}
		if(pass.length()<8)
		{
			return;
		}

		}
		catch(Exception e)
		{
			System.out.println("Password is Too Long");
		}
		//catch(Exception e)
		{
			System.out.println("Password is Too Short");
		}
		
		

	}

}
