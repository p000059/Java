package Class.SubClass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Mass {

	private Double kilogram;
	private Double height;
	
	public Double calculateBMI() {

		return this.getKilogram() / (this.getHeight() * this.getHeight());
	}
}
