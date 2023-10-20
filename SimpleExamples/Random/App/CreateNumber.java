package Random.App;

import java.util.Random;

public class CreateNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int numeroInteiro = random.nextInt(10); //Limits up to 10.
        double numeroReal = random.nextDouble() * 10; 

        System.out.println("Numero: " + numeroInteiro);
        System.out.printf("Numero: %.2f", numeroReal); 
    }
}
