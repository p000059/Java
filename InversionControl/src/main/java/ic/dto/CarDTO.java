package ic.dto;

import ic.model.Car;
import ic.model.Tax;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class CarDTO {

	private Car carDTO;
	
	//private Tax taxDTO;
}
