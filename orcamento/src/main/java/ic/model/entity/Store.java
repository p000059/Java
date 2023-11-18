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
@Builder
@EqualsAndHashCode(callSuper = false)
@Table(name = "store")
@Entity
public class Store extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "phone", length = 11)
	private String phone;

}
