package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Alingment {

	public static void main(String[] args) throws IOException 
	{		
			File f = new File ("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\Alingment.txt");
			BufferedReader b = new BufferedReader(new FileReader(f));
			String l;
			int cnt=0;
			int max = 0;
			while((l = b.readLine()) != null)
			{
				cnt++;
				 if(l.length()> max)
				 {
					 max=l.length();							 
				 }
			}
			b.close();
			BufferedReader b1 = new BufferedReader(new FileReader(f));
			String l1;
			while((l1 = b1.readLine()) != null)
			{
				int rem;
				rem = max - l1.length();
				for(int i=0 ; i<rem ; i++)
				{
					System.out.print("-");
				}
				System.out.print(l1+"\n");
				
			}
			
			

	}

}
