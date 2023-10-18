package sj.collections.List;

import sj.model.SubClass.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductCatolg {

	public Product buscar(String produto) {

		Product resultadoProduto = null;
		ProductCatalog productCatalog = new ProductCatalog();

		for (Product objProduto : productCatalog.getProduct()) {
			if (objProduto.getName().equals(produto)) {

				resultadoProduto = objProduto;
				break;
			}
		}

		return resultadoProduto;
	}
}
