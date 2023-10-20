package Enum.Enumerable;

public enum EnumerableChar {

	ACTIVE('1'), INACTIVE('0');

	private char valueStatus;

	EnumerableChar(char valueStatus){
            this.valueStatus = valueStatus;
        }

	public char getValue() {
		return this.valueStatus;
	}
}
