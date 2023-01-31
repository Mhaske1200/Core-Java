package pointException;

public class PointDemo {

	public static void main(String[] args)
	{
		 try
		 {
			 ColorPoint c = new ColorPoint(1,2,"Pink");
			 c.Display();
			 
			 ColorPoint c1 = new ColorPoint(1,2,"Red");
			 c1.Display();
		 }
		 catch(InvalidColourException e)
		 {
			 System.out.println(e);
		 }
	}

}
