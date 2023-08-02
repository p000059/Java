package Collections.Array.ClassArray;

public class ArrayObject {

    private Object[] arrayElements;
    private int size;
    
    public Object[] getArrayElements() {
		return arrayElements;
	}

	public void setArrayElements(Object[] arrayElements) {
		this.arrayElements = arrayElements;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public ArrayObject() {
		
	}

	public ArrayObject(Object[] arrayElements, int size) {
		
		this.arrayElements = arrayElements;
		this.size = size;
	}

	public ArrayObject(int sizeArray) {
        this.arrayElements = new Object[sizeArray];
        this.size = 0;
    }
    
    public void returnElementArray(Object element) {

        //Procura uma posição vazia no array para preencher com "element", ao encontrar, ele finalizará o laço com break;
        for (int i = 0; i < arrayElements.length; i++) {
            
        	if (arrayElements[i] == null) {
                
            	arrayElements[i] = element;
                break;
            }
        }
    }

    public Object[] addElementToArray(Object element) {

        Object[] newArray = null;

        if (this.size < this.arrayElements.length) {

            this.arrayElements[this.size] = element;
            this.size++;

            return arrayElements;

        } else {

            if (this.size >= this.arrayElements.length) {

                newArray = enlargeCapacityArray();

                newArray[this.size] = element;
                this.size++;

            }
        }
        
        return newArray;
    }

    public boolean returnArraySizeLogic(Object element) {

        this.arrayElements[this.size] = element;

        //Verifica se o tamanho é menor que a capacidade do array elementos.
        if (this.size < this.arrayElements.length) {

            this.arrayElements[this.size] = element;
            this.size++;
            return true;

        } else { //SE o tamanho "size" for maior que o número do elementos do array "elemnts.length", o retorno é falso.

            return false;
        }
    }

    public Object findElement(Object element) {

        Object foundElement = "";

        for (int i = 0; i < arrayElements.length; i++) {
            if (arrayElements[i].equals(element)) {
                foundElement = element;
                break;
            }
        }

        return foundElement;
    }

    public boolean findElementBoolean(Object element) {

        for (int i = 0; i < this.arrayElements.length; i++) {
            if (this.arrayElements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean addElement(String element) {

        while (this.size < this.arrayElements.length) {

            enlargeCapacityArray();

            if (this.size >= this.arrayElements.length) {

                this.arrayElements[this.size] = element;
                this.size++;
                return true;

            }
        }

        return false;
    }

    public void addElementPosition(int position, Object element) {

        while (!(position >= 0) && (position < this.size)) {
            enlargeCapacityArray();

        }

        for (int i = this.size - 1; i >= arrayElements.length; i--) {
            this.arrayElements[i + 1] = this.arrayElements[i];
        }

        this.arrayElements[position] = element;
        this.size++;

        if (!(position >= 0) && (position < this.size)) {
            throw new IllegalArgumentException("Invalid Position");
        }

    }

    private Object[] enlargeCapacityArray() {

        Object[] newElement = new Object[this.size];

        if (this.size <= this.arrayElements.length) {

            newElement = new Object[this.arrayElements.length + 1];

            newElement = this.arrayElements;
        }

        return newElement;
    }

    public void removeElement(int position) {

        if (!(position >= 0) && (position < this.size)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        for (int i = position; i < this.size - 1; i++) {
            this.arrayElements[i] = this.arrayElements[i + 1];
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
