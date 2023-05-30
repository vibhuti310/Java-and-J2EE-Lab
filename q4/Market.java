package q4;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Market implements ActionListener{
	
	JTextField phone = new JTextField(20);
	JTextField cid = new JTextField(5);
	JTextField item_id = new JTextField(5);
	JTextField qty = new JTextField(5);
	JTextField am = new JTextField(5);
	
	JButton check = new JButton("CHECK CID");
	JButton bill = new JButton("Bill");
	JRadioButton rb1 = new JRadioButton("Discount : 30%");
	
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	HashMap<Integer, Double> ihm = new HashMap<Integer, Double>();
	
	void add_customer()
	{
		hm.put("123456789", 123);
		hm.put("234567899", 124);
		hm.put("345678989", 125);
	}
	
	void add_item()
	{
		ihm.put(1, (double) 60);
		ihm.put(2, (double) 80);
	}
	
	Market()
	{
		JFrame f = new JFrame("Customer info");
		String uname = JOptionPane.showInputDialog("Enter username:");
		String pwd = JOptionPane.showInputDialog("Enter password:");
		
		if(uname.equals("msrit") && pwd.equals("123"))
		{
			JOptionPane.showMessageDialog(null, "Valid input");
			
			f.setSize(200, 200);
			f.setLayout(new FlowLayout());
			f.setVisible(true);
			
			f.add(new JLabel("Phone number:"));
			f.add(phone);
			f.add(check);
			f.add(new JLabel("Customer ID:"));
			f.add(cid);
			check.addActionListener(this);
			
			f.add(new JLabel("Item List: 1. Apple Rs.60/kg	2. Orange Rs.80/kg"));
			f.add(new JLabel("Enter the item number:"));
			f.add(item_id);
			f.add(new JLabel("Enter the quantity:"));
			f.add(qty);
			
			f.add(rb1);
			f.add(bill);
			bill.addActionListener(this);
			f.add(am);
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Login");
		}
	}
	
	public static void main(String args [])
	{
		Market ob = new Market();
		ob.add_customer();
		ob.add_item();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == check)
		{
			String p1 = phone.getText();
			
			if(hm.containsKey(p1))
			{
				JOptionPane.showMessageDialog(null, "Your customer id is: "+hm.get(p1));
				cid.setText(Integer.toString(hm.get(p1)));
			}
			
			else
			{
				hm.put(p1, 125);
				JOptionPane.showMessageDialog(null, "Your new customer id is: "+"125");
				cid.setText(Integer.toString(hm.get(p1)));
			}
				
		}
		
		else
		{
			double amount = 0;
			
			if(item_id.getText().equals("1"))
				amount += Integer.parseInt(qty.getText()) * 60;
			
			if(item_id.getText().equals("2"))
				amount += Integer.parseInt(qty.getText()) * 80;
			
			if(rb1.isSelected())
				amount -= (amount * 0.30);
			
			am.setText(Double.toString(amount));
		}
	}
}
