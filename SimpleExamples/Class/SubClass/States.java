package Class.SubClass;

import java.util.Objects;

import Class.ClassSuper.Common;

public class States extends Common{
	
	private String acronym;
	
	public States() {
		
	}
	
	public States(String acronym) {
		
		this.acronym = acronym;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	@Override
	public int hashCode() {
		return Objects.hash(acronym);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		States other = (States) obj;
		return Objects.equals(acronym, other.acronym);
	}
	
	
}
