package strategy.models.subclass.PaymentInstance;

import strategy.interfaces.InstancesStrategy.PaymentStrategyInstance;
import strategy.services.PaymentContext.BuyInstance;

public class CashPaymentInstance implements PaymentStrategyInstance {

	@Override
	public BuyInstance payment(BuyInstance buyInstance) {
		
		return buyInstance;
	}	
}
