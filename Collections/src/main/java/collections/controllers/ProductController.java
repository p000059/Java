package collections.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import collections.DTO.ProductDTO;
import collections.models.interfaces.validations.IProductValidation;
import collections.models.subclass.entities.Product;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class ProductController {

	@Autowired
	private IProductValidation iProductValidation;
		
	@PostMapping(value = "/saveproduct")
	public ResponseEntity<Product> createProduct(@RequestBody ProductDTO ProductDTO) {

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.validateProduct(ProductDTO));
	}

	@GetMapping(value = "/product")
	public ResponseEntity<Product> getProduct(@RequestParam(value = "id", required = true) Long id) {

		return ResponseEntity.status(HttpStatus.FOUND).body(iProductValidation.getValidateProduct(id));
	}

	@GetMapping(value = "/products")
	public ResponseEntity<List<Product>> getProducts() {

		return ResponseEntity.status(HttpStatus.FOUND).body(iProductValidation.getValidateProduct());
	}

	@GetMapping(value = "/productspagination")
	public ResponseEntity<Page<Product>> getProducts(
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable) {

		return ResponseEntity.status(HttpStatus.FOUND).body(iProductValidation.getValidateProduct(pageable));
	}
	
	@PutMapping(value = "/updateproduct")
	public ResponseEntity<Product> updateProduct(@RequestParam(value = "id", required = true) Long id, @RequestBody ProductDTO ProductDTO){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.updateValidadeProduct(id, ProductDTO));
	}
	
	@DeleteMapping(value = "/deleteproduct")
	public ResponseEntity<Product> deleteProduct(@RequestParam(value = "id", required = true) Long id){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.deleteValidadeProduct(id));
	}
}
