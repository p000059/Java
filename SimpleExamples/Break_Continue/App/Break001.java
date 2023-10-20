package Break_Continue.App;

import java.util.Scanner;

public class Break001{
    public static void main(String args[]){
        
        try (Scanner sc = new Scanner(System.in)) {
			
        	int i = 0;
			
			System.out.println("Digite 7: ");
			i = sc.nextInt();
		}
        for(int j = 0; j < 50; j++){
            if(j % 7 == 0){                
                continue;
            }
            System.out.println("Valor: " + j);
        }
        
//         for(int j = 0; j < 30; j++){//Esse for vai parar de executar ao chegar em um número igual ao que foi inserido na variável i.
//             if(j == i){
//                 System.out.println("Numero " + i + " digitado.");
//                 break;
//             }
//             
//             System.out.println("Valor: " + j);
//         }
        
    }    
}
