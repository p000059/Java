package ic.model.dto;

import ic.model.entity.Tax;
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

	private Long id;
	
	private String name;
	
	private String carLicensePlate;
	
	private Tax tax;
	
	private Boolean status;
	
}
