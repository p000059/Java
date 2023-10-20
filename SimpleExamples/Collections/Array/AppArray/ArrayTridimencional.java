package Collections.Array.AppArray;

public class ArrayTridimencional {

    public static void main(String[] args) {

        final int size = 3;
        int[][][] array = new int[size][size][size];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[j].length; k++){
                    array[i][j][k] = i + j + k;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println();
            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[j].length; k++){
                    System.out.print("\nArray[" + i + "][" + j + "][" + k + "] = " + array[i][j][k]);
                }
            }
        }
    }
}

