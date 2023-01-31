package VolumeBox;

import java.util.Scanner;

import VolumeBox.Arr.Box;

public class Main_Box {

	public static void main(String[] args) 
	{
		int Max=0;
		int x=0;
		Box [] arr = new Box[3];
		
		for(int i=0 ; i<3 ; i++)
		{
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length : ");
		int l = sc.nextInt();
		System.out.println("Enter Width : ");
		int w = sc.nextInt();
		System.out.println("Enter Height : ");
		int h = sc.nextInt();
		
		arr[i] = new Box(l,w,h);
		//arr[i].display_volume();
		x = arr[i].display_volume();
		System.out.println("Volume= "+x);
		if ( x > Max)
			{
				Max = x;
			}
		}
		System.out.println("Maximum Volume of All = "+x);
	
	}

}
