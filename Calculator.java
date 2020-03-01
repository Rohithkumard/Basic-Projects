import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Rohith
*/

class Calculator implements ActionListener{
	JFrame frame;
	JPanel panel;
	JTextField tf;
	JLabel l;
	JTextField tf1;
	JLabel l1;
	JTextField tf2;
	JLabel l2;
	
	public Calculator() {
		
		frame = new JFrame("Calculator");
		panel = new JPanel();
		tf = new JTextField(16);
		l = new JLabel("First Field : ");
		tf1 = new JTextField(16);
		l1 = new JLabel("Secong Field : ");
		tf2 = new JTextField(16);
		l2 = new JLabel("Result Field : ");
		
		JButton add = new JButton("+");
		JButton sub = new JButton("-");
		JButton mult = new JButton("*");
		JButton div = new JButton("/");
		JButton rem = new JButton("%");
		JButton c = new JButton("C");
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		rem.addActionListener(this);
		c.addActionListener(this);
		
		panel.add(l);
		panel.add(tf);
		panel.add(l1);
		panel.add(tf1);
		panel.add(l2);
		panel.add(tf2);
		panel.add(add);
		panel.add(sub);
		panel.add(mult);
		panel.add(div);
		panel.add(rem);
		panel.add(c);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.pack();
	}
	
	public static void main(String[] args) throws Exception {
		
		new Calculator();
	}//end of main

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		int d1 = Integer.parseInt(tf.getText());
		int d2 = Integer.parseInt(tf1.getText());
		
		if(action == "+") {
			tf2.setText(String.valueOf(d1+d2));
		}
		if(action == "-") {
			tf2.setText(String.valueOf(d1-d2));
		}
		if(action == "*") {
			tf2.setText(String.valueOf(d1*d2));
		}
		if(action == "/") {
			tf2.setText(String.valueOf(d1/d2));
		}
		if(action == "%") {
			tf2.setText(String.valueOf(d1 % d2));
		}
		if(action == "C") {
			tf2.setText("");
		}

		
	}
}//end of class