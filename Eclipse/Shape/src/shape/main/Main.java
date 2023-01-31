package shape.main;

import shape.Drawable;
import shape.sub.*;

public class Main {

	public static void main(String[] args) 
	{
		/*
		 * Rectangle r1 = new Rectangle(10.5,20.7); r1.drawShape();
		 * System.out.println("Area of Rectangle = "+r1.calculateArea());
		 * 
		 * Circle c1 = new Circle(20.7); c1.drawShape();
		 * System.out.println("Area of Circle = "+c1.calculateArea());
		 * 
		 * Triangle t1 = new Triangle(10.36,50); t1.drawShape();
		 * System.out.println("Area of Triangle = "+t1.calculateArea());
		 */
		
		Drawable [] b = new Drawable [3];
		
		b[0] = new Rectangle(10.5,20.7);
		b[1] = new Circle(10.5);
		b[2] = new Triangle(10.5,20.7);
		
		for(Drawable a : b)
		{
			a.drawShape();
			System.out.println("Area = "+a.calculateArea());
			System.out.println("***************************");
		}
			
		
			
	}

}
