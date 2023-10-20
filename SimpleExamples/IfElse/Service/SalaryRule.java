package IfElse.Service;

public class SalaryRule {

	public double salary(double salary, double increase) {

		double salaryFinal = 0.0;
		
		if (salary <= 1000.0) {

			increase = 0.20;
			salaryFinal = salary + (salary * increase);
			return salaryFinal;

		} else if (salary > 1000.0 && salary < 2000.0) {

			increase = 0.10;
			salaryFinal = salary + (salary * increase);
			return salaryFinal;

		} else if (salary >= 2000.0 && salary < 3000.0) {

			increase = 0.08;
			salaryFinal = salary + (salary * increase);
			return salaryFinal;

		} else if (salary >= 3000.0 && salary < 4000.0) {

			increase = 0.05;
			salaryFinal = salary + (salary * increase);
			return salaryFinal;

		} else if (salary >= 4000.0) {

			increase = 0.04;
			salaryFinal = salary + (salary * increase);
			return salaryFinal;
			
		} else {

			increase = 0.30;
			salaryFinal = salary + (salary * increase);
			return salaryFinal;
		}
	}
}
