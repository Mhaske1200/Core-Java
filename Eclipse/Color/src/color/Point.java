package color;

public class Point 
{
	int x;
	int y;
	public Point()
	{
		x=0;
		y=0;
	}
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void Display()
	{
	System.out.println("Point= "+x+" "+y);
	}
}
