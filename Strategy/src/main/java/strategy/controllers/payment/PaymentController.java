package strategy.controllers.payment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import strategy.models.subclass.PaymentInstance.CreditPaymentInstance;
import strategy.models.subclass.PaymentValue.CashPayment;
import strategy.services.PaymentContext.Buy;
import strategy.services.PaymentContext.BuyInstance;

@RequestMapping(value = "/api")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class PaymentController<T> {

	@GetMapping(value = "/read")
	public ResponseEntity<Object> returnPayment() {

		Double values = 10.0;
		Buy buy = new Buy(values);

		String result = buy.processBuy(new CashPayment());

		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	@PostMapping(value = "/create")
	public ResponseEntity<Object> returnPayment(@RequestBody Double values) {

		Buy buy = new Buy(values);

		String result = buy.processBuy(new CashPayment());

		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	@GetMapping(value = "/readInstance")
	public ResponseEntity<Object> returnPaymentInstance() {

		BuyInstance buyInstance = BuyInstance.builder().quantity(18).value(15.6).build();

		BuyInstance result = buyInstance.processBuy(new CreditPaymentInstance());

		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	@PostMapping(value = "/createInstance")
	public ResponseEntity<Object> createPayment(@RequestBody BuyInstance buyInstance) {

		BuyInstance result = buyInstance.processBuy(new CreditPaymentInstance());

		return ResponseEntity.status(HttpStatus.OK).body(result.getValue());
	}
}
