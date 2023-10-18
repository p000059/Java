package ic.interfaces.service;

import java.util.List;

import ic.model.entity.Tax;

public interface ItaxService {

	/**
	 * Save a Tax object.
	 *
	 * @param tax must not be {@literal null}.
	 * @param status must not be {@literal null}.
	 * @return the Tax object registered.
	 * @throws {@link TaxNull} if tax and status is null.
	 */
	Tax insert(Tax car);
	
	/**
	 * List Tax object.
	 *
	 * @param type must not be {@literal null}.
	 * @return a List Tax object registered.
	 * @throws {@link TaxNull} if type is null.
	 */
	Iterable<Tax> getTaxByType(String type);
	
	/**
	 * List Tax object.
	 * @return a List Tax object registered.
	 * @throws list null.
	 */
	List<Tax> listTax();
	
	/**
	 * Update Tax object.
	 *
	 * @param tax must not be {@literal null}.
	 * @return a tax object updated.
	 * @throws {@link TaxNull} if tax is null.
	 */
	Tax updateTax(Tax tax);
	
	/**
	 * Delete Tax object.
	 *
	 * @param tax must not be {@literal null}.
	 * @return confirmation message.
	 * @throws {@link TaxNull} if tax is null.
	 */
	Tax deleteTax(Tax tax);
	
	/**
	 * Delete Tax object.
	 *
	 * @param tax must not be {@literal null}.
	 * @return confirmation message in object.
	 * @throws {@link TaxNull} if tax is null.
	 */
	Tax deleteTaxType(String type);
}
