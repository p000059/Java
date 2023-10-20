package Enum.Enumerable;

public enum EnumInt {

	ACTIVE(1),
	INACTIVE(0),
	EMPTY(2);
	
	private int enumNumber;
	
	EnumInt(int enumNumber){
		this.enumNumber = enumNumber;
	}
	
	public int getValue() {
		
		return enumNumber;
	}
}
