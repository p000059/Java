package sj.ifelse.services;

import org.springframework.stereotype.Service;

import sj.ifelse.enums.GenderEnumerator;

@Service
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
