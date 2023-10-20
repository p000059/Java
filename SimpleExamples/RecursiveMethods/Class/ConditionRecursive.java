package RecursiveMethods.Class;

public class ConditionRecursive {

    public static int sum(int start, int end) {
        
    	if (end > start) {
    		
            return end + sum(start, end - 1); //a condição de parada é quando a variável fim, não deve ser mair que o end.
            
        } else {
            
        	return end;
        }
    }
}
