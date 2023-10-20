package Class.SubClass;
import java.time.LocalDateTime;

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
public class Document extends Common {

	private String acronym;
	private String number;
	private LocalDateTime dt_emission;
	private LocalDateTime dt_validity;
}
