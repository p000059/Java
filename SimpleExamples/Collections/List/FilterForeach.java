package Collections.List;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Class.SubClass.Product;

public class FilterForeach {

    public static void main(String[] args) {

        List<Product> lstProduct = new ArrayList<>();
        
        Product objOneProduct = new Product();
        Product objTwoProduct = new Product();
        
        objOneProduct.setId(1L);
        objOneProduct.setCode("a000001");
        objOneProduct.setName("Agua em Galao");
        objOneProduct.setDescription("Água conservada em embalagem.");
        objOneProduct.setType("Galão de 5 litros");
        objOneProduct.setStatus(true);
        
        objTwoProduct.setId(2L);
        objTwoProduct.setCode("a000002");
        objTwoProduct.setName("Agua em Garrafa");
        objTwoProduct.setDescription("Agua conservada em embalagem.");
        objTwoProduct.setType("Garrafa de 1 litro");
        objTwoProduct.setStatus(true);
        
        lstProduct.add(objOneProduct);
        lstProduct.add(objTwoProduct);

         lstProduct.stream()
                .filter(p -> p.getName().startsWith("A"))
                .forEach(p -> JOptionPane.showMessageDialog(null, "Code: " + p.getCode() + "\nName: " + p.getName()));
    }
}
