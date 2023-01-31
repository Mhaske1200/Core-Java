public class Book
{
	static int bookid=110;
	float price;
	int x;
	
Book()
{
	bookid++;
	x=bookid;
}

Book(float price)
{
	bookid++;
	x=bookid;
	this.price=price;
}

public void display()
{
	System.out.println("Book Id = "+x+" Price = "+price);
}

}