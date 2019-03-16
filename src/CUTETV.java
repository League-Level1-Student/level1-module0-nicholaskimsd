import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CUTETV implements ActionListener{
public static void main(String[] args) {
	CUTETV fc = new CUTETV();
	fc.showButton();
}

public void showButton() {
	System.out.println("Button clicked");
    frame.setVisible(true);
    frame.add(panel);
	panel.add(button);
	button.setText("CLCIK");
	button.addActionListener (this);
	panel.add(leftButton);
	leftButton.setText("CLICK");
	leftButton.addActionListener(this);
	panel.add(rightButton);
	rightButton.setText("CLICK");
	rightButton.addActionListener(this);
	frame.pack();
	
}

JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton leftButton = new JButton();
JButton button = new JButton();
JButton rightButton = new JButton();
void showOwl(String string) {
    playVideo("https://www.youtube.com/watch?v=HyqiP-9BDRk");
}

void showFrog(String string) {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns(String string) {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}

public void actionPerformed(ActionEvent e) {
	JButton pressed = (JButton) e.getSource();
	if(leftButton==pressed) {
		showOwl("https://www.youtube.com/watch?v=HyqiP-9BDRk");
		}
		else if(button==pressed) {
		showFrog("https://www.youtube.com/watch?v=cBkWhkAZ9ds");

		}
		else if (rightButton==pressed) {
			showFluffyUnicorns("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}
		
	
}



}

