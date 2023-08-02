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
@Table(name = "product")
@Entity
public class Product extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "code", length = 7)
	private String code;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "description", length = 300)
	private String description;
	
	@Column(name = "type", length = 50)
	private String type;
}
