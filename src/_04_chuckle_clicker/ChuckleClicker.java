package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	JButton button = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
	}
	void makeButtons(){
		JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
	
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.setText("joke");
		button2.setText("punchline");
		button.setSize(100, 100);
		button2.setSize(100,100);
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "hi");
if (e.getSource() == button) {
	JOptionPane.showMessageDialog(null, "Why did the scarecrow win an award? Because he was outstanding in his field!");
}
else if (e.getSource() == button2) {
	JOptionPane.showMessageDialog(null, "Do it right for less");
}
	}
}
