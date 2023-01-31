public class Main_Box
{
	public static void main ( String[] args)
	{
		Box b1 = new Box();
		b1.display_volume();

		Box b2 = new Box(10,20,30);
		b2.display_volume();
		
		Box b3 = new Box(10);
		b3.display_volume();
	}
}