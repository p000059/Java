package collections.reports.interfaces;

import java.util.List;

import collections.models.subclass.entities.Product;

public interface IReportProduct {

	List<Product> listProduct();

	List<Product> productStartPrefixString(String prefix);

	List<Product> searchProductForString(String word);
	
	boolean searchProductCode(String word);
}
