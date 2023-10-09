package ic.controllers.interfaces;

import org.springframework.http.ResponseEntity;

import ic.dto.TaxDTO;
import ic.model.Tax;

public interface ItaxController {

	ResponseEntity<Tax> insertTax(TaxDTO taxDTO);
}
