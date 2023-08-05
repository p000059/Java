package collections.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import collections.models.assotiations.DriverCar;
import collections.models.embedabble.DriverCarFK;

public interface DriverCarRepository extends JpaRepository<DriverCar, DriverCarFK> {

}
