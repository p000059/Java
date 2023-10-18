package sj.designpattern.strategy.models;

import sj.designpattern.strategy.interfaces.Tactic;

public class Defensive implements Tactic{

	@Override
	public String formation() {
		
		String tactic = "4-4-2";
		return tactic;
	}

	
}
