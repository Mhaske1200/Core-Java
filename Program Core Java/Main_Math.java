public class Main_Math
{
	public static void main (String[] args)
	{
		Math m1 = new Math();
		m1.Perform_Addition();

		Math m2 = new Math(10,20);
		m2.Perform_Addition();

		Math m3 = new Math(10,20,30);
		m3.Perform_Addition();

		Math m4 = new Math(10.5f, 20.2f);
		m4.Perform_Addition();
	}
}