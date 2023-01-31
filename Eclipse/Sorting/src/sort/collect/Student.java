package sort.collect;

public class Student 
{
	int rollno;
	String name;
	int marks;
	public Student() 
	{
		rollno = 0;
		name = "Unknown";
		marks = 0;
	}
	public Student(int rollno, String name, int marks) 
	{		
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() 
	{
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
		
	
	
}
