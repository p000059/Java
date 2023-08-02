package Class.SubClass;

import Class.ClassSuper.Common;

public class Nationality extends Common {
	
	private String acronym;
	private String description;
	private States state;
	
	public Nationality() {
		
	}

	public Nationality(String acronym, String description, States state) {
		
		this.acronym = acronym;
		this.description = description;
		this.state = state;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public States getState() {
		return state;
	}

	public void setState(States state) {
		this.state = state;
	}
}
