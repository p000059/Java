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
public class Triangle {

	private Long id;
	private int angleOne;
	private int angleTwo;
	private int angleThree;
	private int sideOne;
	private int sideTwo;
	private int sideThree;
}
