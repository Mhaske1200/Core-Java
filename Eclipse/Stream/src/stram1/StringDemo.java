package stram1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringDemo {


	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			
			String line;
			int cnt=0;
			System.out.println("Enter 'quit' to stop");
			while(!(((line= br.readLine()).equals("quit")) || !((line= br.readLine()).equals("Quit"))))
			{	
				cnt++;
				System.out.println(line);
				
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
