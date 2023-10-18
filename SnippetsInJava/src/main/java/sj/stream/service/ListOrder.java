package sj.stream.service;

import java.util.List;
import java.util.stream.Collectors;

public class ListOrder {

    public List<Object> streamListOrder(List<Integer> A){
        
        List<Object> B = A.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList()); 
        return B;
    }

    public List<Integer> listOrder(List<Integer> A){

        A.sort((a, b) -> a.compareTo(b));
        
        return A;
    }
}
