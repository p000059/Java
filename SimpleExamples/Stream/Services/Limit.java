package Stream.Services;

import java.util.List;
import java.util.stream.Collectors;

public class Limit<T> {

	public List<String> limitToList(List<String> sourceList, int size) {

		List<String> outPutList = sourceList.stream()
				.limit(size) // Limits result to the number of positions passed by the "size" parameter.
				.collect(Collectors.toList());

		return outPutList;
	}

	public List<Integer> limitFilterToList(List<Integer> sourceList, int size) {

		List<Integer> outPutList = sourceList.stream()
				.limit(size)
				.filter(p -> p % 2 == 0) // Filter on even numbers.
				.collect(Collectors.toList());

		return outPutList;
	}
	
	public List<T> limitToListGeneric(List<T> sourceList, int size){
		
		List<T> outPutList = sourceList.stream()
				.limit(size)
				.collect(Collectors.toList());
		
		return outPutList;
	}
	
	public List<T> skipLimitListGeneric(List<T> sourceList, int skip, int limit){
		
		List<T> outPutList = sourceList.stream()
				.skip(skip)
				.limit(limit)
				.collect(Collectors.toList());
		
		return outPutList;
	}
}
