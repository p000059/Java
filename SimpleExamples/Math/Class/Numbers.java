package Math.Class;

import java.util.Objects;

public class Numbers {

	private Integer number;

	public Numbers(Integer number) {
		
		this.number = number;
	}

	public Numbers() {
		super();
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numbers other = (Numbers) obj;
		return Objects.equals(number, other.number);
	}
}
