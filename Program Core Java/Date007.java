package office.utility;

public class Date007
{
	int dd;
	int mm;
	int yy;

	public Date007()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	public Date007(int dd , int mm , int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	public void Display()
	{
		System.out.println("Date = "+dd+"/"+mm+"/"+yy);
	}
}