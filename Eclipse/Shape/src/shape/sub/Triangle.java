package shape.sub;

import shape.Drawable;

public class Triangle implements Drawable 
{
	double base , height;
	
	public Triangle() 
	{
		super();
	}

	public Triangle(double base, double height) 
	{
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void drawShape() 
	{
		System.out.println("Under Traingle DrawShape");
	}

	@Override
	public double calculateArea() 
	{
		return 0.5*base*height;
	}

}
