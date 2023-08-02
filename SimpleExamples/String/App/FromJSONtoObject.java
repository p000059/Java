package String.App;

import String.Class.Person;

public class FromJSONtoObject {

	public static void main(String[] args) {
		
		String fromFile = "1;Antonio;40";
		String[] toDatabase = fromFile.split(";");
		
		Person objPerson = new Person();
		
		objPerson.setId(Integer.parseInt(toDatabase[0]));
		objPerson.setName(toDatabase[1]);
		objPerson.setAge(Integer.parseInt(toDatabase[2]));		
	}
}


