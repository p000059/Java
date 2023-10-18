package sj.designpattern.strategy.models;

import sj.designpattern.strategy.interfaces.Tactic;

public class HighDefensive implements Tactic {

	@Override
	public String formation() {
		String tactic = "5-4-1";
		return tactic;
	}
}
