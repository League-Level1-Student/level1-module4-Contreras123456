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
	int sum = 0;
	int sum2 = 0;
	int sum3 = 0;
	int sum4 = 0;
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
	void add(int num1, int num2){
	sum = num1+num2;
	}
	void multiply(int num1, int num2){
	 sum2 = num1*num2;
	}
	void subtract(int num1, int num2){
	sum3 = num1-num2;
	}
	void divide(int num1, int num2){
	sum4 = num1/num2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = textfield.getText();
		String text2 = textfield2.getText();
		int communism = Integer.parseInt(text);
		int memes = Integer.parseInt(text2);
		if (e.getSource()==button) {
			add(communism, memes);
			label.setText(Integer.toString(sum));
		}
		else if (e.getSource()==button2) {
			multiply(communism,memes);
			label.setText(Integer.toString(sum2));
		}
		else if (e.getSource()==button3) {
			subtract(communism, memes);
			label.setText(Integer.toString(sum3));
		}
		else if (e.getSource()==button4) {
			divide(communism, memes);
			label.setText(Integer.toString(sum4));
		}
	}
}
