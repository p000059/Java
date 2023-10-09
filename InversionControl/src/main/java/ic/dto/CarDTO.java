package ic.dto;

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

	private String name;
	
	private Tax tax;
	
	private Boolean status;
	
}
