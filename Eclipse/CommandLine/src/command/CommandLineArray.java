package command;

public class CommandLineArray {

	public static void main(String[] args) 
	{
		int sum=0;
		int max=0;
		int n = args.length;
		
		int []arr = new int [n];
		
		for(int i = 0 ; i<n ; i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		
		
		for(int i = 0 ; i<n ; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array Elements = "+sum);
		for(int i = 0 ; i<n ; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Element of Array = "+max);
		
	}

}
