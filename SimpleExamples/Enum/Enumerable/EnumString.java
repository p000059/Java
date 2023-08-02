package Enum.Enumerable;

public enum EnumString {

	ACTIVE("Ativo"), 
	INACTIVE("Inativo"), 
	EMPTY("Vazio");

	private String valueStatus;

	EnumString(String valueStatus) {
		
		this.valueStatus = valueStatus;
	}

	public String getValue() {
		
		return this.valueStatus;
	}
}
