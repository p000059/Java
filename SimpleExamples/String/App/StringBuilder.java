package String.App;

import javax.swing.JOptionPane;

public class StringBuilder {

	public static void main(String[] args) {
		
		String[] letters = {"B","C","D","E","F"};
		
		String alphabet = " ";
		
		for(String letter : letters) {
			
			alphabet = alphabet + letter;
		}

		JOptionPane.showMessageDialog(null, "1 - " + alphabet);
		
		StringBuffer stringBuffer = new StringBuffer(); //É mais utilizada com Thread.
		
		for(String letter : letters) {
			
			stringBuffer.append(letter);
		}
		
		alphabet = stringBuffer.toString();
		JOptionPane.showMessageDialog(null, "2 - " + alphabet);
		alphabet = new String(stringBuffer);
		JOptionPane.showMessageDialog(null, "3 - " + alphabet);
		JOptionPane.showMessageDialog(null, "3.1 - " + stringBuffer.reverse());
		
	}
}
