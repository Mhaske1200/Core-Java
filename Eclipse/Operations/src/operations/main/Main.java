package operations.main;

import java.util.Scanner;

import operation.IntOperations;
import operation.number.MyNumber;

public class Main {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::  ");
		n = sc.nextInt();
		
		IntOperations o1 = new MyNumber();
		
		if(o1.isEven(n))
		{
			System.out.println("Number is Even");
		}
		if(o1.isOdd(n))
		{
			System.out.println("Number is Odd");
		}
		if(o1.isPrime(n))
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
		
		System.out.println("Factorial of Given Number = "+o1.calFactorial(n));
		
	}

}
