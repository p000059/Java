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
@EqualsAndHashCode(callSuper = false)
@Builder
@Table(name = "document")
@Entity
public class Document extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "acronym")
	private String acronym;
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "date_emission")
	private LocalDateTime dateEmission;
	
	@Column(name = "date_validity")
	private LocalDateTime dateValidity;
}
