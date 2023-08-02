package IfElse.Enumerator;

public enum GenderEnumerator {

	MALE(1), FEMALE(2), INVALID(3);
	
    private int valueGender;

    GenderEnumerator(int valueGender){
        this.valueGender = valueGender;
    }

    public int getValue(){
        return this.valueGender;
    }
}
