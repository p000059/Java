package sj.stream.service;

import java.util.List;

public class Count<T> {

	public Long countsListElements(List<T> sourceList) {

		Long outPutList = sourceList.stream().count(); 

		return outPutList;
	}
}
