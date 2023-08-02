package POO.App;

import java.util.Objects;

import javax.swing.JOptionPane;

public class EqualsHashCode {

	private String name;
	private String lastName;
	
	public EqualsHashCode() {
		
	}
	
	public EqualsHashCode(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(lastName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsHashCode other = (EqualsHashCode) obj;
		return Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {

		EqualsHashCode nameOne = new EqualsHashCode("Marcelo", "Guimba");
		EqualsHashCode nameTwo = new EqualsHashCode("Marcelo", "Guimba");
		
		JOptionPane.showMessageDialog(null, 
				"HashcodeOne current class: " + nameOne.hashCode() 
				+ "\nHashcodeTwo current class: " + nameTwo.hashCode()
				+ "\nEquals current class: " + nameOne.equals(nameTwo)
				+ "\n\nHashcodeOne Object class: " + nameOne.getClass()
				+ "\nHashCodeTwo Object class: " + nameTwo
				+ "\nEquals da classe Object: " + (nameOne == nameTwo)
		);
		
	}

}
