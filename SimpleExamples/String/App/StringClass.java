package String.App;

import javax.swing.JOptionPane;

public class StringClass{
	
	public static void main(String[] args) {
		
		String espacos = new String(" i s p a c o s ");
		String espacosText = new String(" Não Tem Espacos ");
		String union = new String();
		
		
		JOptionPane.showMessageDialog(null, espacos + "\n" + espacosText); 
		
		espacos = espacos.replace("i", "e");//substitui um caracter por outro.
		espacos = espacos.replaceAll(" ", "");//retira os espaços em branco da palavra
		espacos = espacos.toUpperCase(); //Transforma todas as letras em maiúsculo.
		espacosText = espacosText.toLowerCase(); //Transforma todas as letras em minúsculo.
		espacosText = espacosText.trim(); //Retira os espaços em branco do início e do fim da palavra.
		union = String.join(" ", espacos, espacosText); //Une duas ou mais strings.
		
		JOptionPane.showMessageDialog(null,"\nCaixa Alta e sem espaços: " + espacos 
				+ "\nTodas letras em minúsculo: " + espacosText 
				+ "\nDuas strings unidas: " + union);
		
	}
}



