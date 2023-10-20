package For.AppFor;

public class TableWithoutMatrix {

    public static void main(String[] args) {

        final int size = 11;

        for (int i = 1; i < size; i++){
            
        	for(int j = 1; j < size; j++){
                
        		System.out.print("\n" + i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
