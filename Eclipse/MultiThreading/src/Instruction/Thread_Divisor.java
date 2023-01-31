package Instruction;



public class Thread_Divisor implements Runnable 
{
	Thread t;
	int num;
	
	public Thread_Divisor(int num) 
	{
		t = new Thread(this);
		this.num= num;
	}
	
	public Thread getT() 
	{
		return t;
	}
	@Override
	public void run() 
	{
		synchronized (System.out) 
		{
		System.out.println("Factor of "+num+" :: - ");
		for(int i = 1 ; i<=num ; i++)
		{
			if(num%i == 0)
			{
				System.out.print(i+" ");
			}
		}System.out.println();
		}
	}

}
