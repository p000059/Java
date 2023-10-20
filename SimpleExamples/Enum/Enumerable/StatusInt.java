package Enum.Enumerable;

public enum StatusInt {

	ACTIVE(1), INACTIVE(2), EMPTY(3);

	private int value;
	
	StatusInt(int value){
		
		this.value = value;
	}
	
	public int getValue() {
		
		return this.value;
	}

}
