package ic.model.embeddables;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Embeddable
public class CarFuelFK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "car_id")
	private Long carId;
	
	@Column(name = "fuel_id")
	private Long fuelId;
}
