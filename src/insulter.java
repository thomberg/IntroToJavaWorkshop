import javax.swing.JOptionPane;

public class insulter {
	public static void main(String[] args) {
		
			
	
	
	
	
	
	
	}
	

	
	
	
	
		static void speak(String words) {
		
			try {
		   		 Runtime.getRuntime().exec("say " + words).waitFor();
		   	 } catch (Exception e) {
		   		 e.printStackTrace();
		   	 }
		}

	
}
