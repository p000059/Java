package Class.SubClass;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class Produto {
 
    public enum Status{
        ATIVO,INATIVO
    }
    
    private String nmProduto;
    private Status status;
    private BigDecimal preco;
    private Category categoria;
    
    public Produto() {
    }

    public Produto(String nmProduto, Status status, BigDecimal preco) {
        this.nmProduto = nmProduto;
        this.status = status;
        this.preco = preco;
    }
    
    public Produto(String nmProduto, Status status, BigDecimal preco, Category categoria) {
        this.nmProduto = nmProduto;
        this.status = status;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Category getCategoria() {
        return categoria;
    }

    public void setCategoria(Category categoria) {
        this.categoria = categoria;
    }
    
    public void inativar(){
        
        JOptionPane.showMessageDialog(null,"Inativando "+ this.getNmProduto());
        this.status = Status.INATIVO;
    }
}
