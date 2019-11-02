package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JButton button = new JButton();


void drawButtons() {
	Random random = new Random();
	
	int elmo = random.nextInt(24);
	for (int i = 0; i < 24; i++) {
		JButton button = new JButton();
		panel.add(button);
		if (elmo==i) {
			button.setText("mole!");
		}
	
	}
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.add(panel);
	panel.add(label);
	button.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button) {
		speak("You missed");
	}
	
	
}
void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}	
}
