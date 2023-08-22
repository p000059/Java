package Persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Persistence.models.entities.Address;


public interface AddressRepository extends JpaRepository<Address, Long> {

	boolean existsByAddress(String address);
	
	boolean existsByAddress(Address address);
	
	/**
	 * Query object by "id".
	 * 
	 * @param id must not be {@literal null}
	 * @return Returns an Address object.
	 */
	@Query("SELECT a FROM Address a WHERE a.id = :id")
	Address queryAddressById(@Param("id") Long id);
	
	
	/**
	 * Query object by "address".
	 * 
	 * @param address must not be {@literal null}
	 * @return Returns an Address object.
	 */
	@Query("SELECT p FROM Address p WHERE p.address = :address")
	Address queryAddressByName(@Param("address") String address);
	
	
	/**
	 * Query object by "status".
	 * 
	 * @param status must not be {@literal null}
	 * @return Returns an Address object.
	 */
	@Query("SELECT a FROM Address a WHERE a.status = :status")
	Address queryAddressByStatus(@Param("status") boolean status);
	
	
	/**
	 * Query by "id", "address" and "status".
	 * 
	 * @param id must not be {@literal null}
	 * @param address must not be {@literal null}
	 * @param status must not be {@literal null}
	 * @return Returns an Address object.
	 */
	@Query("SELECT a FROM Address a WHERE a.id = :id AND a.address = :address AND a.status = :status")
	Address queryAddressByIdNameStatus(@Param("id") Long id, @Param("address") String address, @Param("status") Boolean status);
}
