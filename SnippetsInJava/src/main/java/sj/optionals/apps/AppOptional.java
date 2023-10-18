package sj.optionals.apps;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;

import sj.optionals.models.Person;
import sj.optionals.services.OptionalOperations;

public class AppOptional {

	public static void main(String[] args) {
		
		List<Person> lstPerson = new ArrayList<>();
		OptionalOperations<Person> opPerson = new OptionalOperations<>();
		Person objPerson = new Person
				.Builder(1L)
				.name("Marcelo")
				.age(29)
				.builder();
		
		String number = "1";		
		lstPerson.add(objPerson);
		
		Optional<Person> result = opPerson.findElementsGeneric(lstPerson); 
		Optional<Integer> optionalNumber = opPerson.checkIsPresent(number);
		Optional<Person> outPutPerson = Optional.ofNullable(objPerson);		
		
		JOptionPane.showMessageDialog(null, "Name: " + result.get().getName() 
				+ "\nLast Name: " + result.get().getLastName()
				+ "\nDescription: " + result.get().getDescription()
				+ "\nAge: " + result.get().getAge()
				);
		
		optionalNumber.ifPresent(n -> JOptionPane.showMessageDialog(null, n));
		JOptionPane.showMessageDialog(null, outPutPerson.get().getLastName());
	}
}
