package sj.stream.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct<T> {
	
	public List<T> removeRepetitionsGeneric(List<T> sourceList) {

		List<T> outPutList = new ArrayList<>();
		
		try {
			
			 outPutList = sourceList.stream()
					.distinct() 
					.collect(Collectors.toList()); 
			
			return outPutList;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			outPutList = null;
			return outPutList;
		}
	}
	
	public List<Integer> removeRepetitionsInteger(List<Integer> sourceList) {

		List<Integer> outPutList = new ArrayList<>();

		try {
			outPutList = sourceList.stream()
					.distinct() 
					.collect(Collectors.toList()); 
			
			return outPutList;

		} catch (Exception e) {

			outPutList = null;
			return outPutList;
		}
	}
}
