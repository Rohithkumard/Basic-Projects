import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Password_GUI implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JTextField tf1;
	JTextField tf2;
	GridLayout g;
	
	Password_GUI(){
	frame = new JFrame("Password Generator");
	panel = new JPanel();
	JButton submit = new JButton("Generator Password");
	submit.addActionListener(this);	
	tf1 = new JTextField(25);
	tf2 = new JTextField(25);
	JLabel myLabel1 = new JLabel("Enter the Length of the Password : ");
	JLabel myLabel2 = new JLabel("Here's the Password : ");
	g = new GridLayout(0,3,5,5);
	
	panel.setLayout(g);
	panel.add(myLabel1);
	panel.add(tf1);
	panel.add(submit);
	panel.add(myLabel2);
	panel.add(tf2);
	frame.add(panel);
	frame.setSize(200, 100);
	frame.setVisible(true);
	frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String n = tf1.getText();
		int n1 = Integer.parseInt(n);
		String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"; 
		
		StringBuilder s = new StringBuilder();
		
		for(int i=0; i<n1; i++) {
		int ran = (int)(data.length() * Math.random());
			s.append(data.charAt(ran));
			
		}
		tf2.setText(s.toString());
	}
	public static void main(String[] args) {
		
		Password_GUI p = new Password_GUI();
	}
}
