package Class.SubClass;

import java.time.LocalDateTime;

public class LegalPerson extends Person {

	private String corporate_name;
	private String fictitious_name;
	private LocalDateTime dt_create;
	private LocalDateTime dt_final;
	
	public LegalPerson() {
		
	}

	public LegalPerson(String corporate_name, String fictitious_name, LocalDateTime dt_create, LocalDateTime dt_final) {
		
		this.corporate_name = corporate_name;
		this.fictitious_name = fictitious_name;
		this.dt_create = dt_create;
		this.dt_final = dt_final;
	}

	public String getCorporate_name() {
		return corporate_name;
	}

	public void setCorporate_name(String corporate_name) {
		this.corporate_name = corporate_name;
	}

	public String getFictitious_name() {
		return fictitious_name;
	}

	public void setFictitious_name(String fictitious_name) {
		this.fictitious_name = fictitious_name;
	}

	public LocalDateTime getDt_create() {
		return dt_create;
	}

	public void setDt_create(LocalDateTime dt_create) {
		this.dt_create = dt_create;
	}

	public LocalDateTime getDt_final() {
		return dt_final;
	}

	public void setDt_final(LocalDateTime dt_final) {
		this.dt_final = dt_final;
	}		
}
