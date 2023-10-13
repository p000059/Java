package ic.interfaces.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ic.model.entity.Car;
import ic.model.nullable.CarNull;
import jakarta.persistence.LockModeType;
import jakarta.transaction.Transactional;

public interface IcarRepository extends JpaRepository<Car, Long> {

	Iterable<Car> findByName(String name);

	@Lock(LockModeType.READ)
	@Query(value = "SELECT p FROM Car p WHERE p.name like %?1%")
	List<Car> findNameCar(String name);

	@Lock(LockModeType.READ)
	@Query(value = "SELECT p FROM Car p WHERE p.name = :name")
	Car findNameCarParam(@Param("name") String name);

	@Transactional
	@SuppressWarnings("unchecked")
	default <S extends Car> S saveCar(S entity) {

		return entity instanceof Car ? save(entity) : (S) new CarNull();
	}
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class, dontRollbackOn = NullPointerException.class)
	@Query(value = "DELETE FROM Car u WHERE u.name = ?1")
	void deleteCarByName(String name);
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class, dontRollbackOn = NullPointerException.class)
	@Query(value = "DELETE FROM Car u WHERE u.id = ?1")
	void deleteCarById(Long id);
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class, dontRollbackOn = NullPointerException.class)
	@Query(value = "UPDATE Car u set u.name = ?2 WHERE u.id = ?1")
	Car updateCarByName(Long id, String name);
	
	@Query(value = "SELECT c FROM Car c")
	List<Car> listAllCars();
}
