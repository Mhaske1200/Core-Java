public class Account
{
	int accno;
	double balance;
	static float int_rate;

static
{
	int_rate = 4.5f;
}
public static void updateRate(float nrate)
{
	int_rate=nrate;
}

public Account()
{
	accno = 0;
	balance = 0.0;	
}

public Account( int accno , double balance )
{
	this.accno= accno;
	this.balance=balance;
}

public void display()
{	
	double fbal;
	System.out.println("Account Number = "+accno+" Balance = "+balance);
	fbal=balance+(balance*int_rate/100);
	System.out.println("Balance with Interest = "+fbal);
	
}

}