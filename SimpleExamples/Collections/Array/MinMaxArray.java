package Collections.Array;

import javax.swing.JOptionPane;

public class MinMaxArray {

    public static void main(String[] args) {

        int[] array = {5,8,2,9,4,1,10,6,3,7};
        int higherNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        try {
            for(int i = 0; i < array.length; i++){
                if(array[i] > higherNumber){
                	higherNumber = array[i];
                }
            }

            for (int i = 0; i < array.length; i++){
                if(array[i] < smallestNumber){
                	smallestNumber = array[i];
                }
            }
        }
        catch (Exception e){
            e.getMessage();
        }

        JOptionPane.showMessageDialog(null, "\nMenor Numero: " + smallestNumber + "\nMaior Numero: " + higherNumber);
    }
}
