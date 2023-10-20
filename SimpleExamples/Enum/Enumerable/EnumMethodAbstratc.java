package Enum.Enumerable;

public enum EnumMethodAbstratc {

    CAR(1, "Car"){
        @Override
        public String geraCategory(){
            return "Light";
        }
    },
    TRUCK(2, "Truck"){
        @Override
        public String geraCategory(){
            return "Heavy";
        }
    },
    BUS(3, "Bus"){
        @Override
        public String geraCategory(){
            return "Heavy to Passengers";
        }
    },
    BIKE(4, "Bike"){
        @Override
        public String geraCategory(){
            return "Light";
        }
    };

    private int codVehicle;
    private String descriptionVehicle;
    
    EnumMethodAbstratc(int codVehicle, String descriptionVehicle) {
        this.codVehicle = codVehicle;
        this.descriptionVehicle = descriptionVehicle;
    }

    public int getCodVehicle() {
        return codVehicle;
    }

    public String getDescriptionVehicle() {
        return descriptionVehicle;
    }
    
    public abstract String geraCategory();
}
