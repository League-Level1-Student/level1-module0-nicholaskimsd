import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener{
@SuppressWarnings("unused")
public static void main(String[] args) {
	JackInTheBox fc = new JackInTheBox();
	fc.showButton();
	

}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();

public void showButton() {
    System.out.println("Button clicked");
    frame.setVisible(true);
    frame.add(panel);
	panel.add(button);
	button.setText("Suprise");
	button.addActionListener (this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	System.out.println("Bop");
	
}

@SuppressWarnings("unused")
private void showPicture(String fileName) { 
    try {
         JLabel imageLabel = createLabelImage(fileName);
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (Exception e) {
         e.printStackTrace();
    }
}

private JLabel createLabelImage(String fileName) {
    try {
         URL imageURL = getClass().getResource(fileName);
         if (imageURL == null) {
              System.err.println("Could not find image " + fileName);
              return new JLabel();
         } else {
              Icon icon = new ImageIcon(imageURL);
              JLabel imageLabel = new JLabel(icon);
              return imageLabel;
         }
    } catch (Exception e) {
         System.err.println("Could not find image " + fileName);
         return new JLabel();
    }
}
}