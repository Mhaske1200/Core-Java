package operations.main;

import java.util.Scanner;

import operation.StringOperations;
import operation.number.MyString;

public class MainString {

	public static void main(String[] args) 
	{
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String - ");
		str= sc.next();
		
		StringOperations o1 = new MyString();
		
		o1.reverse(str);
		o1.toUpperCase(str);
		System.out.println("Length of String = "+o1.length(str));
		if(o1.isPallindrome(str) == true )
		{
			System.out.println("String is Not Pallindrome");
		}
		else
		{
			System.out.println("String is Pallindrome");
		}
		System.out.println("Enter Second Sting to Concat - ");
		String str1 = sc.next();
		System.out.println(o1.append(str, str1));
		

	}

}
