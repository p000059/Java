package Collections.List;

import java.util.Arrays;
import java.util.List;

public class ListWithForeach {

    public static void main(String[] args) {

        List<Integer> lstNumber = Arrays.asList(5,0,2,9,4,1,6,8,3,7);

        System.out.println();
        
        int j = 0; 
        
        for(Integer i: lstNumber){
            
        	System.out.print("\nlstNumber["+ j +"] = " + "{"  + i +  "}");
        	j++;
        }
        
        System.out.println();
    }
}
