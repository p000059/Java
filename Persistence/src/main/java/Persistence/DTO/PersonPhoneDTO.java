package Persistence.DTO;

import Persistence.models.entities.Person;
import Persistence.models.entities.Phone;

import jakarta.annotation.Nonnull;

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
public class PersonPhoneDTO {

	@Nonnull
	private Person person;
	
	@Nonnull
	private Phone phone;
}
