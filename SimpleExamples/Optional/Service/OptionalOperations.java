package Optional.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalOperations<T> {

	public Optional<T> findObject(T objectSource){
		
		try {
			
			Optional<T> outPutObject = Optional.of(objectSource);
			return outPutObject;
			
		} catch (Exception e) {
			
			return Optional.empty();
			
		}
	}
	
	public Optional<Integer> reduceElements(List<Integer> sourceList) {
		
		try {

			Optional<Integer> outPutList = sourceList.stream().reduce((n1, n2) -> n1 - n2);

			return outPutList;
			
		} catch (Exception e) {

			return Optional.empty();
		}
	}
	
	public Optional<T> findElementsGeneric(List<T> sourceList){
		
		try {
			
			Optional<T> outPutList = sourceList.stream().findAny();
			return outPutList;
			
		} catch (Exception e) {
			
			return Optional.empty();
		}
	}
	
	public Optional<Integer> checkIsPresent(String number){
		
		try {
			
			Integer objNumber = Integer.valueOf(number); //Convert text to Integer.
			return Optional.ofNullable(objNumber);
			
		} catch (Exception e) {
			
			return Optional.empty();
		}
	}

	public static Optional<String> concatStringList(List<String> A) {
		
		try {

			return A.stream().reduce((s1, s2) -> s1.concat(s2));
			
		} catch (Exception e) {

			return Optional.empty();
		}
	}

	public Optional<Integer> changeNumber(String word){
		
		try {
			
			Integer number = Integer.valueOf(word); //Convert text to Integer.
			return Optional.of(number);
			
		} catch (Exception e) {
			
			return Optional.empty();
		}
	}

	public Optional<Integer> compareMinimumValue(List<Integer> sourceList) {

		try {

			Optional<Integer> min = sourceList.stream().min(Comparator.naturalOrder());

			return min;

		} catch (Exception e) {

			return Optional.empty();
		}
	}

	public Optional<Integer> compareMinimumAndMaximumValue(List<Integer> sourceList) {

		try {

			Optional<Integer> max = sourceList.stream().max(Comparator.naturalOrder());

			return max;

		} catch (Exception e) {

			return Optional.empty();
		}
	}

	public static Optional<Integer> nineteenthReduce(List<Integer> sourceList) {
		
		try {
			
			Optional<Integer> optional = sourceList.stream()
					.distinct()
					.filter(e -> e % 2 == 0)
					.reduce((n1, n2) -> n1 + n2);
			
			return optional;
			
		} catch (Exception e) {
			
			return Optional.empty();
		}
	}

	public static Optional<Integer> eleventhReduce(List<Integer> A) {
		
		try {
			
			Optional<Integer> optional = A.stream().distinct().reduce((n1, n2) -> n1 - n2);
			return optional;
			
		} catch (Exception e) {
			
			return Optional.empty();
		}
	}

	public static Optional<String> tenthReduce(List<String> A) {
		
		try {
			
			return A.stream().reduce((s1, s2) -> s1.concat(s2));
			
		} catch (IndexOutOfBoundsException e) {
			
			return Optional.empty();
		}
	}

	public Optional<Integer> twelveExample(List<Integer> A) {
		
		Optional<Integer> numberASC = A.stream()
				.distinct()								
				.min(Comparator.naturalOrder()); 
												

		return numberASC;
	}

	public Optional<Integer> thirteenthExample(List<Integer> A) {

		Optional<Integer> numberDESC = A.stream()
				.distinct()
				.max(Comparator.naturalOrder());

		return numberDESC;
	}
}
