package POO.Class;

public class NaturalPerson extends Person {

	private String CPF;
	private String identity;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	@Override
	public String toString() {
		return "\n\n		Natural Person \n\nName: " + getName() + "\nCPF: " + getCPF() + "\nIdentity: " + getIdentity() + "\nStatus: " + getSituationPerson();
	}
}
