package DesignPattern.Strategy.App;
import javax.swing.JOptionPane;

import DesignPattern.Strategy.Class.HighDefensive;
import DesignPattern.Strategy.Services.TacticsCalculator;

public class CPatternStrategy {

	public static void main(String[] args) {
		
		String tactic = new TacticsCalculator().calculator(new HighDefensive());
		
		JOptionPane.showMessageDialog(null, "Tática: " + tactic);
	}

}
