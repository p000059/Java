package Switch.App;

import javax.swing.JOptionPane;

public class JOptionClass {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");

        int option = JOptionPane.showConfirmDialog(null,"Seu nome é " + nome + "?", "Selecione uma opção", JOptionPane.YES_NO_CANCEL_OPTION);
                // 0-YES_OPTION  1-NO_OPTION  2-CANCEL_OPTION

        if(option == 0){
            JOptionPane.showMessageDialog(null, "Obrigado " + nome, "Resposta", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(option == 1){
            JOptionPane.showMessageDialog(null, "Desculpe!", "Resposta", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Respota Errada", "Resposta", JOptionPane.WARNING_MESSAGE);
        }
    }
}


