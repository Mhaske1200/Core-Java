package studentportal;

public class InvalidCountryException extends Exception 
{
	String msg;
	public InvalidCountryException() 
	{
	
		
	 msg = "User Outside India Cannot be Registered";
		 
	}
	@Override
	public String toString() 
	{
		
		return msg;
		 
	}
	@Override
	public String getMessage() 
	{
		
		return  msg;
	}
	
	
	 
	
}
