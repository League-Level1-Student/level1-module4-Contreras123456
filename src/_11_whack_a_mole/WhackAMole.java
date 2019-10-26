package _11_whack_a_mole;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WhackAMole {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JButton button = new JButton();

void drawButtons(Random number) {
	frame.setVisible(true);
	frame.setSize(100, 100);
	frame.add(panel);
	panel.add(button);
}
}
