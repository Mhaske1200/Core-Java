package Instruction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 to Check the Divisors - ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2 to Check the Divisors - ");
		int num2 = sc.nextInt();
		System.out.println("Enter Number 3 to Check the Divisors - ");
		int num3 = sc.nextInt();
		
		Thread_Divisor r1 = new Thread_Divisor(num1);
		Thread_Divisor r2 = new Thread_Divisor(num2);
		Thread_Divisor r3 = new Thread_Divisor(num3);
		
			
		r1.getT().start();
		r2.getT().start();
		r3.getT().start();

	}

}
