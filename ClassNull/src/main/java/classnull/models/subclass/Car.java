package classnull.models.subclass;

import classnull.models.superclass.Common;
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
@Table(name = "car")
@Entity
public class Car extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "value")
	private Double value;
	
	@Column(name = "size")
	private Integer size;
	
	@Column(name = "user")
	private String user;
}
