package instruction;

import java.util.Scanner;

public class HandellingArray {

	public static void main(String[] args) 
	{
		try
		{
		Scanner sc = new Scanner (System.in);
		System.out.println("Declare Array Size - ");
		int n;
		n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Elements - ");
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Index Number - ");
		int ind= sc.nextInt();
		
		System.out.println("Element @ "+ind+" Position is "+arr[ind]);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
