package Try.App;
//Programa que mostra o try, catch e finally utilizando a classe ArithmeticException.

import javax.swing.*;

public class TryCatchFinally {

    public static void main(String[] args) {

        //São declarada as variáveis primitivas para servirem de base para a operação de divisão.
        int numero1 = 0;
        int numero2 = 0;
        int result = 0;
        
        //A lógica aqui funcionará caso o usuário digite um número 0 para dividir o primeiro número, onde será gerada uma exceção.
        do { // O laço do,while vai garantir que os dados serão digitados ao menos uma vez para que a condição de divisão por zero seja identificada caso ocorra.
            try{//O bloco try, vai receber os dois números e efetuar a operação de divisão, caso haja um exceção, segue para catch.

                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));//Caso o valor desse número seja 0, uma exceção é gerada.
                result = numero1 / numero2;
                JOptionPane.showMessageDialog(null, result);
                break;

            }
            catch (ArithmeticException e){
                //Aqui a exceção é mostrada na tela e uma mensagem também possibilita um novo cadastro pela condição do laço.
                JOptionPane.showMessageDialog(null, "Message: " + e.getMessage() + " Repeat Registration");
            }
            finally {
                //Idependente do resultado, sempre é mostrado aqui qualquer número gerado pelo bloco try, com erro ou sem erro.
                JOptionPane.showMessageDialog(null, "Result: " + result);
            }

        }while (numero2 == 0); //Essa condição vai permitir que o laço não finalize até que o numero2 seja igual a zero, ou seja, quando a exceção é gerada.
        //Após a inserção de qualquer número pelo usuário, o laço acaba aqui.
    }
}
