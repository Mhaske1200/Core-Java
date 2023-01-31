package shape.sub;

import shape.Drawable;

public class Rectangle implements Drawable 
{
	double length;
	double breadth;

	
	
	public Rectangle() 
	{
		super();
		length=0.00;
		breadth=0.00;
	}
	

	public Rectangle(double length, double breadth) 
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public void drawShape() 
	{
		System.out.println("Under Rectangle Draw Shape");
	}

	@Override
	public double calculateArea() 
	{
		return length*breadth;
	}

}
