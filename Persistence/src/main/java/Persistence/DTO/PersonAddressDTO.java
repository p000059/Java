package Persistence.DTO;

import Persistence.models.entities.Address;
import Persistence.models.entities.Person;

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
public class PersonAddressDTO {

	@Nonnull
	private Person person;
	
	@Nonnull
	private Address address;
}
