package Class.SubClass;
public class Elevator {

	private Integer currentFloor;
	private Integer totalBuildingFloors;
	private Integer totalElevatorCapacity;
	private Integer currentNumberOfPeople;
	
	public Elevator() {
		super();
	}
		
	public Elevator(Integer currentFloor, Integer totalBuildingFloors, Integer totalElevatorCapacity,
			Integer currentNumberOfPeople) {
		super();
		this.currentFloor = currentFloor;
		this.totalBuildingFloors = totalBuildingFloors;
		this.totalElevatorCapacity = totalElevatorCapacity;
		this.currentNumberOfPeople = currentNumberOfPeople;
	}

	public Integer getCurrentFloor() {
		return currentFloor;
	}
	
	public void setCurrentFloor(Integer currentFloor) {
		this.currentFloor = currentFloor;
	}
	
	public Integer getTotalBuildingFloors() {
		return totalBuildingFloors;
	}
	
	public void setTotalBuildingFloors(Integer totalBuildingFloors) {
		this.totalBuildingFloors = totalBuildingFloors;
	}
	
	public Integer getTotalElevatorCapacity() {
		return totalElevatorCapacity;
	}
	
	public void setTotalElevatorCapacity(Integer totalElevatorCapacity) {
		this.totalElevatorCapacity = totalElevatorCapacity;
	}
	
	public Integer getcurrentNumberOfPeople() {
		return this.currentNumberOfPeople;
	}
	
	public void setCurrentNumberOfPeople(Integer currentNumberOfPeople) {
		this.currentNumberOfPeople = currentNumberOfPeople;
	}
	
	public void initializes(Integer totalCapacity, Integer totalFloors) {
	
		setCurrentFloor(0);
		setCurrentNumberOfPeople(0);
		setTotalElevatorCapacity(totalCapacity);
		setTotalBuildingFloors(totalFloors);
		
	}
	
	public void enterElevator(Integer quantityPerson) {
		
		if(getTotalElevatorCapacity() > getcurrentNumberOfPeople() && getTotalElevatorCapacity() > quantityPerson) {
			
			setCurrentNumberOfPeople(getTotalElevatorCapacity() + quantityPerson);
		}
	}
	
	public void getOffElevator(Integer quantityPerson) {
		
		if(getcurrentNumberOfPeople() != 0 && getcurrentNumberOfPeople() >= quantityPerson) {
			
			setCurrentNumberOfPeople(getcurrentNumberOfPeople() - quantityPerson); 
		}
	}
	
	public void rideUp(Integer requestedFloor) {
		
		if(getTotalBuildingFloors() > requestedFloor) {
			
			setCurrentFloor(requestedFloor);
		}
	}
	
	public void comeDown(Integer requestedFloor) {
		
		if(getCurrentFloor() > requestedFloor) {
			
			setCurrentFloor(requestedFloor);
		}
	}
	
	public static void main(String[] args) {
		
		Elevator elevator = new Elevator();
		
		elevator.initializes(20, 50);
		
		elevator.enterElevator(12);
		elevator.rideUp(8);
		
		
	}
}

