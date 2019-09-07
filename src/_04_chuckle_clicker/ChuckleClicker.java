package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {

	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
	}
	void makeButtons(){
		JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton button2 = new JButton();
		frame.add(panel);
		frame.add(button);
		frame.add(button2);
		button.setText("joke");
		button2.setText("punchline");
		button.setSize(100, 100);
		button2.setSize(100,100);
		
	}
}
