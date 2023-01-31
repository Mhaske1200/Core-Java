public class Grade
{
	public static void main(String[] args)
	{
	float p  = 85.56f;

	if( p > 90 )
	{
		System.out.println("Percentage = "+p+" Excellent !");
	}
if( p >= 81 && p <= 90 )
	{
		System.out.println("Percentage = "+p+" Very Good !");
	}
if( p >= 71 && p <= 80 )
	{
		System.out.println("Percentage = "+p+" Good !");
	}
if( p >= 61 && p <= 70 )
	{
		System.out.println("Percentage = "+p+" Average !");
	}
if( p >= 40 && p <= 60 )
	{
		System.out.println("Percentage = "+p+" Pass !");
	}
if( p < 40 )
	{
		System.out.println("Percentage = "+p+" FAIL ");
	}


	}
}