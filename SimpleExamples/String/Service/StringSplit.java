package String.Service;

import javax.swing.JOptionPane;

public class StringSplit {
	
	private int id;
	private String name;
	private int age;
	
	public StringSplit(){
		
	}
	
	public StringSplit(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return "id = " + id + "\nname = " + name + "\nage = " + age;
	}	

	public static void main(String[] args) {
		
		String fromFile = "1;Antonio;40";
		String[] toDatabase = fromFile.split(";");
		
		StringSplit objPerson = new StringSplit();
		
		objPerson.setId(Integer.parseInt(toDatabase[0]));
		objPerson.setName(toDatabase[1]);
		objPerson.setAge(Integer.parseInt(toDatabase[2]));
		
		JOptionPane.showMessageDialog(null, objPerson.toString());
		
	}
}
