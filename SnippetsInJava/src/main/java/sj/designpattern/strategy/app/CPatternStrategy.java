package sj.designpattern.strategy.app;
import javax.swing.JOptionPane;

import sj.designpattern.strategy.models.HighDefensive;
import sj.designpattern.strategy.services.TacticsCalculator;

public class CPatternStrategy {

	public static void main(String[] args) {
		
		String tactic = new TacticsCalculator().calculator(new HighDefensive());
		
		JOptionPane.showMessageDialog(null, "Tática: " + tactic);
	}

}
