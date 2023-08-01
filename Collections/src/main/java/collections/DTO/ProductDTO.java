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
public class ProductDTO {

	@Nonnull
	@NonNull
	private String code;
	
	@Nonnull
	@NonNull
	private String name;
	
	@Nonnull
	@NonNull
	private String description;
	
	@Nonnull
	@NonNull
	private String type;
	
	@Nonnull
	private boolean status;
}
