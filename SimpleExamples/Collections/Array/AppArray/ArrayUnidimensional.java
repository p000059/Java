package Collections.Array.AppArray;

public class ArrayUnidimensional {

    public static void main(String[] args) {

        int size = 5;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = i + 5;
            System.out.println("Vetor["+ i + "] = " + array[i]);
        }
    }
}
