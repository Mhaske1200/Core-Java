package sort.main;

import java.util.Scanner;

import sort.collect.Student;
import sort.utility.MeritComparer;
import sort.utility.NameComparer;
import sort.utility.RollComparer;

public class MainComparer {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student [] s = new Student [5];
		
		for(int i = 0 ; i<5 ; i++)
		{
			System.out.println("Enter Roll Number :: ");
			int rollno = sc.nextInt();
			
			System.out.println("Enter Student Name :: ");
			String name = sc.next();
			
			System.out.println("Enter Marks :: ");
			int marks = sc.nextInt();
			
			s[i] = new Student(rollno , name , marks);
			//System.out.println(s[i].toString());
		}
		
		System.out.println("Student Information");
		for(int i = 0 ; i<s.length ; i++)
		{
			System.out.println(s[i].toString());
		}
		
		System.out.println("*****************************************************************");
		
		RollComparer r1 = new RollComparer();
		for(int i=0 ; i<s.length ; i++)
		{
			for ( int j = i+1 ; j<s.length ; j++)
			{
				if(r1.compare(s[i], s[j]) >0)
				{
					Student temp;
					temp= s[i];
					s[i]= s[j];
					s[j]= temp;
				}
			
			}		
		}
		System.out.println("Student Information after Roll No Sort - ");
		for(int i = 0 ; i<s.length ; i++)
		{
			System.out.println(s[i].toString());
		
		}
		
		System.out.println("*****************************************************************");
		
		NameComparer n1 = new NameComparer();
		for(int i=0 ; i<s.length ; i++)
		{
			for ( int j = i+1 ; j<s.length ; j++)
			{
				if(n1.compare(s[i], s[j]) >0)
				{
					Student temp;
					temp= s[i];
					s[i]= s[j];
					s[j]= temp;
				}
			
			}		
		}
		System.out.println("Student Information after Name Sort - ");
		for(int i = 0 ; i<s.length ; i++)
		{
			System.out.println(s[i].toString());
		
		}
		
		System.out.println("*****************************************************************");
		
		MeritComparer m1 = new MeritComparer();
		for(int i=0 ; i<s.length ; i++)
		{
			for ( int j = i+1 ; j<s.length ; j++)
			{
				if(m1.compare(s[i], s[j]) >0)
				{
					Student temp;
					temp= s[i];
					s[i]= s[j];
					s[j]= temp;
				}
			
			}		
		}
		System.out.println("Student Information after Merit Sort - ");
		for(int i = 0 ; i<s.length ; i++)
		{
			System.out.println(s[i].toString());
		
		}
	}

}
