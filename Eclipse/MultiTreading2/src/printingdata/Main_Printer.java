package printingdata;

public class Main_Printer 
{

	public static void main(String[] args) throws InterruptedException 
	{	
		Printer p = new Printer();
		
		Printing_Task p1 = new Printing_Task("Header" , "Body" , "Footer",p);
		Printing_Task p2 = new Printing_Task("[" , "Welcome to Core Java" , "]",p);
		Printing_Task p3 = new Printing_Task("Know IT" , "Pune" , "Maharashtra",p);
		
		
		
		System.out.println("Printer has Started Printing...");
		
		
		p1.getT().start();
		p1.getT().join();
		p2.getT().start();
		p2.getT().join();
		p3.getT().start();
		p3.getT().join();
					
		
		
	
		System.out.println("Printer has Ended Printing...");
	}

}
