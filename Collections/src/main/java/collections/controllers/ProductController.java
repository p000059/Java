package collections.controllers;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import collections.DTO.ProductDTO;
import collections.models.subclass.entities.Product;
import collections.validations.interfaces.IProductValidation;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class ProductController {

	@Autowired
	private IProductValidation iProductValidation;
	
	@GetMapping(value = "/getproducts")
	public ResponseEntity<Page<Product>> readProduct(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable) {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.getValidateProduct(pageable));
	}
	
	@PostMapping(value = "/saveproduct")
	public ResponseEntity<Product> saveProduct(@RequestBody ProductDTO productDTO) {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.validateProduct(productDTO));
	}
	
	@PutMapping(value = "/updateproduct/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable(value = "id") Long id, @RequestBody ProductDTO productDTO){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.updateValidadeProduct(id, productDTO));
	}
	
	@DeleteMapping(value = "/deleteproduct/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable(value = "id") Long id, @RequestBody ProductDTO productDto){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.deleteValidadeProduct(id, productDto));
	}
}
