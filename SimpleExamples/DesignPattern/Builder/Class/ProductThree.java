package DesignPattern.Builder.Class;

import javax.annotation.Nonnull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Builder
@Entity
@Table(name = "product")
public class ProductThree {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotNull
	@Column(length = 60, nullable = false)
	private String name;
	
	@NotNull
	@Column(length = 255, nullable = false)
	private String description;
	
	@NotNull
	@Column(nullable = false)
	private Double value;
	
	@NotNull
	@Column(nullable = true)
	private String color;
	
	@NotNull
	@Column(nullable = false)
	private String size;
}
