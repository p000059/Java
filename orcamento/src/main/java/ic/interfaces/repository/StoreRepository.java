package ic.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ic.model.entity.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {

}
