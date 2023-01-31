package exception2;

public class Pwdtoolong extends Exception 
{
	private String msg;
	public Pwdtoolong()
	{
		msg = "Entered password is too long";
	}
	public String toString() 
	{
		return msg;
	}
	public String getMessage()
	{
		return msg;
	}
	
}
