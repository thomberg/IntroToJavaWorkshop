import javax.swing.JOptionPane;

public class snooper_dog {
public static void main(String[] args) {
	String answer1 = JOptionPane. showInputDialog("what is your name");
	String answer2 = JOptionPane. showInputDialog("where are you");
	String answer3 = JOptionPane. showInputDialog("why are you here");
	JOptionPane. showMessageDialog(null, "I know you are" + answer1);
	JOptionPane. showMessageDialog(null, "I know u are" + answer2);
	JOptionPane. showMessageDialog(null, "I know that" + answer3);
	
	
			
}
}
