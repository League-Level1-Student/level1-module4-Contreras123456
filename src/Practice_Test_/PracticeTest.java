package Practice_Test_;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener {
  JFrame frame = new JFrame();
  JLabel label = new JLabel();
  JButton button = new JButton();
  JButton button2 = new JButton();
  JTextField textfield = new JTextField();
  JPanel panel = new JPanel();

	void setup() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		panel.add(button);
		panel.add(button2);
		panel.add(textfield);
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
