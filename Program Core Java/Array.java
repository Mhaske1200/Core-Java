public class Array
{
	public static void main(String [] args)
	{
		int [] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println("Array Elements - "+arr[i]);
		}		

		int sum=0;
		int avg;
		for(int i = 0 ; i < 5 ; i++)
		{
			sum = sum +arr[i];
		}
		avg = sum/5;

		System.out.println("Average = "+avg);

		int max=arr[0];
		for(int i = 1 ; i<5 ; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Maximum Element = "+max);

		int min=arr[0];
		for(int i = 1 ; i<5 ; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum Element = "+min);

	}	
}