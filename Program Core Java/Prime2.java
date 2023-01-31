public class Prime2
{
	public static void main(String[] args)
	{
		boolean flag = false;
		for(int i = 1 ; i<=100 ; i++)
		{flag = false;
			for(int j= 2 ; j<i ; j++)
			{
				if(i%j==0)
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			System.out.println("Number "+i+" is Prime Number");
		}
	}
}