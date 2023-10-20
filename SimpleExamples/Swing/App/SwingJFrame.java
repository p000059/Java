package Swing.App;

import javax.swing.*;

public class SwingJFrame {

    public SwingJFrame(){

        //Cria um contêiner JFrame
        JFrame jFrame = new JFrame("Aplicação JFrame em Java");

        //Fornece o tamanho inicial para o quadro
        jFrame.setSize(600,300);
        //Largura = 600, Altura = 300

        //Encerra o programa quando o usuário fecha o aplicativo
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Cria o rótulo baseado em texto
        JLabel jLabel = new JLabel("Aplicação moderna em Swing GUI.");//Cria um rótulo do swing

        //Adiciona o rótulo ao painel de conteúdo.
        jFrame.add(jLabel);

        //Exibe o quadro
        jFrame.setVisible(true);
    }
}
