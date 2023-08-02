package IfElse.Class;

import java.util.Objects;

public class Salary {

	private double salary;

	public Salary() {
		super();
	}

	public Salary(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salary other = (Salary) obj;
		return Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
}
