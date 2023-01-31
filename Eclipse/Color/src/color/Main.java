package color;

public class Main {

	public static void main(String[] args) 
	{
		Point p1 = new ColorPoint(10,20,"Grey");
		p1.Display();
		
		Point p2 = new ColorPoint(0,0,"Pink");
		p2.Display();
		
		Point p3 = new ColorPoint(50,25,"Red");
		System.out.println(p3);

	}

}
