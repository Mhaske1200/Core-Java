package shop.list;

public class RegCustomer extends Customer
{
	int reg_no;

	public RegCustomer() 
	{
		super();
	}
	
	public RegCustomer(String email, String area, String city, String pincode, int reg_no) {
		super(email, area, city, pincode);
		this.reg_no = reg_no;
	}



	@Override
	public String toString() {
		return super.toString()+ "RegCustomer [reg_no=" + reg_no + "]";
	}
	
	public double give_discount(double price)
	{	
		System.out.println("5% Discount");
		double dis = price*0.05;
		return price-dis;
	}
	
	

}
