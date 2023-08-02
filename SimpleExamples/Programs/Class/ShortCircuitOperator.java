package Programs.Class;

public class ShortCircuitOperator {

	public static void main(String args[]) {
		
		boolean valueOne = true;
		boolean valueTwo = false;
		
		//Evaluate both.
		boolean resultOne = valueTwo & valueOne;
		
		//If the first condition is false, the operation is terminated.
		boolean resultTwo = valueTwo && valueOne;
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
	}
}
