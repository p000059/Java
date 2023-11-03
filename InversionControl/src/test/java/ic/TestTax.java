package ic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.validation.ItaxValidation;
import ic.model.dto.TaxDTO;
import lombok.Data;

@Service
@Data
public class TestTax {

	@Autowired
	private ItaxValidation itaxValidation;
	
	public TestTax() {
		
	};
	
	public TestTax(ItaxValidation itaxValidation) {
		
		this.itaxValidation = itaxValidation;
	}
	
	@Test
	public void testInsertTax() {

		TaxDTO objectTax = new TaxDTO();

		objectTax.setType("Pump Pressure");
		objectTax.setModel("JP4T-7Y");
		objectTax.setManufacturer("Bosch");
		objectTax.setTax(4.5);
		objectTax.setStatus(true);

		this.itaxValidation.insertion(objectTax);
	}





}
