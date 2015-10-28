package day1.robot;

import javax.swing.JOptionPane;

public class madlibs {
public static void main(String[] args) {
	String noun1 = JOptionPane. showInputDialog("a noun plz");
	String verb = JOptionPane. showInputDialog("now a verb");
	String noun2 = JOptionPane. showInputDialog("another noun");
	JOptionPane. showMessageDialog(null, noun1 + " " + verb +" on "+noun2);
}
}
