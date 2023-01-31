package studentportal;

public class Student 
{
	private String username;
	private String userCountry;
 
  


public void registerUser (String a,String b)
{
	this.username=a;
	this.userCountry = b;
	if(!b.equals("INDIA") || !b.equals("India") || !b.equals("india")   )
	{
		try 
		{
		throw new InvalidCountryException();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	System.out.println("User Registration done Succesfully");
	
}


}
