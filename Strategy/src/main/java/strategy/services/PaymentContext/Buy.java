package strategy.services.PaymentContext;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import strategy.interfaces.ValueStrategy.PaymentStrategy;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Buy {

	@Column(name = "value")
	private Double value;
	
	public String processBuy(PaymentStrategy paymentStrategy) {
		
		return paymentStrategy.payment(value);
	}
}

//Context
