package student.superclass;

import java.util.Calendar;

public class Student extends Person 
{
	String PRN;
	transient int age;
	Course course;
	
	public Student() 
	{
		super();
		course = new Course();
		PRN = "ABC";
		age = 1;
	}

	public Student(String name, int dd, int mm, int yy, String PRN,int courseid , String coursename , double fees)
	{
		super(name, dd, mm, yy);
		this.PRN = PRN;
		this.age = ( Calendar.getInstance().get(Calendar.YEAR) ) - yy;
		this.course = new Course(courseid , coursename , fees);
	}

	@Override
	public String toString() {
		return super.toString()+"Student [PRN=" + PRN + ", course=" + course + "]";
	}
	
	public void display()
	{
		super.display();
		System.out.println("PRN Number - "+PRN);
		System.out.println("Age = "+age);
		course.display();
	}
	
	
	
	
	
	
	
	
	
	
}
