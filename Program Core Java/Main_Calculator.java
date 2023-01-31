public class Main_Calculator
{
	public static void main(String [] args)
	{
		Calculator C1 = new Calculator();
		C1.Add();
		C1.Sub();
		C1.Multi();
		C1.Div();
		
		Calculator C2 = new Calculator(10,20);
		C2.Add();
		C2.Sub();
		C2.Multi();
		C2.Div();
	}
}