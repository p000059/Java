package strategy.models.subclass.PaymentValue;

import strategy.interfaces.ValueStrategy.PaymentStrategy;

public class CashPayment implements PaymentStrategy {

	@Override
	public String payment(Double value) {

		return "Cash Payment: " + value ;
	}

}

//Concrete Strategy 
