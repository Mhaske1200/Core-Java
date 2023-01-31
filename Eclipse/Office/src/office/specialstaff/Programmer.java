package office.specialstaff;

import office.staff.Employee;
import office.utility.ITraveller;

public class Programmer extends Employee implements ITraveller
{
	private double extra_hour;
	private double charges_per_hour;
	private double no_of_days_travelled;
	public Programmer() 
	{
		super();
		extra_hour=0.0;
		charges_per_hour=0.0;
		no_of_days_travelled = 0.00;
	}
	
	public Programmer(String name, int dd, int mm, int yy, int empid, double salary, double extra_hour,
			double charges_per_hour, double no_of_days_travelled) {
		super(name, dd, mm, yy, empid, salary);
		this.extra_hour = extra_hour;
		this.charges_per_hour = charges_per_hour;
		this.no_of_days_travelled = no_of_days_travelled;
	}

	@Override
	public String toString() {
		return super.toString()+"Programmer [extra_hour=" + extra_hour + ", charges_per_hour=" + charges_per_hour
				+ ", no_of_days_travelled=" + no_of_days_travelled + "]";
	}

	public void display()
	{
		super.display();
		System.out.println("Extra Hours Worked = "+extra_hour);
		System.out.println("Charges Per Hour of Programmer = "+charges_per_hour);
		System.out.println("Number of Days Travelled = "+no_of_days_travelled);
	}
	
	public double calsal()
	{
		return salary +(extra_hour * charges_per_hour);
	}
	
	@Override
	public double calculateTA() 
	{
		
		return (salary*DA/100)* no_of_days_travelled;
	}
	
}
