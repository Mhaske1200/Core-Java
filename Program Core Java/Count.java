public class Count
{	
	static int cnt=0;
	int x;
	int y;
public Count()
{ 	
	cnt++;
	x=0;
	y=0;
	
}
public Count(int x,int y)
{
	cnt++;
	this.x=x;
	this.y=y;
}
public void Add()
{
	System.out.println("Addition= "+(x+y));
	System.out.println("Count = "+cnt);
}


}