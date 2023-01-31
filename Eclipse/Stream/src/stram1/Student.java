package stram1;

public class Student 
{
	int rollno;
	String name;
	int nos;
	float mos[];
	float per=0;
	float sum=0;
	public Student() 
	{
		rollno = 0;
		name = "Unknown";
		nos = 0;
		mos = new float [nos];
	}
	public Student(int rollno, String name, int nos, float[] mos) 
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
	public void calculategrade()
	{
		for ( int i = 0 ; i<nos ; i++)
		{
			sum = sum+mos[i];
		}
		sum = sum *100;
		per = sum/(nos*100);
		
		System.out.println("Percentage of Subject = "+per);
		
		if(per>=90.00f)
		{
			System.out.println(per+" Excellent !");
		}
		if(per>=80.00f && per <90.00f)
		{
			System.out.println(per+" Very Good !");
		}
		if(per>=70.00f && per <80.00f)
		{
			System.out.println(per+" Good !");
		}
		if(per>=60.00f && per <70.00f)
		{
			System.out.println(per+" Average");
		}
		if(per>=40.00f && per <60.00f)
		{
			System.out.println(per+" Pass");
		}
		if(per<40.00f)
		{
			System.out.println(per+" FAIL");
		}
	}
		
}
