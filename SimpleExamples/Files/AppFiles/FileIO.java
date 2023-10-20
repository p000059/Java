package Files.AppFiles;

import java.io.File;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		
		File myFile = new File("/home/marcelo/Files/PrimFile.java");
		
		
		try {
			if(myFile.createNewFile()) {
				System.out.println("Arquivo: " + myFile.getName());
			}
			else {
				System.out.print("\nArquivo já existe!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
