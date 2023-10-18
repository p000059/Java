package sj.model.SubClass;

import sj.model.ClassSuper.Common;

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
@Table(name = "geometric_figures")
@Entity
public class GeometricFigures extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "sides")
	private int sides;
	
	@Column(name = "measurements")
	private double measurements;

	
	public double triangleCalculation(double base, double height) {
		return ((base * height) / 2);
	}

	public String checkPolygon() {

		if (this.sides == 3) {
			return "TRIANGLE";
		} else if (this.sides == 4) {
			return "SQUARE";
		} else if (this.sides == 5) {
			return "PENTAGON";
		} else if (this.sides < 3) {
			return "is not polygon";
		} else {
			return null;
		}
	}
}
