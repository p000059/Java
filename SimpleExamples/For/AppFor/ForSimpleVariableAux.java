package For.AppFor;

import javax.swing.JOptionPane;

public class ForSimpleVariableAux {

    public static void main(String[] args) {

        int auxiliar = 0;

        for(int i = 0; i <= 10; i++){
            
        	auxiliar = auxiliar + i;
        	JOptionPane.showMessageDialog(null, "Auxiliar = " + auxiliar);
            System.out.println("Auxiliar = " + auxiliar);
        }
    }
}
