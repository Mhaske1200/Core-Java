public class Main_Account
{
	public static void main(String [] args)
	{
		Account A1 = new Account();
		A1.display();

		Account A2 = new Account(111,10000.500);
		A2.display();

		Account A3 = new Account(112,12012.25);
		A3.display();

		Account A4 = new Account(113,13251.45);
		A4.display();

		Account A5 = new Account(114,2500);
		A5.display();

		Account A6 = new Account(115,36000.458);
		A6.display();
		
		System.out.println("After Change of Interest Rate");
		
		Account.updateRate(5f);

		Account A7 = new Account();
		A7.display();

		Account A8 = new Account(111,10000.500);
		A8.display();

		Account A9 = new Account(112,12012.25);
		A9.display();

		Account A10 = new Account(113,13251.45);
		A10.display();

		Account A11 = new Account(114,2500);
		A11.display();

		Account A12 = new Account(115,36000.458);
		A12.display();
		

	}

}