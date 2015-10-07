package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot K = new Robot();
		
		K.penDown();
		
		K.setSpeed(10);
		// 4. Do the following (steps 7-9) 75 times
		for (int i = 0; i < 75; i++) {
			K.setRandomPenColor();
			K.move(15*i);
			K.setPenWidth(i);
			K.turn(360/11);
}
	}
}
