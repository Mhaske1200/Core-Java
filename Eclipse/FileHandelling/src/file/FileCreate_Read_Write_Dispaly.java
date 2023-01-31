package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;

public class FileCreate_Read_Write_Dispaly {

	public static void main(String[] args) 
	{
		try {
		Writer wt = new FileWriter("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\Demo.txt");
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Input in File -  & Enter 'Stop' to Exit");
		String line;
		while(!(line = br.readLine()).equals("Stop"))
		{
			wt.write("\n"+line+"\n");
		}
		System.out.println("Data Written in the File");
		br.close();
		wt.close();
		
		InputStream is = new FileInputStream("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\Demo.txt");
		int i;
		while((i=is.read())!= -1)
			{
				System.out.println((char)i);
			}
		is.close();
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		

	}

}
