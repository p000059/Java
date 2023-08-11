package Persistence.models.Embbedable;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class PersonAddressFK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "person_id")
	private Long personId;
	
	@Column(name = "address_id")
	private Long addressId;
}
