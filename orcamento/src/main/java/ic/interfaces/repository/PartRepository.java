package ic.interfaces.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import ic.model.entity.Part;
import jakarta.transaction.Transactional;

public interface PartRepository extends JpaRepository<Part, Long> {

	@Query(value = "select p from Part p where p.code = ?1")
	Part searchByCode(String code);
	
	@Query(value = "select p from Part p where p.name = ?1")
	Part searchByName(String name);
	
	@Query(value = "select p from Part p")
	List<Part> partsLists();
	
	@Query(value = "select p from Part p where upper(trim(p.name)) like %?1%")
	List<Part> searchByNameList(String name);
	
	@Modifying
	@Transactional(rollbackOn = SQLException.class)
	@Query(value = "update Part p set p.status = ?2 WHERE p.id = ?1")
	void deleteByCode(Long id, Boolean status);
}
