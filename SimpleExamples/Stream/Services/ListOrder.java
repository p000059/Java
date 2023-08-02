package Stream.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import Stream.Class.CreateListIntegersAndCharacters;

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
    
    public static void main(String[] args) {
		
    	CreateListIntegersAndCharacters<Integer> cliac = new CreateListIntegersAndCharacters<>();
    	ListOrder listOrder = new ListOrder();
    	List<Integer> lstInt = new ArrayList<>();
    	
    	lstInt = cliac.createListInteger();    	
    	
    	for(Integer obj: listOrder.listOrder(lstInt)) {
    		
    		JOptionPane.showMessageDialog(null, "Value: " + obj);
    	}    	
	}
}
