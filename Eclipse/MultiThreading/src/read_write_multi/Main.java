package read_write_multi;

public class Main {

	public static void main(String[] args) 
	{
		Runnable r = new FileIO_Multi();
		Thread t = new Thread(r);
		
		t.start();

	}

}
