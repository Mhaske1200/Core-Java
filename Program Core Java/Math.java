public class Math
{	
	float x;
	float y;
	float z;

Math()
{
	x=0;
	y=0;
	z=0;
}
Math(int x , int y)
{
	this.x=x;
	this.y=y;
}
Math(float x , float y)
{
	this.x=x;
	this.y=y;
}
Math(int x , int y , int z )
{
	this.x=x;
	this.y=y;
	this.z=z;
}
public void Perform_Addition()
{
	System.out.println("Addition = "+(x+y));
}
public void Perform_Addition(int x,int y)
{
	System.out.println("Addition = "+(x+y));
}
public void Perform_Addition(int x,int y,int z)
{
	System.out.println("Addition = "+(x+y+z));
}
public void Perform_Addition(float x,float y)
{
	System.out.println("Addition = "+(float)(x+y));
}

}