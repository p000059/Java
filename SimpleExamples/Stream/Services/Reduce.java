package Stream.Services;

import java.util.List;

public class Reduce {

	public Integer returnsReduceValue(List<Integer> sourceList) {

		// If the stream() is empty, it will get the identity value 0.

		try {

			Integer outPutObject = sourceList
					.stream()
					.reduce(0, (x, y) -> x + y);
			
			return outPutObject;

		} catch (NullPointerException e) {

			return Integer.valueOf(null);

		} catch (Exception e) {

			return Integer.valueOf(0);
		}
	}

	public Integer valueIdentityMultiplication(List<Integer> A) {

		// If the stream() is empty, it will get the identity value 0.

		try {

			return A.stream()
					.reduce(1, (n1, n2) -> n1 * n2);

		} catch (Exception e) {

			return Integer.valueOf(1);

		}
	}

	public String valueIdentityString(List<String> sourceList, String object) {

		// If the stream() is empty, it will get the identity value empty.

		try {

			return sourceList
					.stream()
					.reduce(" ", (s1, s2) -> s1.concat(s2));

		} catch (Exception e) {

			return String.valueOf(" ");

		}
	}

	public double valueIdentityDouble(List<Double> A) {

		// The identity value is an infinite positive.

		try {

			return A.stream()
					.reduce(Double.POSITIVE_INFINITY, (n1, n2) -> Math.min(n1, n2));

		} catch (Exception e) {

			return double.class.getModifiers();
		}
	}

	public String valueIdentityReduce(List<String> A) {

		try {

			return A.stream().reduce("", (n1, n2) -> n1.toString().concat(n2.toString()), (n1, n2) -> n1.concat(n2));

		} catch (Exception e) {

			return String.valueOf(e);

		}
	}
}
