package school.student;

import java.util.Scanner;
import school.student.Student;

public class Main_Student {

	public static void main(String[] args) 
	{
		int per=0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		Student [] sarr = new Student[5];
		
		for (int i = 0 ; i<5 ; i++)
		{
			System.out.println("Enter Roll No : ");
			int rollno = sc.nextInt();
			System.out.println("Enter Name : ");
			String name = sc.next();
			System.out.println("Enter Number of Subject : ");
			int nos = sc.nextInt();
			int [] mos = new int[nos];
			for(int j = 0 ; j <nos ; j++)
			{
			System.out.println("Enter Marks Subject"+(j+1)+" : ");
			mos[j] = sc.nextInt();
			sum=sum+mos[j];
			}
			sarr[i]= new Student(rollno , name , nos , mos);
			sarr[i].display();
			sum= sum *100;
			per=sum/(nos*100);
			System.out.println("Percentage = "+per);
		}
		
	}

}
