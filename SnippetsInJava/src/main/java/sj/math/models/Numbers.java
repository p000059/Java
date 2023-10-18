package sj.math.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sj.model.ClassSuper.Common;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
@Table(name = "numbers")
@Entity
public class Numbers extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "numbers")
	private Integer number;
	
}
