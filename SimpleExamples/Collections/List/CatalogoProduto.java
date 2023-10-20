package Collections.List;

import java.util.List;

import Class.SubClass.Produto;


public class CatalogoProduto<T> {

    private Long id;
    private List<Produto> produtoCatalogo;

    public CatalogoProduto() {
    }

    public CatalogoProduto(Long id, List<Produto> produtoCatalogo) {
        this.id = id;
        this.produtoCatalogo = produtoCatalogo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produto> getProdutoCatalogo() {
        return produtoCatalogo;
    }

    public void setProdutoCatalogo(List<Produto> produtoCatalogo) {
        this.produtoCatalogo = produtoCatalogo;
    }
    
    public Produto buscar(String produto){
        
        Produto resultadoProduto = null;
        
        for(Produto objProduto: this.produtoCatalogo){
            if(objProduto.getNmProduto().equals(produto)){
                
                resultadoProduto = objProduto;
                break;
            }
        }
        
        return resultadoProduto;
    }
    
}
