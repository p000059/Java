package ic.model.nullable;

import ic.model.entity.CarFuel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)

public class CarFuelNull extends CarFuel {

	private static final long serialVersionUID = 1L;

	private Exception message;
	private Long id;

	public static class Builder {

		private Long id;
		private Exception message;

		public Builder() {
		}

		public Builder withMessage(Exception message) {
			this.message = message;
			return this;
		}

		public Builder withId(Long id) {
			this.id = id;
			return this;
		}

		public CarFuelNull build() {
			return new CarFuelNull(this);
		}
	}

	private CarFuelNull(Builder builder) {
		this.message = builder.message;
		this.id = builder.id;
	}

}
