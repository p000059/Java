package Persistence.Model.Class;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PersonName implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "first_name")
	@Size(min = 10, max = 30)
	@NotNull(message = "It cannot be null.")
	@EqualsAndHashCode.Include
	private String firstName;

	@Column(name = "last_name")
	@Size(min = 20, max = 100)
	@NotNull(message = "It cannot be null.")
	@EqualsAndHashCode.Include
	private String lastName;
}
