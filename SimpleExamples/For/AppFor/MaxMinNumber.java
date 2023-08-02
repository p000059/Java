package For.AppFor;

import javax.swing.JOptionPane;

public class MaxMinNumber {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Numero máximo: " + findMin() + "\nNúmero máximo: " + findMax());
	}
	
	public static int findMax() {

        int min = Integer.MIN_VALUE;
        int[] vet = {10, 38, 5, 98, 3, 8, 41, 99, 1, 2};
        

        for (int i = 0; i < vet.length; i++) {

            if (vet[i] > min) {
                min = vet[i];
            }
        }
        
        return min;
    }

    public static int findMin() {

        int max = Integer.MAX_VALUE;
        
        int[] vet = {10, 38, 5, 98, 3, 8, 41, 99, 1, 2};

        for (int i = 0; i < vet.length; i++) {

            if (vet[i] < max) {
                max = vet[i];
            }
        }
        
        return max;
    }
}
