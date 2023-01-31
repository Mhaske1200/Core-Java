package special.staff;

import staff.Employee;

public class SalesManager extends Employee
{
	private double target;
	private double incentive;
	private double no_of_days_travelled;
	public SalesManager() 
	{
		super();
		target = 000.00;
		incentive = 0.00;
		no_of_days_travelled = 0.00;
		
	}
		
	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, double target, double incentive,
			double no_of_days_travelled) {
		super(name, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
		this.no_of_days_travelled = no_of_days_travelled;
	}

	@Override
	public String toString() {
		return super.toString()+"SalesManager [target=" + target + ", incentive=" + incentive + ", no_of_days_travelled="
				+ no_of_days_travelled + "]";
	}
	public void display()
	{
		super.display();
		System.out.println("Target = "+target);
		System.out.println("Incentive = "+incentive);
		System.out.println("Number of Days Travelled = "+no_of_days_travelled);
	}
	public double calsal()
	{
		double final_sal = (incentive / 100);
		return salary + (target * final_sal);
	}
	
	
}
