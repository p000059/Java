package DesignPattern.Strategy.Class;

import DesignPattern.Strategy.Interface.Tactic;

public class HighDefensive implements Tactic {

	@Override
	public String formation() {
		String tactic = "5-4-1";
		return tactic;
	}
}
