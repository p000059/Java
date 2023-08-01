package collections.models.embedabble;

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
public class DriverCarListFK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "driver_id")
	private Long personID;
	
	@Column(name = "car_list_id")
	private Long carListID;
}
