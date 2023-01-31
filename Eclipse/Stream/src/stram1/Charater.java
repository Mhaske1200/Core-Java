package stram1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Charater {

	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			
			int i;
			int cnt=0;
			System.out.println("Enter 'q' to stop");
			while((i= br.read())!='q')
			{	
				cnt++;
				System.out.println((char)i);
				
			}
			System.out.println(cnt);
			 
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
		

	}

}
