package q9;
import java.util.*;

public class process2 extends Thread{
	Scanner sc = new Scanner(System.in);
	
	static String[] digits = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	
	public void run()
	{
		String number;
		System.out.println("Enter the > 4 digit number:");
		number = sc.next();
		
		for(char ch: number.toCharArray())
		{
			int i = (int)ch - 48;
			System.out.println(digits[i-1]+" ");
		}
	}
}
