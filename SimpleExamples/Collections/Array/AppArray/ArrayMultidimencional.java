package Collections.Array.AppArray;

public class ArrayMultidimencional {

    public static void main(String[] args) {

        final int size = 4;
        int[][][][] arrayForDim = new int[size][size][size][size];

        for(int i = 0; i < arrayForDim.length; i++){
            System.out.println();
            for(int j = 0; j < arrayForDim[i].length; j++){
                for(int k = 0; k < arrayForDim[j].length; k++){
                    for(int l = 0; l < arrayForDim[k].length; l++){
                        arrayForDim[i][j][k][l] = i + j + k + l; //Essa linha vai adicionar o valor de cada variável do loop na posição. Pode-se executar qualquer operação que retorne um tipo inteiro como nos outros arrays uni ou multidimencional.
                    }
                }
            }
        }

        for(int i = 0; i < arrayForDim.length; i++){
            System.out.println();
            System.out.println();
            for(int j = 0; j < arrayForDim[i].length; j++){
                System.out.println();
                for(int k = 0; k < arrayForDim[j].length; k++){
                    for(int l = 0; l < arrayForDim[k].length; l++){
                        System.out.print("\nArray[" + i + "][" + j + "][" + k + "][" + l + "] = " + arrayForDim[i][j][k][l]);
                    }
                }
            }
        }

    }
}
