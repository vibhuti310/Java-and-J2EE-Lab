package q3;

public class Student {
	String name, usn, address, category;
	int age;
	double s1, s2, s3, s4, s5, s6, s7, s8, cgpa;
	
	Student(String name, String usn, String address, String category, int age, double s1, double s2, double s3, double s4, double s5, double s6, double s7, double s8)
	{
		this.name = name;
		this.usn = usn;
		this.address = address;
		this.category = category;
		this.age = age;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
		this.s7 = s7;
		this.s8 = s8;		
	}
	
	public String toString()
	{
		return (name+" "+usn+" "+age+" "+category+" "+cgpa);
	}
}
