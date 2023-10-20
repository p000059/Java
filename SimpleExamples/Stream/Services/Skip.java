package Stream.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Skip<T> {

	public List<T> skipFirstElements(List<T> sourceList, int skip) {

		List<T> outPutList = sourceList.stream()
			.skip(skip) // Skip the first elements of the list passed by parameter.
			.collect(Collectors.toList());
		
		return outPutList;
	}
	
	public List<Integer> skipFirstElementsInteger(List<Integer> sourceList, int skip) {

		List<Integer> outPutList = sourceList.stream()
			.skip(skip) // Skip the first elements of the list passed by parameter.
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
	
	public List<Integer> skipAndLimitElement(List<Integer> sourceList, Integer skipElement, Integer limitElement) {

		List<Integer> outPutList = new ArrayList<>();

		try {
			
			outPutList = sourceList.stream()
					.skip(skipElement) 
					.limit(limitElement)
					.collect(Collectors.toList()); 
			
			return outPutList;
			
		} catch (Exception e) {
			
			outPutList = null;
			return outPutList;
		}
	}
}
