package ic.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.model.Tax;
import ic.model.nullable.TaxNull;
import ic.repositories.ItaxRepository;
import ic.service.interfaces.ItaxService;

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

}
