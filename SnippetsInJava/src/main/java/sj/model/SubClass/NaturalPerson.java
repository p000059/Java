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
@Table(name = "natural_person")
@Entity
public class NaturalPerson extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "date_birth")
	private LocalDateTime dateBirth;
}
