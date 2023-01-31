package countdown_multi;

public class Main {

	public static void main(String[] args) 
	{
		CountDown c1 = new CountDown(600,"First");
		CountDown c2 = new CountDown(250 , "Second");
		CountDown c3 = new CountDown(700 , "Third");
		
		System.out.println("Counting Starts - ");
		
		c1.getT().start();
		c2.getT().start();
		c3.getT().start();
		
		try 
		{
			c1.getT().join();
			c2.getT().join();
			c3.getT().join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Counting End - ");

	}

}
