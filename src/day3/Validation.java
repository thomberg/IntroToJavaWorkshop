package day3;
import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(3);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.
		for (int i = 0; i < 11; i++) {
			
		}
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "your face looks ok today");
		}
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "at least you don't look completly terrible ");
		}
		if (randomNumber == 2) {
		JOptionPane.showMessageDialog(null, "you are slightly less hideous today :)");	
		}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}

