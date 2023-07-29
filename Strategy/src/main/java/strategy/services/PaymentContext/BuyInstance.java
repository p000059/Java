package strategy.services.PaymentContext;

import jakarta.persistence.Column;
import strategy.interfaces.ContextStrategy.PaymentContext;
import strategy.interfaces.InstancesStrategy.PaymentStrategyInstance;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BuyInstance implements PaymentContext {

	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "value")
	private Double value;
	
	public BuyInstance processBuy(PaymentStrategyInstance paymentStrategyInstance) {
		
		return paymentStrategyInstance.payment(this);
	}
}

//Context
