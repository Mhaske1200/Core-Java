package prime_multi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number :: ");
		int sn = sc.nextInt();
		System.out.println("Enter End Number :: ");
		int en = sc.nextInt();
		
		Runnable r = new Prime(sn , en);
		Thread t = new Thread(r);
		
		t.start();

	}

}
