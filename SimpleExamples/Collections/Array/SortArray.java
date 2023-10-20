package Collections.Array;

public class SortArray {

	public Integer[] fillArrayRandomInteger(Integer[] array) {

		int aux = 0;
		
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {

				if (array[j] > array[i]) {

					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}

		return array;
	}
}
