package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class File_copy_source_destination {

	public static void main(String[] args) throws IOException 
	{
		File file = new File("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\Demo.txt");
			
		File fileDest = new File("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\Test.txt");
		
		FileWriter wt = new FileWriter(fileDest);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		if(file.exists())
		{
			if(file.canRead())
			{
				String l;
				int i = 1;
				BufferedReader b = new BufferedReader(new FileReader(file));
				while((l=b.readLine())!= null)
				{
					wt.write(i+". "+l+"\n");
					i++;
				}
				b.close();
				wt.close();
			}
		}
		
	}

}
