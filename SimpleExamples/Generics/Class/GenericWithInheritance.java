package Generics.Class;

public class GenericWithInheritance<T extends Number> {

	private T number;

	public GenericWithInheritance(T number) {
		this.number = number;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}

	public Object readNumber() {

		return this.getNumber().getClass().getName();
	}
}
