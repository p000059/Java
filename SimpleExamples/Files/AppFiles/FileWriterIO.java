package Files.AppFiles;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileWriterIO {

	public static void main(String[] args) {
		
		FileWriter myFileWriter;
		try {
			myFileWriter = new FileWriter("/home/marcelo/Files/PrimFile.java");
			
			myFileWriter.write("import javax.swing.JOptionPane;");
			myFileWriter.write("import java.util.*;");
			myFileWriter.close();
			
			JOptionPane.showMessageDialog(null, "Gravado para o arquivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
