public class Date
{
	int dd;
	int mm;
	int yy;

	public Date()
	{
		dd= 25;
		mm = 01;
		yy = 1998;
	}
	public Date(int dd , int mm , int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void Show_Date()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}