package ic.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class PartDTO {

	private Long id;
	private String code;
	private String name;
	private String description;
	private Double value;
	private Boolean status;
}
