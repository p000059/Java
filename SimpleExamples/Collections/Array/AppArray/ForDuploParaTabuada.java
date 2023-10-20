package Collections.Array.AppArray;

public class ForDuploParaTabuada {

    public static void main(String[] args) {

        final int SIZE = 11;
        int[] arrayDezena = new int[SIZE];
        int[] arrayUnidade = new int[SIZE];


        for (int i = 1; i < arrayDezena.length; i++){
            for(int j = 1; j < arrayUnidade.length; j++){
                arrayDezena[i] = arrayDezena[i] + 1; //Essa linha também poderia ser: " arrayDezena[i] += 1; " ou também " arrayDezena[i]++; ) "
                arrayUnidade[j]++;
                System.out.print("\n" + arrayUnidade[j] + " x " + arrayDezena[i] + " = " + arrayDezena[i] * arrayUnidade[j]);
            }
            System.out.println();
        }
    }
}
