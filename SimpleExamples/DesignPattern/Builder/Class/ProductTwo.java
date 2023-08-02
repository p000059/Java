package DesignPattern.Builder.Class;

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
public class ProductTwo {

	@EqualsAndHashCode.Include
	private Long id;
	
	private String name;
	private String description;
	private Double value;
	private String color;
	private String size;
}
