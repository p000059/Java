package Collections.Array.ClassArray;

public class ArrayGenerics<T> {

	private T[] arrayElements;
	private int size;

	public ArrayGenerics() {
	}

	@SuppressWarnings("unchecked")
	private T[] enlargeCapacityArray(T[] arrayElements, int size) {

		T[] newElement = (T[]) new Object[size];

		if (size <= arrayElements.length) {

			newElement = (T[]) new Object[arrayElements.length + 1];

			newElement = this.arrayElements;
		}

		return newElement;
	}

	@SuppressWarnings("unchecked")
	public ArrayGenerics(int sizeArray) {

		this.arrayElements = (T[]) new Object[sizeArray];
		this.size = 0;
	}

	public void returnElementArray(T element) {

		for (int i = 0; i < arrayElements.length; i++) {

			if (arrayElements[i] == null) {
				arrayElements[i] = element;
				break;
			}
		}
	}

	public T[] addElementToArray(T[] arrayElements, T element, int size) {

		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[this.size];

		if (size < arrayElements.length) {

			arrayElements[size] = element;
			size++;

			return arrayElements;

		} else if (size >= arrayElements.length) {

			newArray = enlargeCapacityArray(arrayElements, size);

			newArray[size] = element;
			size++;

		}

		return newArray;
	}

	public boolean returnArraySizeLogic(T[] array, T element, int size) {

		array[size] = element;

		if (size < array.length) {

			array[size] = element;
			size++;
			return true;

		} else { // SE o tamanho "size" for maior que o número do elementos do array
					// "elemnts.length", o retorno é falso.

			return false;
		}
	}

	public T[] findElement(T[] array, T element, int size) {

		@SuppressWarnings("unchecked")
		T[] foundElement = (T[]) new Object[size];

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(element)) {
				foundElement[i] = element;
				break;
			}
		}

		return foundElement;
	}

	public boolean findElementBoolean(T element, T[] array) {

		for (int i = 0; i < array.length; i++) {

			if (array[i].equals(element)) {
				return true;
			}
		}
		return false;
	}

	public boolean addElement(T element, T[] array, int size) {

		while (size < array.length) {

			if (size >= array.length) {

				array[size] = element;
				size++;

				return true;
			}
		}

		return false;
	}

	public void addElementPosition(int position, T element, int size, T[] array) {

		while (!(position >= 0) && (position < this.size)) {
			
			enlargeCapacityArray(array,size);

		}

		for (int i = size - 1; i >= array.length; i--) {
			
			array[i + 1] = array[i];
		}

		array[position] = element;
		size++;

		if (!(position >= 0) && (position < size)) {
			throw new IllegalArgumentException("Invalid Position");
		}

	}

	public void removeElement(int position, T[] array, int size) {

		if (!(position >= 0) && (position < this.size)) {
			throw new IllegalArgumentException("Posição Inválida");
		}

		for (int i = position; i < size - 1; i++) {
			
			array[i] = array[i + 1];
		}
		this.size--;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		builder.append("[");

		for (int i = 0; i < this.arrayElements.length; i++) {
			builder.append(arrayElements[i]);
			builder.append(" ");
		}

		builder.append("]");

		return builder.toString();
	}

}
