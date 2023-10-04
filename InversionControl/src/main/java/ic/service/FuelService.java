package ic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.model.Fuel;
import ic.model.nullable.FuelNull;
import ic.repositories.IFuelRepository;
import ic.service.interfaces.IfuelService;

@Service
public class FuelService implements IfuelService {

	@Autowired
	private IFuelRepository iFuelRepository;
	
	@Override
	public Fuel insert(Fuel fuel) {

		try {

			return this.iFuelRepository.saveFuel(fuel);

		} catch (Exception e) {

			return new FuelNull();

		}
	}

	@Override
	public Iterable<Fuel> getFuelByType(String type) {

	try {
			
			return this.iFuelRepository.findByType(type);
			
		} catch (Exception e) {

			return new ArrayList<Fuel>();
		}
	}

	@Override
	public List<Fuel> listFuel() {
		
		try {
			
			return this.iFuelRepository.findAll();
			
		} catch (Exception e) {
			
			return new ArrayList<Fuel>();
		}
		
	}

}
