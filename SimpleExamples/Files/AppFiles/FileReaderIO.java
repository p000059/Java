package Files.AppFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileReaderIO {

	public static void main(String[] args) {

		try {

			File myFile = new File("/home/marcelo/Files/PrimFile.java");
			Scanner myScanner;
			myScanner = new Scanner(myFile);	

			while (myScanner.hasNextLine()) {

				String data = myScanner.nextLine();
				JOptionPane.showMessageDialog(null, data);

				myScanner.close();

			}

		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IllegalStateException e) {
			e.printStackTrace();
		}

	}

}
