package day1.robot;

//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class candycrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String answer1 = JOptionPane. showInputDialog("who dont you like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally like "+answer1);
		// 3. Ask the user for the name of their best friend
		String answer2 = JOptionPane. showInputDialog("who is ur best friend");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane. showMessageDialog(null, answer2+" is ok i guess");
	} 
}

