package stock;

public class Main {

	public static void main(String[] args) throws InterruptedException 
	{
		Stock s = new Stock();
		
		Producer p = new Producer(s);
		Consumer c = new Consumer (s);
		
		p.getT().start();
		//p.getT().join();
		c.getT().start();
		//c.getT().join();
		
		Thread.sleep(10000);
		
		p.stopNow();
		c.stopNow();
		
		System.out.println("Total qty produced : "+s.getqtyproduced());
		System.out.println("Total qty consumed : "+s.getqtyconsumed());

	}

}
