public class Main_Book
{
	public static void main(String [] args)
	{
		Book b1 = new Book();
		b1.display();

		Book b2 = new Book(120.25f);
		b2.display();

		Book b3 = new Book(250.45f);
		b3.display();

		Book b4 = new Book(400.85f);
		b4.display();

		Book b5 = new Book(100.4f);
		b5.display();	
		b1.display();
	}
}