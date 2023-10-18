package sj.model.SubClass;

import sj.model.ClassSuper.Common;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
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
@EqualsAndHashCode(callSuper = false)
@Table(name = "legal_person")
@Entity
public class LegalPerson extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "corporate_name")
	private String corporateName;
	
	@Column(name = "fictitious_name")
	private String fictitiousName;
	
	@Column(name = "date_create")
	private LocalDateTime dateCreate;
	
	@Column(name = "date_final")
	private LocalDateTime dateFinal;
}
