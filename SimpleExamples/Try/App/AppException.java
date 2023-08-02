package Try.App;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Try.Class.PersonTry;
import Try.Services.TryServices;

public class AppException {

	public static void main(String[] args) {

		List<PersonTry> lstWord = new ArrayList<>();
		PersonTry personOne = new PersonTry(1,"Marcelo","marcelo.acad");
		PersonTry personTwo = new PersonTry(2,"Lucas","lucas.lima");
		
		lstWord.add(personOne);
		lstWord.add(personTwo);
		
		PersonTry personThree = new PersonTry(3,"Maria","marcelo.acad");

		TryServices tryServices = new TryServices();
		
		
		if(tryServices.create(lstWord, personThree) == true) {
			
			lstWord.add(personThree);
			JOptionPane.showMessageDialog(null, "Registered sucessfully");
		}
		
	}
}
