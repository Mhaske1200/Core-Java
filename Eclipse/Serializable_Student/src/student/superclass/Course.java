package student.superclass;

import java.io.Serializable;

public class Course implements Serializable
{
	int courseid;
	String coursename;
	double fees;
	public Course() 
	{
		courseid = 0000;
		coursename = "XYZ";
		fees = 1000.001;
	}
	public Course(int courseid, String coursename, double fees) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", fees=" + fees + "]";
	}
	
	public void display()
	{
		System.out.println("Course ID = "+courseid+" Course Name = "+coursename);
		System.out.println("Fees = "+fees);
	}
	
	
	
}
