package exception2;

public class Pwdtooshort extends Exception 
{
	private String msg;
	public Pwdtooshort()
	{
		msg = "Entered password is too short";
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
