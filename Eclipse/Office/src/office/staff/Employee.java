package office.staff;

public abstract class Employee extends Person 
{
	private int empid;
	protected double salary;
	public Employee() 
	{
		super();
		empid = 0000;
		salary = 1000.2563;
	}
	public Employee(String name, int dd, int mm, int yy, int empid, double salary) 
	{
		super(name, dd, mm, yy);
		this.empid = empid;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString()+ "Employee [empid=" + empid + ", salary=" + salary + "]";
	}
	
	public void display()
	{
		super.display();
		System.out.println("Employee Id = "+empid);
		System.out.println("Salary = "+salary);
	}
	public abstract double calsal();
	
		
}
