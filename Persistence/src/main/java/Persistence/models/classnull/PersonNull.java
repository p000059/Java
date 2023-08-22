package Persistence.models.classnull;

import Persistence.models.entities.Person;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PersonNull extends Person {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String getName() {
		
		return "person already registered or non-existent, check data";
	}
	
	@Override
	public Boolean getStatus() {
		
		return false;
	}
}
