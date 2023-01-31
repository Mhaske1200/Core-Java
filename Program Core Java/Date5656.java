public class Date5656
{ 
	int dd;
	int mm;
	int yy;
	static int cnt=0;
	int x;

public Date5656()
{
	cnt++;
	dd=0;
	mm=0;
	yy=0;
	x=cnt;

}
public Date5656(int dd,int mm,int yy)
{
	cnt++;
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
	x=cnt;
}
public void Display()
{
	System.out.println("Date is"+dd+"/"+mm+"/"+yy);
	System.out.println("Count = "+x);
}



}