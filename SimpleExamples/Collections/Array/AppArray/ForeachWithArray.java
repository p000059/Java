package Collections.Array.AppArray;

public class ForeachWithArray {

    public static void main(String[] args) {

        int[] array = new int[5];
        
        for(int i = 0; i < array.length; i++){
            array[i] = i + 2;
        }
        
        int j = 0;
        for(int i: array){
            System.out.println("Vetor["+ j +"] = " + i);
            j++;
        }
    }
}
