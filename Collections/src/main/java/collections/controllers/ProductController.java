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

import collections.DTO.entities.ProductDTO;
import collections.controllers.interfaces.IProductController;
import collections.models.subclass.entities.Product;
import collections.validations.interfaces.IProductValidation;

@RequestMapping(value = "/products")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class ProductController implements IProductController {

	@Autowired
	private IProductValidation iProductValidation;
	
	@Override
	@GetMapping(value = "/getproducts")
	public ResponseEntity<Page<Product>> readProduct(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable) {
		
		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.getValidateProduct(pageable));			
			
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(Page.empty());
		}
	}
	
	@Override
	@PostMapping(value = "/saveproduct")
	@SuppressWarnings("static-access")
	public ResponseEntity<Product> saveProduct(@RequestBody ProductDTO productDTO) {
		
		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.validateProduct(productDTO));			
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Product().builder().code("invalid object").build());
		}
		
	}
	
	@Override
	@PutMapping(value = "/updateproduct/{id}")
	@SuppressWarnings("static-access")
	public ResponseEntity<Product> updateProduct(@PathVariable(value = "id") Long id, @RequestBody ProductDTO productDTO){
		
		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.updateValidadeProduct(id, productDTO));			
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Product().builder().code("invalid object").build());
		}
		
	}
	
	@Override
	@DeleteMapping(value = "/deleteproduct/{id}")
	@SuppressWarnings("static-access")
	public ResponseEntity<Product> deleteProduct(@PathVariable(value = "id") Long id, @RequestBody ProductDTO productDto){
		
		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iProductValidation.deleteValidadeProduct(id, productDto));			
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Product().builder().code("invalid object").build());
		}
	}


}
