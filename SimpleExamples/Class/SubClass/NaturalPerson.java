package Class.SubClass;

import java.time.LocalDateTime;

import Class.ClassSuper.Common;

public class NaturalPerson extends Common {

	private LocalDateTime dt_birth;
	private LocalDateTime dt_death;
	
	public NaturalPerson() {
		
	}

	public NaturalPerson(LocalDateTime dt_birth, LocalDateTime dt_death) {

		this.dt_birth = dt_birth;
		this.dt_death = dt_death;
	}

	public LocalDateTime getDt_birth() {
		return dt_birth;
	}

	public void setDt_birth(LocalDateTime dt_birth) {
		this.dt_birth = dt_birth;
	}

	public LocalDateTime getDt_death() {
		return dt_death;
	}

	public void setDt_death(LocalDateTime dt_death) {
		this.dt_death = dt_death;
	}
}
