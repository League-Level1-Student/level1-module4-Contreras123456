package _12_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JLabel label = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
String picture = "cherry.jpg";
String picture2 = "orange.jpg";
String picture3 = "lime.jpg";


	public static void main(String[] args) {
	
	}

	 void setup() {
		// TODO Auto-generated method stub
frame.add(panel);
panel.add(label);
panel.add(button);
button.setText("Spin");
try {
	label = createLabelImage(picture);
	label = createLabelImage(picture2);
	label = createLabelImage(picture3);
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	 private JLabel createLabelImage(String fileName) throws MalformedURLException{
	        URL imageURL = getClass().getResource(fileName);
		if (imageURL == null){
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}
