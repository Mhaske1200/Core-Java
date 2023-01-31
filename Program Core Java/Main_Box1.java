public class Main_Box1
{
	public static void main(String[] args)
	{
		Box [] b1arr = new Box [3];
		
		b1arr[0]=new Box();
		b1arr[1]=new Box(10,20,5);
		b1arr[2]=new Box(20);

		for(int i=0 ; i<3 ; i++)
		{
			b1arr[i].display_volume();
		}
	
	}
}