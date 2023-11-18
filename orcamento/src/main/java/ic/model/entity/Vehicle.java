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
@Table(name = "vehicle")
@Entity
public class Vehicle extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "manufacturer", length = 30)
	private String manufacturer;
	
	@Column(name = "car_license_plate", length = 7)
	private String carLicensePlate;
	
}
