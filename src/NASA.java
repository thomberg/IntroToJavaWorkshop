import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
/**
 * Kata: NASA Countdown
 * 
 * The NASA wants to shoot yet another rocket to the orbit. As this is your first day as a wannabe scientist
 * at the ground control, you are very excited. So excited that when the gal responsible for the countdown
 * asks you to bring her some coffee, you accidentally spill it all over her lap and the computer – both are
 * not capable of doing their job now.
 * 
 * But the liftoff is only seconds away. Somebody has to do the countdown – or the rocket can’t start and
 * millions of dollars are lost! In a moment of great bravery you remember you learned how to count (a long
 * time ago in High School). So you take the chance!
 * 
 * The ground control chief will tell you where to start – then count to 0. 
 * (example for ’11’: 11 10 9 8 7 6 5 4 3 2 1 0)
 **/
public class NASA {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
	String nasa =	JOptionPane.showInputDialog("when to start");
		// 3. convert the user's answer to an int (Integer.parseInt)
		int start = Integer.parseInt(nasa);
		// 4. countdown from user's starting point
		// 1. countdown from 10 to 0
		for (int i = start; i > 0; i--) {
		speak(""+i);	
		}
		JOptionPane.showMessageDialog(null, "blastoff");
		// 5. when the counting is done, print "blastoff!"
		
		int k = new Random().nextInt();
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


