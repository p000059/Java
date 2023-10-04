package ic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ic.model.CarFuels;

public interface ICarFuelRepository extends JpaRepository<CarFuels, Long> {

}
