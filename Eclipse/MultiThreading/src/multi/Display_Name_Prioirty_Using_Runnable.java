package multi;

public class Display_Name_Prioirty_Using_Runnable implements Runnable {

	private Thread t;
	
	Display_Name_Prioirty_Using_Runnable()
	{
		t=new Thread(this);
	}
	Display_Name_Prioirty_Using_Runnable(Thread t)
	{
		t=new Thread(this);
	}
	
	@Override
	public void run() 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
//		try
//		{
//			for(int i = 1 ; i<=10 ; i++)
//			{
//				System.out.println(i);
//				Thread.sleep(1000);
//			}
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();		
//		}
//			
	}
	
	
	public Thread getT() 
	{
		return t;
	}
	
	public static void main(String[] args) 
	{
		Runnable r = new Display_Name_Prioirty_Using_Runnable();
		Thread t = new Thread(r);
		
		t.start();

	}

}