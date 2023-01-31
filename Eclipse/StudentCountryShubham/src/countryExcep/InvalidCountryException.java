package countryExcep;

public class InvalidCountryException extends Exception 
{
	String msg;
	
	
	public InvalidCountryException()
	{
		msg= "User Outside India Cannot be Registered";
	}
	
	
	@Override
	public String toString() {
		return "InvalidCountryException [msg=" + msg + "]";
	}
	
	public void display(Exception e)
	{
		System.out.println(e);
		e.printStackTrace();
	}
	
}
