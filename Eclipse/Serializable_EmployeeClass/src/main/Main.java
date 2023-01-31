package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import special.staff.Admin;
import special.staff.Programmer;
import special.staff.SalesManager;
import staff.Employee;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\Object.dat"));

		/*
		 * Employee e = new
		 * SalesManager("Shubham",25,01,1998,2369,85000.00,1000.000,2.4,12);
		 * 
		 * oos.writeObject(e);
		 */

		Employee[] allemp = new Employee[3];
		allemp[0] = new SalesManager("ARUN KUMAR", 4, 5, 1975, 2147, 98000.236, 10000.00, 4500.00, 20.00);
		allemp[1] = new Programmer("SHUBHAM MHASKE", 25, 1, 1998, 2369, 85000.1456, 45.5, 500.00, 15.00);
		allemp[2] = new Admin("PRIYANKA JADHAV", 19, 2, 1985, 2140, 45000.00, 1500.00);

		for (Employee e : allemp) {
			oos.writeObject(e);
		}

		System.out.println("File Object Created");

		oos.close();

		
		  ObjectInputStream ois = new ObjectInputStream(new
		  FileInputStream("D:\\\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\\\Object.dat"));
		  
			/*
			 * for (Employee e : allemp) 
			 * { Object o = ois.readObject();
			 * System.out.println((Employee)o); 
			 * }
			 */
		  
		  List<Employee> emps = new ArrayList<>();
		  while(true)
		  {
			  try
			  {
				  Employee e = (Employee)ois.readObject();
				  emps.add(e);
				  System.out.println(e);
			  }
			  catch(Exception e)
			  {
				  break;
			  }
		  }
		 

	}

}
