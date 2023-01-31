package shop.list;

public class Customer extends Address
{
	String email;
	Address address;
	public Customer() 
	{
		email="Default";
		address=new Address();
	}

	public Customer(String email, String area , String city , String pincode)
	{
		super();
		this.email = email;
		this.address = new Address(area , city , pincode);
	}


	@Override
	public String toString() {
		return super.toString()+ "Customer [email=" + email + ", address=" + address + "]";
	}
	
	public double give_discount(double price)
	{	
		System.out.println("No Discount");
		
		return price;
	}
	
}
