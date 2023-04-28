package q1;

public class MissedCall {
	String name;
	long number;
	
	MissedCall(String name, long number)
	{
		this.name = name;
		this.number = number;
	}
	
	public String toString()
	{
		return (name+" "+number);
	}
}
