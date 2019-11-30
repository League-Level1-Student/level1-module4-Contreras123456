package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JLabel label = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
static String picture = "cherry.jpg";
static String picture2 = "seven.jpg";
static String picture3 = "bar.jpg";
int wincounter = 0;


	

void setup() {
		// TODO Auto-generated method stub
try {
	label = createLabelImage(picture);
	label2 = createLabelImage(picture2);
	label3 = createLabelImage(picture3);
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
frame.setVisible(true);
frame.add(panel);
panel.add(label);
panel.add(label2);
panel.add(label3);
panel.add(button);
button.setText("Spin");
button.addActionListener(this);
frame.pack();

	}

static String randomPic() {
	Random random = new Random();
	int kevin = random.nextInt(3);
	if (kevin==0) {
		return picture;
	}
	else if (kevin==1) {
		return picture2;
	}
	else {
		return picture3;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = randomPic();
		String lego = randomPic();
		String wiiremote = randomPic();
		panel.remove(label);
		panel.remove(label2);
		panel.remove(label3);
		try {
			label = createLabelImage(action);
			label2 = createLabelImage(lego);
			label3 = createLabelImage(wiiremote);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		frame.pack();
		if (action.equals(lego)&&lego.equals(wiiremote)) {
			JOptionPane.showMessageDialog(null, "YOU WIN!");
			System.out.println(wincounter++);
		}
	}
}
