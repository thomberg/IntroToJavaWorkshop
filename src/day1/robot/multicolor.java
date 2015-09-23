package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class multicolor {
	public static void main(String[] args) {
		Robot thom = new Robot();
		Robot poo = new Robot();
		for (int i = 0; i < 4; i++) {
			thom.penDown();
			thom.setRandomPenColor();
			thom.setPenWidth(30);
			thom.move(500);
			thom.turn(90);
		}
		for (int i = 0; i < 4; i++) {
			poo.penDown();
			poo.setRandomPenColor();
			poo.setPenWidth(30);
			poo.move(-500);
			poo.turn(-90);
		}
		
		
	}

}
