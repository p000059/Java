package Persistence.Model.Class;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;

import jakarta.persistence.Column;
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
@Embeddable
public class Dates {

	@Column(name = "initial_dt")
	private LocalDateTime initial_date;
	
	@Column(name = "final_dt")
	private LocalDateTime final_date;
}
