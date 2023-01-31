public class Sum
{

public static void main(String[] args)
    {   
      int sum=0,num = 5656;
        while(num !=0)
	{
		sum=sum+num%10;
		num = num/10;
	}
           System.out.println(sum);

        
     }
}

 
   