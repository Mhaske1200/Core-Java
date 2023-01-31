package command;

public class Date 
{
	private int dd;
	private int mm;
	private int yy;
	public Date() 
	{
		dd=1;
		mm=1;
		yy=1970;
	}
	public Date(int dd, int mm, int yy) 
	{	
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
		
	@Override
	public boolean equals(Object obj) 
	{
		Date d = (Date) obj;
		boolean flag = false;
		if(dd == d.dd && mm == d.mm & yy == d.yy)
			flag = true;
		
		return flag;
	}
	public void show_date()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
}
