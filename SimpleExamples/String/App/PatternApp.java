package String.App;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class PatternApp {

	public static void main(String[] args) {
		
		//Esta classe define um padrão para ser usado na pesquisa.
		Pattern pattern = Pattern.compile("Marcelo Guima", Pattern.CASE_INSENSITIVE);
		
		//Essa classe é usada pela pesquisa para o padrão.
		Matcher matcher = pattern.matcher("Guima");
		
		//O método .find(), retornará verdadeiro se o padrão combinado foi encotrado na String.
		boolean matchFound = matcher.find();
		
		int x = 9, y = 4;
		JOptionPane.showMessageDialog(null, "Maior: " + Math.max(x, y));
		
		
		//Se matchFound for verdadeiro, a primeira opção será mostrada, caso contrário a segunda opção será mostrada.  
		if(matchFound) {
			JOptionPane.showMessageDialog(null, "Padrão de String encontrado!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Padrão não encontrado!");
		}
		
	}

}
