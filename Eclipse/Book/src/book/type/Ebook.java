package book.type;

import book.Book;

public class Ebook extends Book 
{
	double discount;

	public Ebook() 
	{
		super();
		discount = 0.00;
	}

	public Ebook(int bookid, String title, double price) 
	{
		super(bookid, title, price);
		if (price <= 500)
		this.discount = 0.02;
		if (price > 500 && price <=1000)
		this.discount = 0.05;
		if (price > 1000 && price <=5000)
		this.discount = 0.07;
		
	}

	@Override
	public String toString() {
		return super.toString()+ "Ebook [discount=" + discount + "]";
	}
	
	public void display()
	{
		super.display();
		System.out.println("Final Price (Including Discount) = "+(price-(price*discount)));
	}
	
	public double calculatecost()
	{
		return price-(price*discount);
	}
	
		
}
