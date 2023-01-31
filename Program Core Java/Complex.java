public class Complex
{
  int x;//real
  int y;//imaginary

public Complex()
  {
     x=0;
     y=0;
  }
public Complex(int x,int y)
  {
     this.x=x;
     this.y=y;
  }
public void Display()
{
	if(y < 0)
	{
		System.out.println(x+""+y+"i");	
	}
	else
	{
		System.out.println(x+"+"+y+"i");
	}
			
}


}