package ss.models.enums;

public enum IntEnum {

	ACTIVE(1),
	INACTIVE(2);
	
	private int number;
	
	IntEnum(int number){
		
		this.number = number;
	}
	
	public int getNumber() {
		
		return number;
	}
}
