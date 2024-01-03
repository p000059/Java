package os;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import os.interfaces.repository.OSrepository;
import os.model.OS;

@SpringBootTest
public class TestList {

	@Autowired
	private OSrepository oSrepository;
	
	@Test
	public void testeCode() {
		
		List<OS> listOS = this.oSrepository.findAllCode("1570");
		
		listOS.forEach(System.out::println);
	}
}
