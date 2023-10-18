package sj.designpattern.strategy.models;

import sj.designpattern.strategy.interfaces.Tactic;

public class Offensive implements Tactic {

	@Override
	public String formation() {
		
		String tactic = "4-3-3";
		return tactic;
	}
}
