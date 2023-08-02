//Metodo recursivo que vai receber um parâmetro e retornar o menor valor decrementado até o limite > 0, ou seja, um.

package RecursiveMethods.Class;

public class Sum {

    public static int numberSum(int x){
        if(x > 0){
            return x + numberSum(x - 1); //Aqui acontece a "mágica do decremento, por uma chamada do método dentro dele mesmo.
            //A cada chamada do método, o parametro é subtraído por -1 até se chegar ao 1, onde o método é finalizado.
        }
        else {
            return 0;
        }
    }
}
