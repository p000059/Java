package Collections.Array.AppArray;

import Collections.Array.ClassArray.MakeInverseArray;

public class AppInverseArray {

	public static void main(String[] args) {
		
		int size = 10;
		
		MakeInverseArray.showArray(MakeInverseArray.copyInverseArray(size, MakeInverseArray.fillArray(size)));
	}
}
