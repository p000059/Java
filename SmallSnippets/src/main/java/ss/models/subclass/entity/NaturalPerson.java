package ss.models.subclass.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ss.models.superclass.Person;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "natural_person")
@Entity
public class NaturalPerson extends Person {

	private static final long serialVersionUID = 1L;

	@Column(columnDefinition = "last_name", length = 150)
	private String lastName;
}
