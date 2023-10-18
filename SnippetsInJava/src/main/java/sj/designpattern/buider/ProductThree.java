package sj.designpattern.buider;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sj.model.ClassSuper.Common;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class ProductThree extends Common {

	private static final long serialVersionUID = 1L;

	@Nonnull
	@Column(length = 60, nullable = false)
	private String name;
	
	@Nonnull
	@Column(length = 255, nullable = false)
	private String description;
	
	@Nonnull
	@Column(nullable = false)
	private Double value;
	
	@Nonnull
	@Column(nullable = true)
	private String color;
	
	@Nonnull
	@Column(nullable = false)
	private String size;
}
