package ic.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ic.model.entity.CarFuel;
import ic.model.nullable.CarFuelNull;
import jakarta.transaction.Transactional;

public interface ICarFuelRepository extends JpaRepository<CarFuel, Long> {

	@Transactional
	@SuppressWarnings({"unchecked"})
	default <S extends CarFuel> S saveCarFuel(CarFuel carFuel) {
		
		return carFuel instanceof CarFuel ? (S) save(carFuel) : (S) new CarFuelNull();
	}
	
	
}
