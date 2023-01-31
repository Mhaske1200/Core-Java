package special.staff;

import staff.Employee;

public class Admin extends Employee 
{
	double bonus;

	public Admin() 
	{
		super();
		bonus = 0.00;
	}

	public Admin(String name, int dd, int mm, int yy, int empid, double salary, double bonus) {
		super(name, dd, mm, yy, empid, salary);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString()+ "Admin [bonus=" + bonus + "]";
	}
	
	public void display()
	{
		super.display();
		System.out.println("Bonus = "+bonus);
	}
	
	public double calsal()
	{
		return salary + bonus;
	}
	
}
