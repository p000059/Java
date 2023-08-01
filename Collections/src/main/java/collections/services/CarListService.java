package collections.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import collections.models.interfaces.services.ICarListService;
import collections.models.subclass.entities.CarList;
import collections.repository.CarListRepository;

@Service
@Primary
public class CarListService implements ICarListService {

	@Autowired
	private CarListRepository carListRepository;
	
	@Override
	public CarList save(CarList carList) {
		
		return this.carListRepository.save(carList);
	}
	
	@Override
	public List<CarList> getCarLists() {
		
		return this.carListRepository.findAll();
	}

	@Override
	public Page<CarList> getCarLists(Pageable pageable) {
		
		return this.carListRepository.findAll(pageable);
	}

	@Override
	public CarList updateCarList(CarList carList) {
		
		return this.carListRepository.saveAndFlush(carList);
	}

	@Override
	public Optional<CarList> findId(Long id) {
		
		return this.carListRepository.findById(id);
	}

	@Override
	public boolean verifyCarList(String carList) {
		
		return carListRepository.existsByCar(carList);
	}

	@Override
	public void deleteCarList(Long id) {
		
		carListRepository.deleteById(id);
	}
}
