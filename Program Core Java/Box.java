public class Box
{
	int height;
	int width;
	int depth;
public Box()
{
	height=1;
	width=1;
	depth=1;
}
public Box(int height , int width , int depth )
{
	this.height=height;
	this.width=width;
	this.depth=depth;	
}
public Box(int height)
{
	this.height=height;
	this.width=height;
	this.depth=height;	
}
public void display_volume()
{
	int v;
	v=height*width*depth;
	System.out.println("Volume of Box = "+v);	
}

}