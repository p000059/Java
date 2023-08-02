package For.AppFor;

public class ForWithMultidimensionalArray{
	
	public static void main(String args[]){
		
		int linhas = 3;
		int colunas = 4;
		int table[][] = new int[linhas][colunas];
		
		for(int i = 0; i < linhas; i++){
			
			for(int j = 0; j < colunas; j++){
				
				table[i][j] = (i * 4) + j+1;
				System.out.print(table[i][j] + "   ");				
			}
			
			System.out.println();
		}
	}
}