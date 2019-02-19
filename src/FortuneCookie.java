import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener{
public static void main(String[] args) {
	FortuneCookie fc = new FortuneCookie();
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
	button.setText("your fortune or death awaits");
	button.addActionListener (this);
	frame.pack();
}


@Override
public void actionPerformed(ActionEvent e) {
	int rand = new Random().nextInt(5);
	if(rand==0) {
	JOptionPane.showMessageDialog(null, "daequan will find u");
	}
	else if(rand==1) {
	JOptionPane.showMessageDialog(null, "Your next meal is poison");
	}
	else if(rand==2) {
	JOptionPane.showMessageDialog(null, "You will buy some new pants, eventually");
	}
	else if(rand==3) {
	JOptionPane.showMessageDialog(null, "You will eat");
	}
	else if(rand==4) {
	JOptionPane.showMessageDialog(null, "ur mom knows where you live");
	}
}

}
