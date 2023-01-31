package multi;

public class Display_Name_Prioirty_Using_ThreadClass extends Thread 
{

	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		Thread t = new Thread();
		t.start();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.isAlive());
		System.out.println(t.getClass());
		
		try
		{
		for(int i=1 ; i<=5 ; i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
