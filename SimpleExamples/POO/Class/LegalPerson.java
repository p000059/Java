package POO.Class;

public class LegalPerson extends Person {

	private String CNPJ;
	private String IS;
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getIS() {
		return IS;
	}
	public void setIS(String iS) {
		IS = iS;
	}
	@Override
	public String toString() {
		return "\n\n		Legal Person \n\nName: " + getName() + "\nCNPJ: " + CNPJ + "\nIS: " + IS + "\nStatus: " + getSituationPerson();
	}
	
	
}
