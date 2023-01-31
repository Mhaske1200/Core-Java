package office.staff;

public class Person007
{
	String name;
	int age;

	public Person007()
	{
		name="Unknown";
		age = 1;
	}
	public Person007(String name , int age)
	{
		this.name=name;
		this.age=age;
	}

	public void Show()
	{
		System.out.println("Name = "+name+ "Age = "+age);	
	}

}