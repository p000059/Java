package Generics.Class;

public class Generic<T> {

	private T objGeneric;

	// Constructor
	public Generic(T objGeneric) {
		this.objGeneric = objGeneric;
	}

	// Get and Set
	public T getObjGeneric() {
		return objGeneric;
	}

	public void setObjGeneric(T objGeneric) {
		this.objGeneric = objGeneric;
	}
	
	public Object readObjGeneric() {
		
		return this.getObjGeneric().getClass().getName();
	}
}
