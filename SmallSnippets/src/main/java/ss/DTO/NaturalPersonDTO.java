package ss.DTO;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NaturalPersonDTO {

	@Nonnull
	private String name;
	
	@Nonnull
	private String lastName;
	
	@Nonnull
	private boolean status;
}
