package collections.models.assotiations;

import java.io.Serializable;

import collections.models.embedabble.DriverCarListFK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@Table(name = "driver_car_list")
@Entity
public class DriverCarList implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DriverCarListFK driverCarListFK;
}