package collections.reports.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import collections.models.subclass.entities.Product;
import collections.reports.interfaces.IReportProduct;
import collections.reports.repository.ReportProductRepository;

@Service
public class ReportProductServices implements IReportProduct {
	
	@Autowired
	private ReportProductRepository reportProductRepository;

	@Override
	public List<Product> listProduct() {

		try {

			return reportProductRepository.findAll();

		} catch (Exception e) {

			List<Product> lstProduct = null;

			return lstProduct;
		}
	}

	@Override
	public List<Product> productStartPrefixString(String prefix) {

		if (prefix.equals(null)) {

			List<Product> lstProduct = null;

			return lstProduct;

		} else {

			return reportProductRepository.findAll().stream().filter(p -> p.getCode().startsWith(prefix))
					.collect(Collectors.toList());
		}
	}

	@Override
	public List<Product> searchProductForString(String word) {

		if (word.equals(null)) {

			List<Product> listProduct = null;

			return listProduct;

		} else {

			return reportProductRepository.findAll().stream()
					.filter(p -> p.getName().toUpperCase().contains(word.toUpperCase())).collect(Collectors.toList());
		}
	}

	@Override
	public boolean searchProductCode(String word) {
		
		return reportProductRepository.existsByCode(word);
	}
}
