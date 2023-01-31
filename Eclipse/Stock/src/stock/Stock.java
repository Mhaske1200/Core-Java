package stock;

public class Stock 
{
	private int qtyproduced;
	private int qtyconsumed;
	boolean bproduced;
	
	public int getqtyproduced ()
	{
		return qtyproduced;
	}
	public int getqtyconsumed ()
	{
		return qtyconsumed;
	}
	
	public synchronized void produce()
	{
		if(bproduced)
		{
			try {
					wait();
				}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		qtyproduced++;
		System.out.println("Produced :: "+qtyproduced);
		bproduced = true;
		notify();
		
	}
	public synchronized void consume()
	{
		if(!bproduced)
		{
			try {
					wait();
				}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		qtyconsumed++;
		System.out.println("Consumed :: "+qtyconsumed);
		bproduced = false;
		notify();
		
	}

}
