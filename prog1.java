package q1;

import java.util.*;

public class prog1 {
	public static void main(String args[])
	{
		HashMap<Long, String> contList = new HashMap<Long, String>();
		
		contList.put((long) 123456789, "Vibhuti");
		contList.put((long) 223344556, "Manish");
		contList.put((long) 778899223, "Kushal");
		
		ArrayList<MissedCall> mcalls= new ArrayList<MissedCall>();
		Scanner sc = new Scanner(System.in);
		
		String name;
		long number;
		int choice;
		
		while(true)
		{
			System.out.println("MENU:\n1.Add missed calls\n2.Display the list\n3.Delete missed calls\n4.Exit\n");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter the name : ");
					name = sc.next();
					System.out.println("Enter the number : ");
					number = sc.nextLong();
					
					if(contList.containsValue(name))
						System.out.println(name+" "+number);
					else
						name="Private Caller";
					
					MissedCall m = new MissedCall(name, number);
					mcalls.add(m);
					break;
					
				case 2:
					Iterator<MissedCall> it = mcalls.iterator();
					while(it.hasNext())
						System.out.println(it.next());
					break;
					
				case 3:
					System.out.println("Enter the number to be deleted: ");
					number = sc.nextLong();
					
					if(contList.containsKey(number))
						contList.remove(number);
					
					System.out.println(contList);
					break;
					
				case 4: System.exit(0);
					
			}
		}
	}
}
