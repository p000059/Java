package collections.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import collections.models.assotiations.DriverCar;

public interface DriverCarRepository extends JpaRepository<DriverCar, Long> {

}
