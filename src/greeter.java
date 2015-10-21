import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) {
	String answer1 = JOptionPane. showInputDialog(null, "what is your name");
	JOptionPane. showMessageDialog(null, answer1);
	String answer2 = JOptionPane. showInputDialog("do u like dogs");
	JOptionPane. showMessageDialog(null, answer2);
	
}
}
