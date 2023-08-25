package collections.DTO;

import collections.models.subclass.entities.Car;
import collections.models.subclass.entities.Driver;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class DriverCarDTO {

	private Driver driver;
	
	private Car car;
}
