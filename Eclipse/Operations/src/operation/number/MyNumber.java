package operation.number;

import operation.IntOperations;

public class MyNumber implements IntOperations 
{
	
	@Override
	public boolean isOdd(int num) 
	{
		if(num%2 != 0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isEven(int num) 
	{
		if(num%2 == 0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isPrime(int num) 
	{
		if(num<=1)
		{
			return false;
		}
		for(int i = 2 ; i < num ; i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		
		return true;
	}

	@Override
	public double calFactorial(int num) 
	{
		int Fact=1;
		for(int i = 1 ; i<=num ; i++)
		{
			Fact = Fact * i;
		}
		return Fact;
	}

}
