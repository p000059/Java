package IfElse.Service;

import IfElse.Enumerator.GenderEnumerator;

public class GenderService {

	public String readGender(int number) {
		
		if(GenderEnumerator.MALE.getValue() == number){
			
			return "Male";
			
		} else if (GenderEnumerator.FEMALE.getValue() == number){
			
			return "Female"; 
			
		} else if (GenderEnumerator.INVALID.getValue() == number) {
			
			return "other";
			
		} else {
			
			return "uninformed";
		}
	}
}
