package os.interfaces.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import os.model.OS;

public interface OSrepository extends JpaRepository<OS, Long> {
	
	boolean existsByCode(String code);
	
	@Query(value = "select p from OS p where p.code = ?1")
	OS findByCode(String code);
	
	@Query(value = "select p from OS p where upper(trim(p.code)) like %?1%")
	List<OS> findAllCode(String code);
	
	@Transactional
	@Query(value = "DELETE FROM OS e WHERE e.code = ?1")
	void deleteByCode(String code);
	
}
