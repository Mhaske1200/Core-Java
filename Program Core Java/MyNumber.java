public class MyNumber
{
	private int n;

public MyNumber()
{
	n=0;
}
public MyNumber(int n)
{
	this.n=n;
}
public void check()
{
	if(n==0)
	{
		System.out.println("Number is Zero");
	}
	if(n>0)
	{
		System.out.println("Number is Positive");
	}
	if(n<0)
	{
		System.out.println("Number is Negative");
	}

}

public void evenodd()
{
	if(n%2 == 0)
	{
		System.out.println("Number is Even");
	}
	else
	{
		System.out.println("Number is Odd");
	}

}

}