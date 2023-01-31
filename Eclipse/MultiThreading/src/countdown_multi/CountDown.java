package countdown_multi;

public class CountDown extends Thread 
{
	private Thread t;
	private int n;
	private String name;
	public CountDown() 
	{
		n=0;
		name="xyz";
		t = new Thread(this);
	}
	
	public CountDown( int n , String name )
	{
		this.n = n;
		this.name = name;
		this.t = new Thread(this);
	}
	
	public Thread getT() 
	{
		return t;
	}
	
	public void run()
	{	try
		{
		while(n>0)
			{
			System.out.println(name+" Counts "+n);
			n--;
			Thread.sleep(50);
			}
		}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	}
	
}
