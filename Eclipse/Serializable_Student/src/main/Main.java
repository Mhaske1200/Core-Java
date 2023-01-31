package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import student.superclass.Student;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\Student.dat"));
		
		Student [] S = new Student [3];
		S[0]= new Student("Shubham", 25, 01, 1998, "SDRTYUB", 214563, "PGDAC", 1150000.014);
		S[1]=new Student("Vishal", 21, 06, 1995, "SDUB", 2145, "PGDMC", 1850000.014);
		S[2]=new Student("Harshad", 9, 12, 1995, "SDRT", 2163, "PGDBDA", 9550000.014);
		
		for(Student stu : S)
		{
			oos.writeObject(stu);
		}
		System.out.println("Object Written in File");
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\\\Student.dat"));
		
		Student [] S1 = new Student [3];
		
		for (int i =0 ; i<S1.length ; i++)
		{
			S1[i] = (Student) ois.readObject();
			System.out.println(S1[i]);
			S1[i].display();
		}
			
				
				
				
	}

}
