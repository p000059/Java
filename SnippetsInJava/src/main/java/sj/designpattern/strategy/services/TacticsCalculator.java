package sj.designpattern.strategy.services;

import sj.designpattern.strategy.interfaces.Tactic;

public class TacticsCalculator {

	public String calculator(Tactic tactic) {
		
		return tactic.formation();
	}
}
