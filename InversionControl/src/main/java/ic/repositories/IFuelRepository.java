package ic.repositories;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ic.model.Fuel;
import ic.model.nullable.FuelNull;
import jakarta.transaction.Transactional;

public interface IFuelRepository extends JpaRepository<Fuel, Long> {

	Iterable<Fuel> findByType(String type);

	@Query(value = "SELECT p FROM Fuel p WHERE p.type like %?1%")
	List<Fuel> findTypeFuel(String type);

	@Query(value = "SELECT p FROM Fuel p WHERE p.type = :type")
	Fuel findTypeFuelParam(@Param("type") String type);

	@Transactional
	@SuppressWarnings("unchecked")
	default <S extends Fuel> S saveFuel(S entity) {

		return entity instanceof Fuel ? save(entity) : (S) new FuelNull();
	}
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class, dontRollbackOn = NullPointerException.class)
	@Query(value = "DELETE FROM Fuel u WHERE u.type = ?1")
	void deleteFuelByType(String type);
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class, dontRollbackOn = NullPointerException.class)
	@Query(value = "UPDATE Fuel u set u.type = ?2, u.status = ?3 WHERE u.id = ?1")
	Fuel updateFuelByName(Long id, String type, Boolean status);
}
