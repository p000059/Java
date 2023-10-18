package sj.ifelse.app;
import javax.swing.JOptionPane;

import sj.ifelse.services.NumberService;
import sj.math.models.Numbers;

public class CheckNumber {

    public static void main(String[] args) {

    	NumberService numberService = new NumberService();
        Numbers numbers = new Numbers(Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 10: ")));
    	
        String result = numberService.evaluatesNumber(numbers.getNumber());
        
        JOptionPane.showMessageDialog(null, result);
    }
}
