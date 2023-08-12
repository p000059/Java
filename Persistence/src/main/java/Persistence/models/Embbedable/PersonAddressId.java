package Persistence.models.Embbedable;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonAddressId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long personId;
	
	private Long addressId;
}
