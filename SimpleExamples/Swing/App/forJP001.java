package Swing.App;

import javax.swing.*;

public class forJP001{
	public static void main(String[] args){
		
		JFrame frame = new JFrame("Pessoas");
		final JLabel label = new JLabel("Marcos e Juliana");
		
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		int sum = 0;
		for(int i=0; i<5;i++){			
			sum = sum + i;
			JOptionPane.showMessageDialog(null, "Resultado: " + sum);
		}
	}
}