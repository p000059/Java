package ss.models.enums;

public enum Status {

	ACTIVE(1),
	INACTIVE(0),
	EMPTY(2);
	
	private int enumNumber;
	
	Status(int enumNumber){
		this.enumNumber = enumNumber;
	}
	
	public int getStatus() {
		
		return enumNumber;
	}
}
