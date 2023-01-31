public class Student1200
{
	int id;
	float percent;

public Student1200()
{
	id = 0000;
	percent = 0.00f;
}
public Student1200(int id , float percent)
{
	this.id=id;
	this.percent=percent;
}
public void Grade()
{
	if(percent>=90.00f)
	{
		System.out.println(percent+" Excellent !");
	}
	if(percent>=80.00f && percent <90.00f)
	{
		System.out.println(percent+" Very Good !");
	}
	if(percent>=70.00f && percent <80.00f)
	{
		System.out.println(percent+" Good !");
	}
	if(percent>=60.00f && percent <70.00f)
	{
		System.out.println(percent+" Average");
	}
	if(percent>=40.00f && percent <60.00f)
	{
		System.out.println(percent+" Pass");
	}
	if(percent<40.00f)
	{
		System.out.println(percent+" FAIL");
	}	

}


}