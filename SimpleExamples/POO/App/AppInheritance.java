package POO.App;

import javax.swing.JOptionPane;

import POO.Class.*;
import POO.Enumerator.EnumStatus;

public class AppInheritance {

	public static void main(String[] args) {

		NaturalPerson naturalPerson = new NaturalPerson();
		LegalPerson legalPerson = new LegalPerson();
		
		naturalPerson.setName("Marcelo");
		naturalPerson.setCPF("000.000.000-00");
		naturalPerson.setIdentity("0.000.000");
		naturalPerson.setSituationPerson(EnumStatus.INACTIVE.getValue());
		
		legalPerson.setName("Marcelo 000.000.000-00");
		legalPerson.setCNPJ("00.000.000/0000-00");
		legalPerson.setIS("000.000.000/000-00");
		legalPerson.setSituationPerson(EnumStatus.ACTIVE.getValue());
		
		JOptionPane.showMessageDialog(null, legalPerson.toString() + naturalPerson.toString());
		

	}

}
