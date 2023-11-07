package ic.model.entity;

import java.io.Serializable;

import ic.model.embeddables.CarFuelFK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car_fuels")
public class CarFuel implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CarFuelFK carFuelFK;
}
