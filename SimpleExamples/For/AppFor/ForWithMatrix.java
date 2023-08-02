package For.AppFor;

public class ForWithMatrix {

	public static void main(String args[]) {

		int[][] table = { { 2, 3 }, { 4, 5 }, { 4, 8 } };
		int linha = 0;
		int coluna = 0;

		for (linha = 0; linha < table.length; linha++) {
			
			for (coluna = 0; coluna < table[coluna].length; coluna++) {
				
				System.out.print("[" + table[linha][coluna] + "]");
			}

			System.out.println();
		}
	}
}
