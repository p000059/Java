package IfElse.Service;

public class AgeService {

	public String assessAge(Integer age) {
		
		if(age >= 18){
			
			return "Adult, Major"; 
			
		} else if(age <= 12){
			
			return "Child";
			
		} else if(age >= 13 && age <=17) {
			
			return "Teen";
			
		} else if(age > 65) {
			
			return "Elderly";
			
		} else {
			
			return "Age Invalid!";
		}
	}
}
