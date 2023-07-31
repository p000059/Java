package ss.models.subclass.entity;

import jakarta.persistence.Column;
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
@Table(name = "legal_person")
public class LegalPerson extends Person {

	private static final long serialVersionUID = 1L;

	@Column(columnDefinition = "corporate_name", length = 200, nullable = false)
	private String corporateName;
}
