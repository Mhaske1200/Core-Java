package school.student;

public class Student 
{
	int rollno;
	String name;
	int nos;
	int mos[];
	public Student() 
	{
		rollno = 0;
		name = "Unknown";
		nos = 0;
		mos = new int[nos];
	}
	public Student(int rollno, String name, int nos, int[] mos) 
	{
		this.rollno = rollno;
		this.name = name;
		this.nos = nos;
		this.mos = mos;
	}
	
	public void display()
	{
		System.out.println("Roll Number = "+rollno+ " Name = "+name);
		System.out.println("Number of Subjects = "+nos);
		for ( int i = 0 ; i < nos ; i++ )
		{
			System.out.println("Marks of Subject = "+mos[i]);
		}
	}
		
}
