import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sound_Effects_Machine implements ActionListener{
	public static void main(String[] args) {
	Sound_Effects_Machine fc = new Sound_Effects_Machine();
	fc.showButton();

	
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton leftButton = new JButton();
JButton rightButton = new JButton();


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

    
}

private void playSound(String soundFile) { 
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed = (JButton) e.getSource();
	if(leftButton==pressed) {
	playSound("heavy-rain-daniel_simon.wav");
	}
	else if(rightButton==pressed) {
	playSound("marbles-daniel_simon");
;
	}
	

}
}
