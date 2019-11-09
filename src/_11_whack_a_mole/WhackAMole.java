package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	static JFrame frame;
	static JPanel panel;
	
	static Date date;

	public static void main(String[] args) {
		date = new Date();
		WhackAMole whackamole = new WhackAMole();
		whackamole.drawButtons();
		
		
		
	}

	void drawButtons() {
		frame = new JFrame();
		panel = new JPanel();
		Random random = new Random();

		int elmo = random.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (elmo == i) {
				button.setText("mole!");
			}

		}
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);

	}

	int counter = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonclicked = (JButton) e.getSource();
		if (buttonclicked.getText().equals("mole!")) {
			counter++;
		} else {
			speak("you missed");
		}
		frame.dispose();
		WhackAMole whackamole2 = new WhackAMole();
		whackamole2.drawButtons();
		drawButtons();
		if (counter == 10) {
			endGame(date, 10);
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

}
