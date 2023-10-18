package sj.stream.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter<T> {

	public List<Integer> filterEvenNumber(List<Integer> sourceList) {

		List<Integer> outPutList = new ArrayList<>();
		
		try {
			
			outPutList = sourceList.stream()
					.filter(e -> e % 2 == 0) 
					.collect(Collectors.toList()); 

			return outPutList;
			
		} catch (Exception e) {

			outPutList = sourceList;
			return outPutList;
		}
	}
	
	public List<String> filterString(List<String> sourceList, String word) {

		List<String> outPutList = new ArrayList<>();
		
		try {
			
			outPutList = sourceList.stream()
					.filter(p -> p.equals(word)) 
					.collect(Collectors.toList()); 

			return outPutList;
			
		} catch (Exception e) {

			outPutList = sourceList;
			return outPutList;
		}
	}
	
	public List<T> filterPredicate(List<T> sourceList, T object) {

		List<T> outPutList = new ArrayList<>();
		
		try {

			outPutList = sourceList.stream()
					.filter(T -> T.equals(object)) 
					.collect(Collectors.toList()); 

			return outPutList;
			
		} catch (Exception e) {

			outPutList = sourceList;
			return outPutList;
		}
	}
}
