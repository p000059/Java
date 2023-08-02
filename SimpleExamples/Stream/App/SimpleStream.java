package Stream.App;

import java.util.Arrays;
import java.util.List;

public class SimpleStream {

    public static void main(String[] args) {

        List<Integer> A = Arrays.asList(5,0,2,9,4,1,6,8,3,7);

        System.out.println();
        
        A.stream()
                .sorted()
                .forEach(n -> System.out.print("\nLista<Integer> A = { " + n + " }"));
        
        System.out.println();
    }
}
