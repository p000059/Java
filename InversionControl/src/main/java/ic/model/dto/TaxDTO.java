package ic.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaxDTO {

	private Long id;
	
	private String type;
	
	private String model;
	
	private String code;
	
	private String manufacturer;
	
	private Double tax;
	
	private Boolean status;
}
