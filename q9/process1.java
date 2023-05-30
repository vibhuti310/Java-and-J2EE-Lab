package q9;
import java.util.*;

public class process1 extends Thread{
	
	Scanner sc = new Scanner(System.in);
	
	static String vowels = "aeiou";
	
	public void run()
	{
		System.out.println("Enter the word:");
		String st = sc.next();
		int count = 0;
		
		for(char c1: vowels.toCharArray())
		{
			for(char c2: st.toCharArray())
				if(c1 == c2)
					count++;
		}
		
		System.out.println("Number of vowels: "+count);
	}
}
