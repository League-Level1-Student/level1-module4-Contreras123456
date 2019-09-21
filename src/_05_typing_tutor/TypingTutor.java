package _05_typing_tutor;


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	static JFrame frame = new JFrame();
	static JLabel label = new JLabel();
	static char currentLetter;
	static JPanel panel = new JPanel();
	
public static void main(String[] args) {
	currentLetter = generateRandomLetter();
label.setText(currentLetter+"");
label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);
frame.setVisible(true);
panel.add(label);
frame.add(panel);
frame.pack();
TypingTutor typingtutor = new TypingTutor();
typingtutor.KeyListner();
}
	

	
	static char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	     
	}
	void KeyListner(){
		frame.addKeyListener(this);
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar()==((currentLetter))) {
			System.out.println("correct");
			panel.setBackground(Color.green);
		}
		else {
			System.out.println("incorrect");
			panel.setBackground(Color.red);
		}
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(label);
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter+"");
	}

}
