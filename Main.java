package q9;

public class Main {
	public static void main(String args []) throws Exception
	{
		process1 obj = new process1();
		process2 obj2 = new process2();
		
		obj.start();
		
		Thread.sleep(5000);
		
		obj2.start();
	}
}
