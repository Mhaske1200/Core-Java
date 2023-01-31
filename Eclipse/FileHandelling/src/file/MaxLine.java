package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Date;

public class MaxLine {

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
				BufferedReader b = new BufferedReader(new FileReader(f));
					String l;
					int cnt=0;
					int max = 0;
					int maxline=0;
					while((l = b.readLine()) != null)
					{
						cnt++;
						 if(l.length()> max)
						 {
							 maxline=cnt;
							 max=l.length();
							 							 
						 }
					}
					System.out.println("Max = "+max+ "@ Line Number - "+maxline);
				}
			}
		}
	

}
