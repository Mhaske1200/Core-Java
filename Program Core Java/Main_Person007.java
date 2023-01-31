import office.utility.Date007;
import office.staff.Person007;

public class Main_Person007
{
	public static void main(String[] args)
	{
		Person007 p1 = new Person007();
		p1.Show();
		Date007 d1 = new Date007();
		d1.Display();

		Person007 p2 = new Person007("Shubham" , 24);
		p2.Show();
		Date007 d2 = new Date007(25,1,1998);
		d2.Display();
	}
}