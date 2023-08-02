package DesignPattern.Strategy.Class;

import DesignPattern.Strategy.Interface.Tactic;

public class Defensive implements Tactic{

	@Override
	public String formation() {
		
		String tactic = "4-4-2";
		return tactic;
	}

	
}
