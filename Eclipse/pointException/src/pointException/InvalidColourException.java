package pointException;

public class InvalidColourException extends Exception 
{
	String msg;

	public InvalidColourException() 
	{
		super();
		this.msg= "Invalid Colour";
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return this.getClass().getName()+":"+"Color is White "+msg;
	}
	
}
