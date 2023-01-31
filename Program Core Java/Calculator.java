public class Calculator
{	
	int no1;
	int no2;

public Calculator()
{
	no1=1;
	no2=1;
}
public Calculator(int no1,int no2)
{	
	this.no1=no1;
	this.no2=no2;
}
public void Add()
{
	System.out.println("Addition = "+(no1+no2));
}
public void Sub()
{
	System.out.println("Substraction = "+(no1-no2));
}
public void Multi()
{
	System.out.println("Multiplication = "+(no1*no2));
}
public void Div()
{
	System.out.println("Division = "+((float)no1/no2));
}
}