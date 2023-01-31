public class Customer
{	
	String email;
	Address add;

	public Customer()
	{
		email= "Unknown";
		add = new Address();
	}

	public Customer(String email , String area , String city , String pincode)
	{
		this.email = email;
		this.add = new Address(area,city,pincode);
	}

	public void Show()
	{
		System.out.println("Email Id = "+email);
		if(add != null)
		{
			add.Display();	
		}
	}

}