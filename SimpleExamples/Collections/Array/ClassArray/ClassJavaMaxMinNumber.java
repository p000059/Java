package Collections.Array.ClassArray;

public class ClassJavaMaxMinNumber {

	public static int[] arrayFilled() {
		
		int[] array = {10, 38, 5, 64, 3, 8, 41, 97, 43, 2};
		
		return array; 
	}
	
    public static int findMax(int[] sourceArray) {

        int min = Integer.MIN_VALUE;

        for (int i = 0; i < sourceArray.length; i++) {

            if (sourceArray[i] > min) {
                min = sourceArray[i];
            }
        }
        
        return min;
    }

    public static int findMin(int[] sourceArray) {

        int max = Integer.MAX_VALUE;

        for (int i = 0; i < sourceArray.length; i++) {

            if (sourceArray[i] < max) {
                max = sourceArray[i];
            }
        }
        
        return max;
    }
}
