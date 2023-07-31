package ss.models.enums;

public enum EnumChar {

	ACTIVE('1'), INACTIVE('0');

	private char valueStatus;

	EnumChar(char valueStatus) {
		this.valueStatus = valueStatus;
	}

	public char getValue() {
		return this.valueStatus;
	}
}
