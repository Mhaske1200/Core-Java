public class Line
{
	Point start;
	Point end;

	public Line()
	{
		start=new Point();
		end=new Point();
	}

	public Line(int x , int y , int x1 , int y1)
	{
		this.start=new Point(x , y);
		this.end=new Point(x1 , y1);
	}
	public void Show()
	{
		start.Display();
		end.Display();
	}

}