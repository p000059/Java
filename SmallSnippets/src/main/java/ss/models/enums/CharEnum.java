package ss.models.enums;

public enum CharEnum {

	ACTIVE('1'), INACTIVE('0');

	private char valueStatus;

	CharEnum(char valueStatus) {
		this.valueStatus = valueStatus;
	}

	public char getValue() {
		return this.valueStatus;
	}
}
