package collections.reports.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import collections.models.subclass.entities.Product;
import collections.reports.interfaces.IReportProduct;

@RestController
@CrossOrigin(value = "*", maxAge = 3600)
@RequestMapping(value = "/report")
public class ReportProduct {

	@Autowired
	private IReportProduct iReportProduct;
	
	@GetMapping(value = "/products")
	public ResponseEntity<List<Product>> listProduct() {

		if(iReportProduct.listProduct() == null) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(iReportProduct.listProduct());
			
		} else {

			return ResponseEntity.status(HttpStatus.OK).body(iReportProduct.listProduct());
		}
	}

	@GetMapping(value = "/prefix")
	public ResponseEntity<List<Product>> productStartPrefix(@RequestParam(value = "letter", required = true) String prefix) {

		if(iReportProduct.productStartPrefixString(prefix) == null) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(iReportProduct.productStartPrefixString(null));
			
		} else {
			
			return ResponseEntity.status(HttpStatus.OK).body(iReportProduct.productStartPrefixString(prefix));
		}
	}
	
	@GetMapping(value = "/nameproduct")
	public ResponseEntity<List<Product>> searchProductForString(@RequestParam(value = "word", required = true) String word){
		
		if(iReportProduct.searchProductForString(word) == null) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(iReportProduct.searchProductForString(null));
			
		} else {
			
			return ResponseEntity.status(HttpStatus.OK).body(iReportProduct.searchProductForString(word));
		}		
	}
}
