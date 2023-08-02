package Collections.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        List<Integer> A = Arrays.asList(5,0,2,9,4,1,6,8,3,7);

        for (int i = 0; i < A.size(); i++){
            Collections.sort(A);
        }

        for (Integer i: A) {
            System.out.print("\nList<Integer> A = [ " + i + " ]");
        }
    }
}
