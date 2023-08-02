package Class.SubClass;

import Class.ClassSuper.Common;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class Student extends Common {

	
}
