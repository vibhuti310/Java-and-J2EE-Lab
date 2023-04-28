package q2;
import java.util.*;

public class prog2 {
	public static void main(String args[])
	{
		ArrayList<Book> arr = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		
		Book b1 = new Book("You&I", "XYZ", "WK", 2500);
		Book b2 = new Book("Hello World", "WXZ", "WKK", 1500);
		Book b3 = new Book("I am awesome", "ABC", "EFG", 2000);
		
		arr.add(b1);
		arr.add(b2);
		arr.add(b3);
		
		//Sorting list according to price
		Collections.sort(arr, new BookCompare());
		System.out.println("After sorting according to price : ");
		System.out.println(arr);
		
		
		//Creating hashmap with unique ID for each book
		HashMap<Integer, Book> hm = new HashMap<Integer, Book>();
		Integer i = 101;
		for(Book obj: arr)
		{
			hm.put(i, obj);
			i++;
		}
		System.out.println("HashMap: "+hm);
		
		
		//Author name prompt
		System.out.println("Enter the author's name to find the book : ");
		String aname = sc.nextLine();
		
		for(Book obj: arr)
		{
			if(obj.author.equalsIgnoreCase(aname))
				System.out.println(obj.title);
		}
		
		ArrayList<Book> list2 = new ArrayList<Book>();
		System.out.println("Enter the price for search : ");
		double price = sc.nextDouble();
		
		for(Book obj: arr)
		{
			if(obj.price > price)
				list2.add(obj);
		}
		System.out.println("New List : "+list2);
		
		
		//All books that match a part of entire title
		int flag = 0;
		System.out.println("Enter the title to be searched : ");
		String y = sc.next();
		
		for(Book obj: arr)
		{
			if(obj.title.contains(y))
			{
				System.out.println(obj);
				flag = 1;
			}
		}
		
		if(flag == 0)
			System.out.println("No matching title");
		
		//Publisher printing
		System.out.println("Enter the publisher name to be searched: ");
		String publisher = sc.next();
		
		for(Book obj: arr)
		{
			if(obj.publisher.equalsIgnoreCase(publisher))
				System.out.println(obj.title);
		}
		
		//Update publisher details
		System.out.println("Enter the title whose publisher details need to be changed : ");
		String Title = sc.next();
		System.out.println("Enter the publisher name to be updated with : ");
		String Publisher = sc.next();
		
		for(Book obj: arr)
		{
			if(obj.title.equalsIgnoreCase(Title))
			{
				obj.publisher = Publisher;
				System.out.println(obj);
			}
		}
	}	
}
