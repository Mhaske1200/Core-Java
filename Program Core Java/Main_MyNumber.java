public class Main_MyNumber
{
	public static void main(String[] args)
	{
		MyNumber N1 = new MyNumber();
		N1.check();
		N1.evenodd();

		MyNumber N2 = new MyNumber(10);
		N2.check();
		N2.evenodd();

		MyNumber N3 = new MyNumber(-5);
		N3.check();
		N3.evenodd();
	}
}