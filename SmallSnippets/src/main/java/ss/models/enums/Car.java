package ss.models.enums;

public enum Car {

	CAR(1, "Car") {
		
		@Override
		public String generateCategory() {
			return "Light";
		}
	},
	
	TRUCK(2, "Truck") {
		
		@Override
		public String generateCategory() {
			return "Heavy";
		}
	},
	
	BUS(3, "Bus") {
		
		@Override
		public String generateCategory() {
			return "Heavy to Passengers";
		}
	},
	
	BIKE(4, "Bike") {
		
		@Override
		public String generateCategory() {
			return "Light";
		}
	};

	private int codVehicle;
	private String descriptionVehicle;

	Car(int codVehicle, String descriptionVehicle) {
		
		this.codVehicle = codVehicle;
		this.descriptionVehicle = descriptionVehicle;
	}

	public int getCodVehicle() {
		
		return codVehicle;
	}

	public String getDescriptionVehicle() {
		
		return descriptionVehicle;
	}

	public abstract String generateCategory();
}
