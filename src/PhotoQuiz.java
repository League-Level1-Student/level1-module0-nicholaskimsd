/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String hi = "http://41.media.tumblr.com/c48a412ec718ec758068915c1be384e6/tumblr_mjh2fz6WtM1r3zypyo1_400.jpg";
		// 2. create a variable of type "Component" that will hold your image
                Component c = createImage(hi);
		// 3. use the "createImage()" method below to initialize your Component
                
		// 4. add the image to the quiz window
                quizWindow.add(c);
		// 5. call the pack() method on the quiz window
                quizWindow.pack();
		// 6. ask a question that relates to the image
                String ee=JOptionPane.showInputDialog("Have you ever felt that way?");
		// 7. print "CORRECT" if the user gave the right answer
                if(ee.equalsIgnoreCase("Yes")) {
                	JOptionPane.showMessageDialog(null, "u mad yor papi prod");
                }
		// 8. print "INCORRECT" if the answer is wrong
                if(ee.equalsIgnoreCase("No")) {
                	JOptionPane.showMessageDialog(null, "yr mum h8ts u");
                }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
                quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
                String lol = "https://www.trbimg.com/img-57c67ffc/turbine/sdrsf-rancho-santa-fe-resident-among-got-milk-girl-2013jan16";
		// 11. add the second image to the quiz window
                Component d = createImage(lol);
		// 12. pack the quiz window
                quizWindow.add(d);
                quizWindow.pack();
		// 13. ask another question
                String ijwd = JOptionPane.showInputDialog("does milk make you happy AND strong?");
		// 14+ check answer, say if correct or incorrect, etc.
                		 if(ijwd.equalsIgnoreCase("Yes")) {
                         	JOptionPane.showMessageDialog(null, "u mad yor papi prod");
                         }
                         if(ijwd.equalsIgnoreCase("No")) {
                         	JOptionPane.showMessageDialog(null, "yr mum h8ts u");
                         }
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





