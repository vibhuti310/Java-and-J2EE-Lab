package q2;

public class Book {
	String title;
	String author;
	String publisher;
	double price;
	
	Book(String title, String author, String publisher, double price)
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public String toString()
	{
		return (title+" "+author+" "+publisher+" "+price);
	}
}
