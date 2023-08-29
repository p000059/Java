package collections.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import collections.models.subclass.entities.Product;
import collections.services.interfaces.IProductService;

@Service
class ProductServiceTest {

	@Autowired
	private IProductService iProductService;
	
	@SuppressWarnings("static-access")
	@Test
	void testSave() {
		
		Product objectProduct = new Product().builder().code("0001").description("School").name("pen").type("office").build();
		
		System.out.println(iProductService.save(objectProduct));
		
	}

}
