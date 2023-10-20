package Programs.Class;

import java.util.ArrayList;
import java.util.List;

public class CreateAndFillList {

    //Declaring variables and class members.
    private int number;
    protected List<Integer> listNumber = new ArrayList<>();

    //Get and Set Declaration
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //Declare a list and receive the size by parameter.
    public List<Integer> createTable(int sizeList){
        for(int i = 1; i < sizeList; i++){
            listNumber.add(i); //The value "i" is added to the list.
        }
        return listNumber; //List return.
    }
}
