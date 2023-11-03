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

	@Query(value = "SELECT p FROM Tax p WHERE p.type = ?1")
	Tax findTaxType(String type);
	
	@Query(value = "SELECT p FROM Tax p WHERE p.tax = ?1")
	Tax findTax(Double tax);
	
	@Transactional
	@SuppressWarnings("unchecked")
	default <S extends Tax> S saveTax(S entity) {

		return entity instanceof Tax ? save(entity) : (S) new TaxNull();
	}

	@Modifying
	@Transactional(rollbackOn = SQLException.class, dontRollbackOn = NullPointerException.class)
	@Query(value = "UPDATE Tax p SET p.status = ?2 WHERE p.id = ?1")
	void deleteTaxById(Long id, Boolean status);

	@Modifying
	@Transactional(rollbackOn = SQLException.class, dontRollbackOn = NullPointerException.class)
	@Query("UPDATE Tax u SET u.status = ?2 WHERE u.type = ?1")
	Tax deleteTaxByType(String type, Boolean status);

	@Modifying
	@Transactional(rollbackOn = SQLException.class, dontRollbackOn = NullPointerException.class)
	@Query(value = "UPDATE Tax u set u.type = ?2, u.tax = ?3, u.status = ?4 WHERE u.id = ?1")
	Integer updateTaxById(Long id, String type, Double tax, Boolean status);
}
