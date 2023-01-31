package stock;

public class Producer implements Runnable 
{
	private Thread t;
	Stock s;
	boolean brun;
	
	public Producer(Stock s)
	{
		this.s = s;
		this.brun = true;
		t = new Thread(this);
	}

	@Override
	public void run() 
	{
		while(brun)
		{
			s.produce();
		}

	}
	public Thread getT()
	{
		return t;
	}
	public void stopNow()
	{
		brun = false;
	}
	

}
