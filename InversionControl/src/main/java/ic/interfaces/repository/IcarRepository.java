package ic.interfaces.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ic.model.entity.Car;
import ic.model.entity.Tax;
import ic.model.nullable.CarNull;
import jakarta.transaction.Transactional;

public interface IcarRepository extends JpaRepository<Car, Long> {

	Iterable<Car> findByName(String name);

	/* @Lock(LockModeType.READ) */
	@Query(value = "SELECT p FROM Car p WHERE p.name like %?1%")
	List<Car> findNameCar(String name);

	/* @Lock(LockModeType.READ) */
	@Query(value = "SELECT p FROM Car p WHERE p.name = :name")
	Car findNameCarParam(@Param("name") String name);

	@Transactional
	@SuppressWarnings("unchecked")
	default <S extends Car> S saveCar(S entity) {

		return entity instanceof Car ? save(entity) : (S) new CarNull();
	}
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class)
	@Query(value = "DELETE FROM Car u WHERE u.name = ?1")
	void deleteCarByName(String name);
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class)
	@Query(value = "UPDATE Car u SET u.status = ?2 WHERE u.id = ?1")
	void deleteCarById(Long id, Boolean status);
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class)
	@Query(value = "UPDATE Car u SET u.name = ?2 WHERE u.id = ?1")
	void updateCarByName(Long id, String name);
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class)
	@Query(value = "UPDATE Car u SET u.name = ?2, u.tax = ?3, u.status = ?4 WHERE u.id = ?1")
	void updateCar(Long id, String name, Tax tax, Boolean status); 
	
	@Query(value = "SELECT c FROM Car c")
	List<Car> listAllCars();
}
