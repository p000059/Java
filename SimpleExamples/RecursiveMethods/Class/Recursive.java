package RecursiveMethods.Class;

public class Recursive {

    public static int sum(int k){

        if(k > 0){
            //o parâmetro k é somando a função sum, ou seja por ela mesma, mas sempre com o parâmetro com -1 até chegar ao 1.
            return k + sum(k -1);//A soma será: 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 55 ; após isso o método será finalizado.
            
        } else {
            
        	return 0;
        }
    }
}
