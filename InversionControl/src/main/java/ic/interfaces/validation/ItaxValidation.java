package ic.interfaces.validation;

import java.util.List;

import ic.model.dto.TaxDTO;
import ic.model.entity.Tax;

public interface ItaxValidation {

	Tax insertion(TaxDTO taxDTO);
	
	List<Tax> insertions(List<TaxDTO> listTaxDTO);
	
	Tax read(TaxDTO taxDTO);
	
	Tax delete(TaxDTO taxDTO);
	
	Tax update(TaxDTO taxDTO);
}
