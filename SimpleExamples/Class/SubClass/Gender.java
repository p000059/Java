package Class.SubClass;

import Class.ClassSuper.Common;

public class Gender extends Common {

	private String acronym;

	public Gender() {
		super();
	}

	public Gender(String acronym) {
		super();
		this.acronym = acronym;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
}
