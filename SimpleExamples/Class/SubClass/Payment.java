package Class.SubClass;

import Class.ClassSuper.Common;

public class Payment extends Common {


	private Price price;
	private Double value;
	private Double interest;
	private Double discount;

	public Payment() {
	}
	
	public Payment(Price price, Double value, Double interest, Double discount) {
		super();
		this.price = price;
		this.value = value;
		this.interest = interest;
		this.discount = discount;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double returnsDiscountedValue(Double valueProduct, Double discount) {

		return valueProduct - (valueProduct * (discount / 100));// Returns discounted value.
	}

	public Double returnsValueOfInstallments(Double valueProduct, Double quantityInstallments, Double interest) {

		Double valueInstallments = (valueProduct / quantityInstallments);
		Double valueInterest = (valueInstallments * (interest / 100));

		return valueInstallments + valueInterest;
	}
}
