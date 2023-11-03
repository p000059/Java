package ic.validation;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.service.ItaxService;
import ic.interfaces.validation.ItaxValidation;
import ic.model.dto.TaxDTO;
import ic.model.entity.Tax;
import ic.model.nullable.TaxNull;

@Service
public class ValidationTax implements ItaxValidation {

	@Autowired
	private ItaxService itaxService;

	@SuppressWarnings("static-access")
	private Tax exceptionMessage(Exception exception) {

		if (exception instanceof Exception) {

			return new TaxNull().builder().type("Error: Verify Object").build();

		} else if (exception instanceof IllegalArgumentException) {

			return new TaxNull().builder().type("illegal argument").build();

		} else if (exception instanceof NullPointerException) {

			return new TaxNull().builder().type("null pointer exception").build();

		} else {

			return new TaxNull();
		}
	}

	@SuppressWarnings({ })
	private Boolean checkRegisteredObject(Tax objectTax) {

		// return this.itaxService.listTax().stream().equals(objectTax) ? true : false;
		return this.itaxService.listTax().stream()
				.anyMatch(object -> (object.getCode().equalsIgnoreCase(objectTax.getCode()))) ? true : false;
	}

	private Tax convertDTO(TaxDTO taxDTO) {

		Tax objectTax = new Tax();

		BeanUtils.copyProperties(taxDTO, objectTax);

		return objectTax;
	}

	@Override
	@SuppressWarnings({ "static-access" })
	public Tax insertion(TaxDTO taxDTO) {

		try {

			return this.checkRegisteredObject(this.convertDTO(taxDTO)) != true
					? this.itaxService.insert(this.convertDTO(taxDTO))
					: new Tax().builder().type("object already registered").build();

		} catch (Exception e) {

			return this.exceptionMessage(e);
		}

	}

	@Override
	public List<Tax> insertions(List<TaxDTO> listTaxDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tax read(TaxDTO taxDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tax delete(TaxDTO taxDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tax update(TaxDTO taxDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
