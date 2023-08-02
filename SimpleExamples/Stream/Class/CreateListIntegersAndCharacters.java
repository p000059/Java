package Stream.Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateListIntegersAndCharacters<T> {

    private List<Integer> A = new ArrayList<>();
    private List<String> B = new ArrayList<>();

    public CreateListIntegersAndCharacters() {
    }

    public CreateListIntegersAndCharacters(List<Integer> a) {
        A = a;
    }

    public CreateListIntegersAndCharacters(List<Integer> a, List<String> b) {
        A = a;
        B = b;
    }

    public List<Integer> getA() {
        return A;
    }

    public void setA(List<Integer> a) {
        A = a;
    }

    public List<String> getB() {
        return B;
    }

    public void setB(List<String> b) {
        B = b;
    }

    public List<Integer> createListInteger(){

        this.setA(Arrays.asList(0,1,1,2,2,3,3,4,4,5,5,6,7,8,8,8,9,10,10,10,11,12,13,13,14,14,15,16,17,18,18,19,20,20,20));
        return this.getA();
    }

    public List<String> createListString(){

        this.setB(Arrays.asList("Marcelo","Mauricio","Ruth","Lucas","Bibi","Talita","João Victor","Gabriel","Thiago","Taisa","Eduarda"));
        return this.getB();
    }
}
