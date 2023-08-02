package collections.DTO;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class DriverCarDTO {

	@Nonnull
	@NonNull
	private CarDTO carDTO;
	
	@Nonnull
	@NonNull
	private DriverDTO driverDTO;
}
