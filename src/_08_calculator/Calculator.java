package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JTextField textfield = new JTextField(10);
	JTextField textfield2 = new JTextField(10);
	void RunnerSetup(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(textfield);
		panel.add(textfield2);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);
		button.setText("add");
		button2.setText("multiply");
		button3.setText("subtract");
		button4.setText("divide");
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.pack();
	}
	void add(){
	int add = 1;
	}
	void multiply(){
	int multiply = 1;	
	}
	void subtract(){
		int subtract = 1;
	}
	void divide(){
		int divide = 1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			add();
			label.setText("1");
		}
		else if (e.getSource()==button2) {
			multiply();
		}
		else if (e.getSource()==button3) {
			subtract();
		}
		else if (e.getSource()==button4) {
			divide();
		}
	}
}
