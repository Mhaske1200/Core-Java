package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Date;

public class Directory {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter File Name :: ");
		String s = br.readLine();
		
		File f = new File ("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\"+s);
		if(f.exists())
		{
			System.out.println("Exists : "+f.exists());
			System.out.println("Size : "+f.length());
			Date d = new Date(f.lastModified());
			System.out.println("Last modified : "+d);
			System.out.println("Readable :"+f.canRead());
			
			if(f.isDirectory())
			{
				System.out.println("Directory : "+f.isDirectory());
				String arr[];
				arr = f.list();
				for(int i = 0 ; i < arr.length ; i++)
				{
					System.out.println(arr[i]);
				}
			}
			if(f.isFile())
			{
			if(f.length() >25)
			{
			BufferedReader b1 = new BufferedReader(new FileReader(f));
			String line;
			while((line = b1.readLine())!= null)
				{
					System.out.println(line+"\n");
				}
			}
			if(f.length() <= 25)
			{
				FileReader r = new FileReader(f);
				int i;
				while((i = r.read())!=-1)
				{
					System.out.println((char)i);
				}
			}
			}
		}
		
		br.close();
	}

}
