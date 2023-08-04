package collections.models.interfaces.validations;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.DTO.DriverDTO;
import collections.models.subclass.entities.Driver;

public interface IDriverValidation {

	Driver validateDriver(DriverDTO driverDTO);

	List<Driver> getValidateDriver();

	Page<Driver> getValidateDriver(Pageable pageable);

	Driver getValidateDriver(Long id);

	Driver updateValidadeDriver(Long id, DriverDTO driverDTO);

	Driver deleteValidadeDriver(Long id);
}
