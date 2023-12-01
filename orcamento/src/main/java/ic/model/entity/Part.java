package ic.model.entity;

import ic.model.superclass.Common;

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
@Entity
@Table(name = "part")
public class Part extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "code", length = 20, nullable = false)
	private String code;
	
	@Column(name = "description", length = 300)
	private String description;
	
	@Column(name = "value")
	private Double value;

}
