package office.staff;

public class Doctor extends Person 
{
	String degree;
	int regno;
	double salary;
	public Doctor() 
	{
		super();
		degree="Invalid";
		regno = 0000;
		salary = 10000.002;
	}
	public Doctor(String name , int dd , int mm , int yy ,String degree, int regno, double salary) {
		super(name , dd ,mm , yy);
		this.degree = degree;
		this.regno = regno;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString()+ "Doctor [degree=" + degree + ", regno=" + regno + ", salary=" + salary + "]";
	}
	
	public void show()
	{
		super.display();
		System.out.println("Degree = "+degree);
		System.out.println("Registration Number = "+regno);
		System.out.println("Salary = "+salary);
		
	}
	
}
