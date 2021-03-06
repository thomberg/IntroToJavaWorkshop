package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class Otherpentagoncrazy2 {

	private void makePrettyThings() {
		// 1. Create a new Robot
		Robot T = new Robot();
		// 3. Put the robot's pen down
		T.penDown();
		// 8. Make the robot go at maximum speed (10)
		T.setSpeed(2000);
		// 9. Set the pen to a color that you like for the shape
		
		// 4. Make a variable for the number of sides you want (can’t test this one)
		int sides = 20;
		// 5. Make a variable for the angle you want the robot to turn. Hint: you can divide in Java using "/". Can’t test until step 6.
		int angle = 180/sides;
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a pentagon.
		for (int i = 0; i < 20000; i++) {
			
		
			// 2. Move the robot 200 pixels
			T.move(i);
			// 10. Make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
			T.setRandomPenColor();
			// 6. Turn the robot the amount in your angle variable
			T.turn(61);
			// 11. Turn the robot one more degree
			
}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new Otherpentagoncrazy2().makePrettyThings();
	}
}

