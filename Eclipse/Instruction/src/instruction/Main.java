package instruction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String  :: ");
		str = sc.next();
		
		for(int i = 0 ; i <str.length() ; i++)
		{
			char a= str.charAt(i);
			System.out.println(a);
		}
		
		System.out.println("***************************************");
		
		for(int i = 0 ; i <str.length() ; i++)
		{
			if(str.charAt(i) >=65 && str.charAt(i) <=90)
			{
				System.out.println(str.charAt(i)+ " is of UpperCase");
			}
			else
			{
				System.out.println(str.charAt(i)+ " is of LowerCase");
			}
		}
		
		System.out.println("***************************************");
		
		for(int i = 0 ; i <str.length() ; i++)
		{
			if(str.charAt(i) >=65 && str.charAt(i) <=90)
			{
				char a = (char) (str.charAt(i) + 32);
				System.out.println(a);
			}
			else
			{
				char a = (char) (str.charAt(i) - 32);
				System.out.println(a);
			}
		
		}
		
		System.out.println("***************************************");
		
		String s1 ="";
		for(int i = str.length()-1 ; i >=0 ; i--)
		{
			s1 += str.charAt(i);
		}
		System.out.println(s1+ "   ::  Reverse String");
		
	}
	

}
