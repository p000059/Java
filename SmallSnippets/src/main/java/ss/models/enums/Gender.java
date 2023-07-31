package ss.models.enums;

public enum Gender {

	MALE('M'), FEMALE('F'), OUTHER('O');

	private final char code;

	Gender(char code) {
		this.code = code;
	}

	public static Gender fromCode(char code) {

		if (code == 'M' || code == 'm') {

			return MALE;
		}

		if (code == 'F' || code == 'f') {

			return FEMALE;
		}
		
		if(code == 'O' || code == 'o') {
			
			return OUTHER;
		}

		throw new UnsupportedOperationException("The code " + code + " is not supported!");
	}

	public char getCode() {

		return code;
	}
}
