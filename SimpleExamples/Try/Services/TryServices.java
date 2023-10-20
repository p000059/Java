package Try.Services;

import java.util.List;

import Try.Class.PersonTry;
import Try.ExceptionsClass.BusinessException;

public class TryServices {

	public boolean create(List<PersonTry> lstPersonTry, PersonTry personTry) {

		boolean nameInUse = lstPersonTry.stream().anyMatch(name -> name.equals(personTry));
		boolean emailInUse = lstPersonTry.stream().anyMatch(email -> email.equals(personTry));

		if ((emailInUse) == true) {

			throw new BusinessException(personTry.getEmail() + " in use.");
		}

		if ((nameInUse) == true) {

			throw new BusinessException(personTry.getName() + " in use.");
		}
		
		return true;
	}
}
