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
@Table(name = "mass")
@Entity
public class Mass extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "kilogram")
	private Double kilogram;
	
	@Column(name = "height")
	private Double height;
	
	public Double calculateBMI() {

		return this.getKilogram() / (this.getHeight() * this.getHeight());
	}
}
