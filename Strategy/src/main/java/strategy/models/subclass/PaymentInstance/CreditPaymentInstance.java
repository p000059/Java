package strategy.models.subclass.PaymentInstance;

import strategy.interfaces.InstancesStrategy.PaymentStrategyInstance;
import strategy.services.PaymentContext.BuyInstance;

public class CreditPaymentInstance implements PaymentStrategyInstance {

	@Override
	public BuyInstance payment(BuyInstance buyInstance) {
		
		return buyInstance;
	}

}
