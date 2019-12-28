package Practice_Test_;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener {
  JFrame frame = new JFrame();
  JLabel label = new JLabel();
  JButton button = new JButton();
  JButton button2 = new JButton();
  JTextField textfield = new JTextField(10);
  JPanel panel = new JPanel();
public static void main(String[] args) {
	PracticeTest practicetest = new PracticeTest();
	practicetest.setup();
}
	void setup() {
		frame.setVisible(true);
		panel.add(label);
		panel.add(button);
		panel.add(button2);
		panel.add(textfield);
		label.setText("What month of the year has 28 days?");
		button.setText("submit");
		button2.setText("hint");
		label.setPreferredSize(new Dimension(250,50));
		frame.add(panel);
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			if (textfield.getText().equals("all of it")) {
				JOptionPane.showMessageDialog(null, "Correct");
			}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect");
			}
		}
		else if (e.getSource()==button2) {
			JOptionPane.showMessageDialog(null, "How many months have 28 days");
		}
			}
		
	}

