package Collections.Array;

public class ManipulateArray {

    private String[] arrayElements;
    private int size;

    public ManipulateArray(int sizeArray) {
        this.arrayElements = new String[sizeArray];
        this.size = 0;
    }

    public void returnArray(String element) {

        //Procura uma posição vazia no array para preencher com "element", ao encontrar, ele finalizará o laço com break;
        for (int i = 0; i < arrayElements.length; i++) {
            if (arrayElements[i] == null) {
                arrayElements[i] = element;
                break;
            }
        }
    }

    public String[] addElementToArray(String element) {

        String[] newArray = null;

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

    public boolean returnArraySizeLogic(String element) {

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

    public String findElement(String element) {

        String foundElement = "";

        for (int i = 0; i < arrayElements.length; i++) {
            if (arrayElements[i].equalsIgnoreCase(element)) {
                foundElement = element;
                break;
            }
        }

        return foundElement;
    }

    public boolean findElementBoolean(String element) {

        for (int i = 0; i < this.arrayElements.length; i++) {
            if (this.arrayElements[i].equalsIgnoreCase(element)) {
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

    public void addElementPosition(int position, String element) {

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

    private String[] enlargeCapacityArray() {

        String[] newElement = new String[this.size];

        if (this.size <= this.arrayElements.length) {

            newElement = new String[this.arrayElements.length + 1];

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
