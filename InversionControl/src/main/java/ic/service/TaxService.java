package ic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.repository.ItaxRepository;
import ic.interfaces.service.ItaxService;
import ic.model.entity.Tax;
import ic.model.nullable.TaxNull;

@Service
public class TaxService implements ItaxService {

	@Autowired
	private ItaxRepository itaxRepository;

	@Override
	public Tax insert(Tax car) {

		try {

			return this.itaxRepository.saveTax(car);

		} catch (NullPointerException e) {

			return new TaxNull();

		} catch (IllegalArgumentException e) {

			return new TaxNull();
		}
	}

	@Override
	public Iterable<Tax> getTaxByType(String type) {

		try {

			return this.itaxRepository.findTypeTax(type);

		} catch (Exception e) {

			return new ArrayList<Tax>();
		}
	}

	@Override
	public List<Tax> listTax() {

		try {

			return this.itaxRepository.findAll();

		} catch (NullPointerException e) {

			return new ArrayList<Tax>();

		} catch (IllegalArgumentException e) {

			return new ArrayList<Tax>();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Tax updateTax(Tax tax) {

		try {

			Tax objectTax = this.itaxRepository.findById(tax.getId()).get();

			if (tax instanceof Tax && objectTax.getId() == tax.getId()) {

				return this.itaxRepository.updateTaxById(objectTax.getId(), objectTax.getType(), objectTax.getTax(),
						objectTax.getStatus());

			} else {

				return new TaxNull();
			}

		} catch (IllegalArgumentException e) {

			return new TaxNull().builder().type("object invalid").build();

		} catch (NullPointerException e) {

			return new TaxNull().builder().type("object invalid").build();
		}
	}

	@SuppressWarnings("static-access")
	@Override
	public Tax deleteTax(Tax tax) {

		try {

			Tax objectTax = this.itaxRepository.findById(tax.getId()).get();

			if (tax instanceof Tax && objectTax.getId() == tax.getId()) {

				this.itaxRepository.deleteTaxByType(tax.getType());
				
				return objectTax;

			} else {

				return new TaxNull();
			}

		} catch (IllegalArgumentException e) {

			return new TaxNull().builder().type("object invalid").build();

		} catch (NullPointerException e) {

			return new TaxNull().builder().type("object invalid").build();
		}
	}

}
