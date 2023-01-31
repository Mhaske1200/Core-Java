public class Prime 
{
	public static void main (String[] args)
	{
		int num = 7;
		boolean flag = false;
		for(int i = 2;i<num;i++)
			{
				if(num%i == 0)
					{
						flag = true;
						break;
					}
			}	
		if(flag)
			System.out.println("Number "+num+" is not Prime Number");
		else
			System.out.println("Number "+num+" is Prime Number");

	}

}