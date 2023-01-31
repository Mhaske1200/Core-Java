package book.type;

import book.Book;

public class Paperbook extends Book 
{
	double delivery;

	public Paperbook() 
	{
		super();
		delivery = 0.00;
	}

	public Paperbook(int bookid, String title, double price) 
	{
		super(bookid, title, price);
		if (price <= 500)
		this.delivery = 1.07;
		if (price > 500 && price <=1000)
		this.delivery = 1.05;
		if (price > 1000 && price <=5000)
		this.delivery = 1.02;
		
	}
	@Override
	public String toString() {
		return super.toString()+ "Paperbook [delivery=" + delivery + "]";
	}

	public void display()
	{
		super.display();
		System.out.println("Final Price (Delivery Charge) = "+(price*delivery));
	}
	
	public double calculatecost()
	{
		return price*delivery;
	}
}
