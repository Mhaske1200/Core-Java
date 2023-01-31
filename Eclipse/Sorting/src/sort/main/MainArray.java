package sort.main;

public class MainArray
{

	public static void main(String[] args) 
	{
		int arr [] = {10,7,5,20,4};
		
		
		for(int i=0 ; i < arr.length ; i++)
		{
			for( int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i] > arr[j])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+"\t");
		}

	}

}
