package q5;



import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class q5 implements ActionListener {
	JFrame f1 = new JFrame("Customer details");
	JLabel l1 = new JLabel("Customer Number:");
	JTextField custno = new JTextField(10);
	JLabel l2 = new JLabel("Customer Name:");
	JTextField name = new JTextField(10);
	JLabel l3 = new JLabel("State:");
	JTextField state = new JTextField(10);
	JLabel l4 = new JLabel("Credit Limit:");
	JTextField credlimit = new JTextField(10);
	JLabel l5 = new JLabel("Representative Number:");
	JTextField rno = new JTextField(10);
	JButton submit = new JButton("submit");
	
	q5()
	{
		f1.add(l1);
		f1.add(custno);
		f1.add(l2);
		f1.add(name);
		f1.add(l3);
		f1.add(state);
		f1.add(l4);
		f1.add(credlimit);
		f1.add(l5);
		f1.add(rno);
		f1.add(submit);
		
		f1.setSize(500, 500);
		f1.setVisible(true);
		f1.setLayout(new GridLayout(20, 20));
		submit.addActionListener(this);	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == submit)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3000/data1", "root", "root");
				
				PreparedStatement statement;
				String query = "Insert into cutomer(custNo, custName, state, credLimit, repno)"+"values(?,?,?,?,?)";
				statement = con.prepareStatement(query);
				statement.setInt(1, Integer.parseInt(custno.getText()));
				statement.setString(2, name.getText());
				statement.setString(3, state.getText());
				statement.setDouble(4, Integer.parseInt(credlimit.getText()));
				statement.setString(5, rno.getText());
				
				int status = statement.executeUpdate();
				if(status > 0)
					System.out.println("Successful");
				
				ResultSet resultset;
				resultset = statement.executeQuery("select * from customer where credit_limit>15000");
				while(resultset.next())
					System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getString(3)+" "+resultset.getDouble(4)+" "+resultset.getString(5));
				
				
			}
			
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
	}
	
	public static void main(String args[])
	{
		q5 obj = new q5();
	}
}
