package shape.sub;

import shape.Drawable;

public class Circle implements Drawable 
{
	double radius;

	
	
	public Circle() 
	{
		super();
		radius=0.00;
	}
	public Circle(double radius) 
	{
		super();
		this.radius = radius;
	}


	@Override
	public void drawShape() 
	{
		System.out.println("Under Circle Draw Shape");
	}

	@Override
	public double calculateArea() 
	{
		return PI * radius * radius;
	}

}
