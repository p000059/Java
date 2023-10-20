package Collections.Array.AppArray;

public class ArrayBidimensional {

	public static void main(String[] args) {

		final int size = 4;
		final int coluna = size;
		final int linha = size;

		int[][] array = new int[coluna][linha];

		for (int i = 0; i < array.length; i++) {
			
			System.out.println();
			
			for (int j = 0; j < array[i].length; j++) {
				
				array[i][j] = i + j;
				System.out.print("\nArray[" + i + "][" + j + "] = " + array[i][j]);
			}
		}
	}
}
