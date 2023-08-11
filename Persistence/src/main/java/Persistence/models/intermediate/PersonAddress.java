package Persistence.models.intermediate;

import java.io.Serializable;

import Persistence.models.Embbedable.PersonAddressFK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "person_address")
@Entity
public class PersonAddress implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PersonAddressFK personAddressFK;
}
