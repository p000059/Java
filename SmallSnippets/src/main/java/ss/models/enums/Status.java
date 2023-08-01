package ss.models.enums;

public enum Status {

	ACTIVE(true),
	INACTIVE(false);
	
	private boolean value;
	
	Status(boolean value){
		this.value = value;
	}
	
	public boolean getStatus() {
		
		return value;
	}
}
