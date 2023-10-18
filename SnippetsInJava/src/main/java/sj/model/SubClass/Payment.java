package sj.model.SubClass;

import sj.model.ClassSuper.Common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@Table(name = "payment")
@Entity
public class Payment extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "price")
	private Price price;
	
	@Column(name = "value")
	private Double value;
	
	@Column(name = "interest")
	private Double interest;
	
	@Column(name = "discount")
	private Double discount;
	
	public Double returnsDiscountedValue(Double valueProduct, Double discount) {

		return valueProduct - (valueProduct * (discount / 100));
	}

	public Double returnsValueOfInstallments(Double valueProduct, Double quantityInstallments, Double interest) {

		Double valueInstallments = (valueProduct / quantityInstallments);
		Double valueInterest = (valueInstallments * (interest / 100));

		return valueInstallments + valueInterest;
	}
}
