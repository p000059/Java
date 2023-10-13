package ic.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ic.model.entity.CarFuels;

public interface ICarFuelRepository extends JpaRepository<CarFuels, Long> {

}
