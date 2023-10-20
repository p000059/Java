package Math.AppMath;
import javax.swing.JOptionPane;

public class NumberFactorial {

    //Variable Declaration
    private int number;

    //Get and Set Method
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public int numberFactor(int factorialNumber){

        int factorial = 1;
        
        for(
        	int i = 1; //1st - For loop instruction. The value "i" will be one is the end of a factorial number.
        	i <= factorialNumber; // 2nd - For loop instruction. The condition states that "i" equal to "factorialNumber" will be the value for the loop to stop.   
        	i++ //3rd - For loop instruction. With each loop the "i" will get closer until reaching the value of "factorialNumber".
        ){
        	//Example.: 3! = 3 . 2 . 1 = 6
            factorial = factorial * i; 
        }

        return factorial; //Return factorial number;
    }
    
    public static void main(String[] args) {
		
    	NumberFactorial numberFactorial = new NumberFactorial();
    	
    	int number = numberFactorial.numberFactor(3);
    	
    	JOptionPane.showMessageDialog(null, "Factorial Numbers: " + number);
	}
}
