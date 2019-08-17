package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurprise implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	nastysurprise n = new nastysurprise();
	n.Button();
}
public void Button() {
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	button.setText("Trick");
	button2.setText("Treat");
	frame.setVisible(true);
	button.addActionListener(this);
	button2.addActionListener(this);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		 showPictureFromTheInternet("https://i.ytimg.com/vi/Gw_xvtWJ6q0/hqdefault.jpg");
		    }
	else if (e.getSource()==button2) {
		showPictureFromTheInternet("https://tribwxin.files.wordpress.com/2018/08/screen-shot-2018-08-21-at-8-30-59-pm.jpg?quality=85&strip=all&w=400&h=225&crop=1");
	}
		}

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}
