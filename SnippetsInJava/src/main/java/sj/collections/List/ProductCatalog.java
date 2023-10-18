package sj.collections.List;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sj.model.ClassSuper.Common;
import sj.model.SubClass.Product;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product_catalog")
@Entity
public class ProductCatalog extends Common {

    private static final long serialVersionUID = 1L;
    
    private List<Product> product;
    
    public Product search(String produto){
        
        Product result = null;
        
        for(Product objProduto: this.product){
            if(objProduto.getName().equals(produto)){
                
                result = objProduto;
                break;
            }
        }
        
        return result;
    }    
}
