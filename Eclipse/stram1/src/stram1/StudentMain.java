package stram1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;


public class StudentMain extends Student {

	public static void main(String[] args) 
	{
		
		float marks[]=new float[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter Roll No :: ");
		int rollno = Integer.parseInt(br.readLine());
		System.out.println("Enter Name :: ");
		String name = br.readLine();
		System.out.println("Enter Number of Subject :: ");
		int nos = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i<nos ; i++)
		{
			System.out.println("Enter Marks for Subject "+i);
			marks[i] =Float.parseFloat(br.readLine());
		}
						
		Student s1 = new Student(rollno , name , nos , marks);
		
		s1.display();
				
		s1.calculategrade();
		}
		
		
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
