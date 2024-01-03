package os;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import os.interfaces.repository.OSrepository;
import os.model.OS;

@SpringBootTest
public class OStest {

	@Autowired
	private OSrepository oSrepository;

	@Test
	public void testCode() {

		OS objectOS = this.oSrepository.findByCode("157OP78UJ5");

		System.out.println();
		System.out.println("id: " + objectOS.getId() + "\nCode: " + objectOS.getCode() + "\nType: " + objectOS.getType()
				+ "\nDescription: " + objectOS.getDescription() + "\nStatus: " + objectOS.getStatus());
		System.out.println();
	}
	
	@Test
	public void testeCode() {
		
		List<OS> listOS = this.oSrepository.findAllCode("1570");
		
		listOS.stream().forEach( x -> System.out.println("id: " + x.getId() + "\nCode: " + x.getCode() + "\nType: " + x.getType()
				+ "\nDescription: " + x.getDescription() + "\nStatus: " + x.getStatus()));
	}
}
