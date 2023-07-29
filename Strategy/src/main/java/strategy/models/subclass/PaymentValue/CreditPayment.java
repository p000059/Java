package strategy.models.subclass.PaymentValue;

import strategy.interfaces.ValueStrategy.PaymentStrategy;

public class CreditPayment implements PaymentStrategy {

	@Override
	public String payment(Double value) {
		
		return "Credit Payment: " + value;
	}

}

//Concrete Strategy
