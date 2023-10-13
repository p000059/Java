package ic.interfaces.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ic.model.entity.Tax;
import ic.model.nullable.TaxNull;

import jakarta.transaction.Transactional;

public interface ItaxRepository extends JpaRepository<Tax, Long> {

	Iterable<Tax> findByTax(Double tax);
	
	@Query(value = "SELECT p FROM Tax p WHERE p.type like %?1%")
	List<Tax> findTypeTax(String type);
	
	@Query(value = "SELECT p FROM Tax p WHERE p.tax = :tax")
	Tax findTypeTaxParam(@Param("tax") String tax);
	
	@Transactional
	@SuppressWarnings("unchecked")
	default <S extends Tax> S saveTax(S entity) {

		return entity instanceof Tax ? save(entity) : (S) new TaxNull();
	}
	
	/*
	 * @Query(value = "DELETE FROM Tax u WHERE u.type = ?1") void
	 * deleteTaxByType(String type);
	 */
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class, dontRollbackOn = NullPointerException.class)
	@Query("DELETE FROM Tax u WHERE u.type = :type")
	void deleteTaxByType(@Param("type") String type);
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class, dontRollbackOn = NullPointerException.class)
	@Query(value = "UPDATE Tax u set u.type = ?2, u.tax = ?3, u.status = ?4 WHERE u.id = ?1")
	Tax updateTaxById(Long id, String type, Double tax, Boolean status);
}
