package ic.model;

import ic.interfaces.Ideduction;

public class SPdeduction implements Ideduction {

	@Override
	public Double deduction(Double tax) {
		
		return tax * 0.05;
	}

}
