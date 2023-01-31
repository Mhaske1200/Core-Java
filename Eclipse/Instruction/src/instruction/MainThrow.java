package instruction;

public class MainThrow {

	public static void main(String[] args) 
	{
		try
		{
		int num1 , num2;
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		System.out.println("Division = "+(num1/num2));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ClassCastException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
