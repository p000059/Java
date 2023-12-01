package ic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import ic.interfaces.repository.PartRepository;
import ic.model.entity.Part;

@SpringBootTest
@Service
class OrcamentoApplicationTests {

	@Autowired
	private PartRepository partRepository;
	
	private Part searchPart(Part part) {
		
		return this.partRepository.findById(8L).get();
	}
	
	@Test
	@SuppressWarnings("static-access")
	void contextLoads() {
		
		Part objectPart = new Part().builder().code("T564A238566AGO").description("Platô e disco de Embreagem").build();
		objectPart.setName("Embreage");
		objectPart.setValue(390.00);
		objectPart.setStatus(true);
		
		if(this.searchPart(objectPart).getCode().equals(objectPart.getCode())) {
			
			System.out.println("\n\n" + "already registered object code" + "\n\n");
		} else {
			
			this.partRepository.save(objectPart);
			
			System.out.println("\n\n");
			System.out.println(objectPart);
			System.out.println("\n\n");
		}
		
	}

}
