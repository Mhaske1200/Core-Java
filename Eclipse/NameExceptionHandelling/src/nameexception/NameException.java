package nameexception;

public class NameException extends Exception 
{
	String msg;

	public NameException() 
	{
		msg = "IncorrectNameException - First Name / Last Name - Should Start with Capital Letter";	
	}

	@Override
	public String toString() {
		return "NameException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}

	
	
	
	
}
