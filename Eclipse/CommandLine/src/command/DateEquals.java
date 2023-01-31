package command;

public class DateEquals {

	public static void main(String[] args) 
	{
		Date d1 = new Date(25,01,2000);
		d1.show_date();
		
		Date d2 = new Date(25,01,1998);
		d2.show_date();
		
		System.out.println(d1.equals(d2));
		
		d1 = d2;
		System.out.println(d1.equals(d2));
		
		Date d3 = new Date(1,1,1998);
		Date d4 = new Date(1,1,1998);
		
		System.out.println(d3.equals(d4));
		
	}

}
