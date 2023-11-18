package ic.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ic.model.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
