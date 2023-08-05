package collections.models.subclass.entities;

import collections.models.superclass.Common;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "car")
@Entity
public class Car extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "car", length = 50)
	private String car;
}
