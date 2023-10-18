package sj.designpattern.buider;

import javax.swing.JOptionPane;

public class AppBuilder{
    
    public static void main(String[] args){

        ProductOne productOne = new ProductOne.Builder(1L)            
            .name("Rockport")
            .size("1.98")
            .build();
        
        JOptionPane.showMessageDialog(null, "Name: " + productOne.getName() + "\nSize: " + productOne.getSize());
    }
}