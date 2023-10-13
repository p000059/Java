package ic.model.entity;

import ic.interfaces.Ideduction;

public class MGdeduction implements Ideduction {

	@Override
	public Double deduction(Double tax) {
		
		return tax * 0.02;
	}

}
