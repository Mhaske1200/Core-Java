import java.util.Scanner;

public class Array01
{
	public static void main(String[] args)
	{
		int [][] arr = new int [3][3];
		int [] rowsum = new int[3];
		int [] colsum = new int[3];

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the values for array....");
		for(int i = 0 ; i<3 ; i++)
		{
			for(int j = 0 ; j<3 ; j++)
			{
				arr[i][j]= sc.nextInt();
			}
		}

		for(int i = 0 ; i<3 ; i++)
		{
			for(int j = 0 ; j<3 ; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		for(int i = 0 ; i<3 ; i++)
		{
			int sum=0;
			for(int j=0 ; j<3;j++)
			{
				rowsum[i]= rowsum[i]+arr[i][j];
				colsum[i]= colsum[i]+arr[j][i];
			}
		}
		System.out.println("Sum of Rows - ");
		for(int i=0;i<3;i++)
		{
			System.out.println(rowsum[i]);
        	}
		System.out.println("Sum of Column - ");
		for(int i=0;i<3;i++)
		{
			System.out.println(colsum[i]);
        	}

	}
}