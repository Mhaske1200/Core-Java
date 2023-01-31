package student.superclass;

import java.io.Serializable;

import utility.Date;

public class Person implements Serializable
{
	private String name;
	Date bdate;
	
	public Person() 
	{
		name="Unknown";
		bdate= new Date();
	}
	public Person(String name, int dd , int mm ,int yy) 
	{
		this.name = name;
		this.bdate = new Date (dd, mm ,yy);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", bdate=" + bdate + "]";
	}
	public void display()
	{
		System.out.println("Name = "+name);
		bdate.show_date();
	}
	
	
}
