package Class.SubClass;

import Class.ClassSuper.Common;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
public class Fone extends Common{

	private String number;
	private String ddi;
	private String ddd;
}
