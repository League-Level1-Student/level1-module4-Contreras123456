package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
static JFrame frame = new JFrame();
static JPanel panel = new JPanel();
static JLabel label = new JLabel();
static JButton button = new JButton();
static JTextField textfield = new JTextField(10);
static JTextField textfield2 = new JTextField(10);
public static void main(String[] args) {
PigLatin piglatin = new PigLatin();
piglatin.setup();
}
void setup() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(textfield);
	panel.add(button);
	panel.add(textfield2);
	panel.add(label);
	button.setText("translate");
	button.addActionListener(this);
	frame.pack();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	PigLatinTranslator piglatintranslator = new PigLatinTranslator();
	String kevin = piglatintranslator.translate(textfield.getText());
	textfield2.setText(kevin);
}
}
