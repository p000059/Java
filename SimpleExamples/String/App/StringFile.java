package String.App;

import javax.swing.JOptionPane;

import String.Class.Person;

public class StringFile {

	public static void main(String[] args) {

		String fromFile = "1;Antonio;40";
		String[] toDatabase = fromFile.split(";");
		Person objPerson = new Person(Integer.parseInt(toDatabase[0]), toDatabase[1], Integer.parseInt(toDatabase[2]));

		JOptionPane.showMessageDialog(null,
				"ID: " + objPerson.getId() + "\nName: " + objPerson.getName() + "\nAge: " + objPerson.getAge());

	}
}
