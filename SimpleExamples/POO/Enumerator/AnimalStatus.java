package POO.Enumerator;

public enum AnimalStatus {

	ACTIVE("Ativo"), 
	INACTIVE("Inativo"), 
	EMPTY("Vazio");

	private String valueStatus;

	AnimalStatus(String valueStatus) {
		
		this.valueStatus = valueStatus;
	}

	public String getValue() {
		return this.valueStatus;
	}
}
