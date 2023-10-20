package Interface.App;

import javax.swing.JOptionPane;

import Interface.FunctionalInterfaces.NoParameter;
import Interface.FunctionalInterfaces.OneParameter;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaApplication {

    public static void main(String[] args) {

        UnaryOperator<Double> doubleUnaryOperator = (n) -> {return 98.5 - n;};
        JOptionPane.showMessageDialog(null, "Valor Unary: " + doubleUnaryOperator.apply(1.5));

        Predicate<Integer> even = value -> value % 2 == 0;
        JOptionPane.showMessageDialog(null, "Valor do número: " + even.test(10));
        
        NoParameter<Double> noParameter = () -> 98.5;
        JOptionPane.showMessageDialog(null, noParameter.getValue());
        
        OneParameter<Double> iFunctionalMethodOneParameter = (n) -> 1.0 / n;
        JOptionPane.showMessageDialog(null, "Result = " + iFunctionalMethodOneParameter.getValue(4.0));
    }
}

