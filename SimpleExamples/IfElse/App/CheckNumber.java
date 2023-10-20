package IfElse.App;
import javax.swing.JOptionPane;

import IfElse.Service.NumberService;
import Math.Class.Numbers;

public class CheckNumber {

    public static void main(String[] args) {

    	NumberService numberService = new NumberService();
        Numbers numbers = new Numbers(Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 10: ")));
    	
        String result = numberService.evaluatesNumber(numbers.getNumber());
        
        JOptionPane.showMessageDialog(null, result);
    }
}
