public class Person
{
	String name;
	Date bdate;

	public Person()
	{
		name = "Unknown";
		bdate = new Date();
	}
	public Person( String name , int dd , int mm , int yy)
	{
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}

	public void Show()
	{
		System.out.println("Name ="+name);
		if(bdate != null )
		{
		bdate.Show_Date(); 
		}
	}

}