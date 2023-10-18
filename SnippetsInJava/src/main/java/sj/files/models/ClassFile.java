package sj.files.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClassFile {
    
    private String file;
    private String contents;
    private File objFile;

    

    public void createFile(String file) {

        File myFile = new File(file);

        try {
            if (myFile.createNewFile()) {
                System.out.println("Arquivo: " + myFile.getName());
            } else {
                System.out.print("\nArquivo já existe!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fileWriter() {

        FileWriter myFileWriter;

        try {
            myFileWriter = new FileWriter(this.getFile());

            myFileWriter.write(this.contents);
            myFileWriter.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

        return "Successfuly Update";
    }

    public void readFile() {

        try {

            Scanner myScanner = new Scanner(this.getFile());

            while (myScanner.hasNextLine()) {

                String data = myScanner.nextLine();
                JOptionPane.showMessageDialog(null, data);

                myScanner.close();

            }

        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public void getFileInfo(File file) {

        if (file.exists()) {
            JOptionPane.showMessageDialog(null, "Nome: " + file.getName());
            JOptionPane.showMessageDialog(null, "Caminho: " + file.getAbsolutePath());
            JOptionPane.showMessageDialog(null, "Editável = " + file.canWrite());
            JOptionPane.showMessageDialog(null, "Leitura = " + file.canRead());
            JOptionPane.showMessageDialog(null, "Executável = " + file.canExecute());
            JOptionPane.showMessageDialog(null, "Tamanho: " + file.length());
        }
    }

    public String deleteFile(File file) {

        if (file.delete()) {
            return "Arquivo deletado";
        } else {
            return "Arquivo não encontrado";
        }
    }

}
