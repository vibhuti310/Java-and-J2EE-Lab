package q3;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class gui implements ActionListener {
	static JFrame f1 = new JFrame("Student Info");
	static JLabel l1 = new JLabel("Name:");
	static JLabel l2 = new JLabel("USN:");
	static JLabel l3 = new JLabel("Age:");
	static JLabel l4 = new JLabel("Category:");
	static JLabel l5 = new JLabel("Sem 1:");
	static JLabel l6 = new JLabel("Sem 2:");
	static JLabel l7 = new JLabel("Sem 3:");
	static JLabel l8 = new JLabel("Sem 4:");
	static JLabel l9 = new JLabel("Sem 5:");
	static JLabel l10 = new JLabel("Sem 6:");
	static JLabel l11 = new JLabel("Sem 7:");
	static JLabel l12 = new JLabel("Sem 8:");
	static JLabel l13 = new JLabel("Address:");
	static JTextField name = new JTextField(20);
	static JTextField usn = new JTextField(20);
	static JTextField age = new JTextField(5);
	static JTextField cat = new JTextField(10);
	static JTextField addr = new JTextField(30);
	static JTextField sem1 = new JTextField(5);
	static JTextField sem2 = new JTextField(5);
	static JTextField sem3 = new JTextField(5);
	static JTextField sem4 = new JTextField(5);
	static JTextField sem5 = new JTextField(5);
	static JTextField sem6 = new JTextField(5);
	static JTextField sem7 = new JTextField(5);
	static JTextField sem8 = new JTextField(5);
	static JButton compute=new JButton("Compute");
	static JButton done=new JButton("Done");
	static JButton display=new JButton("Display");
	static ArrayList<Student> al = new ArrayList<Student>();
//	
	public static void main(String args[])
	{	
		f1.setSize(900, 800);
		f1.setLayout(new GridLayout(20,20));
		f1.setVisible(true);
		f1.add(l1);
		f1.add(name);
		f1.add(l2);
		f1.add(usn);
		f1.add(l3);
		f1.add(age);
		f1.add(l4);
		f1.add(cat);
		f1.add(l13);
		f1.add(addr);
		f1.add(l5);
		f1.add(sem1);
		f1.add(l6);
		f1.add(sem2);
		f1.add(l7);
		f1.add(sem3);
		f1.add(l8);
		f1.add(sem4);
		f1.add(l9);
		f1.add(sem5);
		f1.add(l10);
		f1.add(sem6);
		f1.add(l11);
		f1.add(sem7);
		f1.add(l12);
		f1.add(sem8);
		f1.add(compute);
		f1.add(done);
		f1.add(display);
		
		compute.addActionListener(new gui());
		done.addActionListener(new gui());
		display.addActionListener(new gui());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == compute)
		{
			int Age = Integer.parseInt(age.getText());
			if(Age < 18 && Age > 30)
			{
				String temp = JOptionPane.showInputDialog(null, "Enter valid age!");
				age.setText(temp);
			}
			
			else
			{
				System.out.println("Valid Age!");
			}
			
			check(1, sem1);
			check(2, sem2);
			check(3, sem3);
			check(4, sem4);
			check(5, sem5);
			check(6, sem6);
			check(7, sem7);
			check(8, sem8);
		}
		
		else if(e.getSource()== done)
		{
			double s1 = Double.parseDouble(sem1.getText());
			double s2 = Double.parseDouble(sem2.getText());
			double s3 = Double.parseDouble(sem3.getText());
			double s4 = Double.parseDouble(sem4.getText());
			double s5 = Double.parseDouble(sem5.getText());
			double s6 = Double.parseDouble(sem6.getText());
			double s7 = Double.parseDouble(sem7.getText());
			double s8 = Double.parseDouble(sem8.getText());
			
			double cgpa = (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8)/8;
			Student obj = new Student(name.getText(), usn.getText(), addr.getText(), cat.getText(), Integer.parseInt(age.getText()), s1, s2, s3, s4, s5, s6, s7, s8);
			obj.cgpa = cgpa;
			
			al.add(obj);
		}
		
		else 
		{
			f1.setVisible(false);
			JFrame f2 = new JFrame("Display Box");
			f2.setSize(500, 500);
			f2.setVisible(true);
			JTextArea t = new JTextArea(50, 50);
			f2.add(t);
			
			for(Student obj: al)
			{
				t.setText(obj.toString());
			}
		}
		
	}
	
	public void check(int i, JTextField t1)
	{
		if(Double.parseDouble(t1.getText()) >= 10)
		{
			String temp = JOptionPane.showInputDialog(null, "Enter valid SGPA for Sem "+(i)+": ");
			t1.setText(temp);
		}
	}
	
}
//	static JFrame f1=new JFrame("STUDENT INFO");
//	static JLabel label1=new JLabel("ENTER NAME");
//	static JLabel label2=new JLabel("ENTER USN");
//	static JLabel label3=new JLabel("ENTER ADDRESS");
//	static JLabel label4=new JLabel("ENTER CATEGORY");
//	static JLabel label5=new JLabel("ENTER AGE");
//	static JLabel label6=new JLabel("ENTER SGPA1");
//	static JLabel label7=new JLabel("ENTER SGPA2");
//	static JLabel label8=new JLabel("ENTER SGPA3");
//	static JLabel label9=new JLabel("ENTER SGPA4");
//	static JTextField tname=new JTextField(20);
//	static JTextField tusn=new JTextField(20);
//	static JTextField taddr=new JTextField(20);
//	static JTextField tcat=new JTextField(20);
//	static JTextField tage=new JTextField(10);
//	static JTextField sgpa1=new JTextField(5);
//	static JTextField sgpa2=new JTextField(5);
//	static JTextField sgpa3=new JTextField(5);
//	static JTextField sgpa4=new JTextField(5);
//	static JButton submit=new JButton("submit");
//	static JButton done=new JButton("done");
//	static JButton display=new JButton("display");
//	static ArrayList<Student> AA=new ArrayList<Student>();
//	public static void main(String[] args)
//	{
//		f1.setSize(900, 800);
//		f1.setLayout(new GridLayout(2,2));
//		f1.setVisible(true);
//		f1.add(label1);
//		f1.add(tname);
//		f1.add(label2);
//		f1.add(tusn);
//		f1.add(label3);
//		f1.add(taddr);
//		f1.add(label4);
//		f1.add(tcat);
//		f1.add(label5);
//		f1.add(tage);
//		f1.add(label6);
//		f1.add(sgpa1);
//		f1.add(label7);
//		f1.add(sgpa2);
//		f1.add(label8);
//		f1.add(sgpa3);
//		f1.add(label9);
//		f1.add(sgpa4);
//		f1.add(submit);
//		f1.add(done);
//		f1.add(display);
//		submit.addActionListener(new gui());	
//		done.addActionListener(new gui());
//		display.addActionListener(new gui());
//
//	}
//		
//	
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		if(e.getSource()==submit)
//		{
//			int age=Integer.parseInt(tage.getText());
//			if(18>age||age>30)
//			{
//				System.out.println("invalide age");
//				String temp=JOptionPane.showInputDialog(null,"Enter valid age 18 to 30=");
//				tage.setText(temp);
//			}
//			else
//			{
//				System.out.println("valide age");
//				System.out.println("its working");
//			}
//			check(1,sgpa1);
//			check(2,sgpa2);
//			check(3,sgpa3);
//			check(4,sgpa4);
//			
//		}
//		else if(e.getSource()==done)
//		{
//
//			double s1=Double.parseDouble(sgpa1.getText());
//			double s2=Double.parseDouble(sgpa1.getText());
//			double s3=Double.parseDouble(sgpa1.getText());
//			double s4=Double.parseDouble(sgpa1.getText());
//			double cg=(s1+s2+s3+s4)/4;
//			Student ob=new Student(tname.getText(),tusn.getText(),taddr.getText(),tcat.getText(),Integer.parseInt(tage.getText()),s1,s2,s3,s4,9.0,7.0,8.0,9.0);
//			ob.cgpa=cg;
//			
//			AA.add(ob);
//			
//		
//		}
//		else
//		{
//			
//			f1.setVisible(false);
//			JFrame f2=new JFrame("DISPLAY FRAME");
//			f2.setSize(500, 500);
//			f2.setVisible(true);
//			JTextArea info=new JTextArea(20,20);
//			f2.add(info);
//			for(Student ob1:AA)
//			{
//				info.setText(ob1.toString());
//			}
//			
//			//System.out.println(".............perfect............");
//		}
//		
//		
//			
//		
//		// TODO Auto-generated method stub
//		
//	}
//	void check(int i,JTextField sgpa)
//	{
//		if(Double.parseDouble(sgpa.getText())>=10)
//		{
//			//System.out.println("sem "+i+"invalide SGPA");
//			String temp=JOptionPane.showInputDialog(null,"sem "+i+" Enter valid sgpa 0 to 10=");
//			sgpa.setText(temp);
//	
//		}
//	}
//}
