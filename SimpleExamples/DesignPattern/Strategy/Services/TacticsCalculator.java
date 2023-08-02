package DesignPattern.Strategy.Services;

import DesignPattern.Strategy.Interface.Tactic;

public class TacticsCalculator {

	public String calculator(Tactic tactic) {
		
		return tactic.formation();
	}
}
