package staff;

import java.io.Serializable;

import utility.Date;

public class person implements Serializable
{
	private String name;
	Date bdate;
	
	public person() 
	{
		name="Unknown";
		bdate= new Date();
	}
	public person(String name, int dd , int mm ,int yy) 
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
