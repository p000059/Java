package strategy.interfaces.InstancesStrategy;

import strategy.services.PaymentContext.BuyInstance;

public interface PaymentStrategyInstance {

	BuyInstance payment(BuyInstance buyInstance);
}

//Abstract Strategy
