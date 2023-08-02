package POO.App;
//Programs that shows how a fuel pump works.

import javax.swing.JOptionPane;

public class FuelPump {

	private String typeFuel;
	private Float valueLiter;
	private Float pumpResevoir;
			
	public FuelPump() {
		super();
	}

	public FuelPump(String typeFuel, Float valueLiter, Float pumpResevoir) {
		super();
		this.typeFuel = typeFuel;
		this.valueLiter = valueLiter;
		this.pumpResevoir = pumpResevoir;
	}

	public String getTypeFuel() {
		return typeFuel;
	}

	public void setTypeFuel(String typeFuel) {
		this.typeFuel = typeFuel;
	}

	public Float getValueLiter() {
		return valueLiter;
	}

	public void setValueLiter(Float valueLiter) {
		this.valueLiter = valueLiter;
	}

	public Float getAmountFuel() {
		return pumpResevoir;
	}

	public void setAmountFuel(Float amountFuel) {
		this.pumpResevoir = amountFuel;
	}

	public Float suplyCash(Float money) {
		
		Float liters = money / this.valueLiter;
		
		return liters; //Return total liters.
	}
	
	public Float toFuelLiter(Float liter) {
		
		Float money = this.valueLiter * liter;
		
		return money; //Return the total purchase amount.
	}
	
	public void changePrice(Float priceLiter) {
		
		setValueLiter(priceLiter);
	}
	
	public void changeFuel(String Fuel) {
		
		setTypeFuel(Fuel);
	}
	
	public void changeFuelPump(Float liter) {
		
		setAmountFuel(this.pumpResevoir - liter);
		//It will decrease an amount of fuel in the pump reservoir.
	}
	
	public static void main(String[] args) {
		
		FuelPump fuelPump = new FuelPump("Gasoline",4.9F,1000.0F);

		Float fuelReservoir = fuelPump.getAmountFuel();
		
		Float money = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor: "));		
		Float literOut = fuelPump.suplyCash(money);
		fuelPump.changeFuelPump(literOut);
		
		JOptionPane.showMessageDialog(null, 
				"Valor a pagar: " + money
				+ "\nTotal de litros: " + literOut
				+ "\nCombustível: " + fuelPump.getTypeFuel()
				+ "\n\n\nReservatório antes do abastecimento: " + fuelReservoir
				+ "\nReservatório depois do abastecimento: " + fuelPump.getAmountFuel()
		);
		
		Float liter = Float.parseFloat(JOptionPane.showInputDialog("Digite o total de litros: "));
		Float moneyIn = fuelPump.toFuelLiter(liter);
		fuelPump.changeFuelPump(liter);
		
		JOptionPane.showMessageDialog(null, 
				"Valor a pagar: " + moneyIn
				+ "\nTotal de litros: " + liter
				+ "\nCombustível: " + fuelPump.getTypeFuel()
				+ "\n\n\nReservatório antes do abastecimento: " + fuelReservoir
				+ "\nReservatório depois do abastecimento: " + fuelPump.getAmountFuel()
		);
		
	}
}

