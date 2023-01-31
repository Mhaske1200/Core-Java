package book;

import java.util.Scanner;

import book.type.Ebook;
import book.type.Paperbook;

public class Main {

	public static void main(String[] args) 
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		Book[] B = new Book [5];
		
		for(int i = 0 ; i<5 ; i++)
		{
			System.out.println("Enter Book Id - ");
			int bookid = sc.nextInt();
			System.out.println("Enter Book Title");
			String title = sc.nextLine();
			title+= sc.nextLine();
			System.out.println("Enter Price of Book - ");
			double price = sc.nextDouble();
			System.out.println("Enter Type of Book ( 1.EBook / 2.PaperBook )");
			ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			{
				B[i] = new Ebook(bookid , title , price);
				B[i].display();
				System.out.println("Overall Cost - "+B[i].calculatecost());
				break;
			}
		case 2:
			{
				B[i] = new Paperbook(bookid , title , price);
				B[i].display();
				System.out.println("Overall Cost - "+B[i].calculatecost());
				break;
			}
		default :
			{
				System.out.println("Invalid Choice");
				break;
			}
		}
		
		}
		sc.close();
	}

}
