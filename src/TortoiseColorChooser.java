
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			//3. ask the user what color they would like the tortoise to draw
		String answer1 = JOptionPane.showInputDialog("what color do you want");
		//4. use an if/else statement to set the pen color that the user requested
		if (answer1.equals("blue")) {
			Tortoise.setPenColor(Color.BLUE);
		} else {
			Tortoise.setPenColor(Colors.getRandomColor());
		}
//5. if the user doesn’t enter anything, choose a random color
		
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)

		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);

		}
		
	}
}



