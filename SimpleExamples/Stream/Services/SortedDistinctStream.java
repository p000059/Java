package Stream.Services;

import java.util.List;
import java.util.stream.Collectors;

public class SortedDistinctStream<T> {

	public List<T> sortedObject(List<T> sourceList) {
		
		List<T> outPutList = sourceList.stream().sorted().collect(Collectors.toList());
		return outPutList;
	}

	public List<T> organizeDistinguishObject(List<T> sourceList) {
		
		List<T> outPutList = sourceList.stream().sorted().distinct().collect(Collectors.toList());
		return outPutList;
	}
}
