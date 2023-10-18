package sj.model.SubClass;

import sj.model.ClassSuper.Common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
@Table(name = "elevator")
@Entity
public class Elevator extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "current_floor")
	private Integer currentFloor;
	
	@Column(name = "total_building_floors")
	private Integer totalBuildingFloors;
	
	@Column(name = "total_elevator_capacity")
	private Integer totalElevatorCapacity;
	
	@Column(name = "current_number_of_people")
	private Integer currentNumberOfPeople;
		
	public void initializes(Integer totalCapacity, Integer totalFloors) {
	
		setCurrentFloor(0);
		setCurrentNumberOfPeople(0);
		setTotalElevatorCapacity(totalCapacity);
		setTotalBuildingFloors(totalFloors);
		
	}
	
	public void enterElevator(Integer quantityPerson) {
		
		if(getTotalElevatorCapacity() > getCurrentNumberOfPeople() && getTotalElevatorCapacity() > quantityPerson) {
			
			setCurrentNumberOfPeople(getTotalElevatorCapacity() + quantityPerson);
		}
	}
	
	public void getOffElevator(Integer quantityPerson) {
		
		if(getCurrentNumberOfPeople() != 0 && getCurrentNumberOfPeople() >= quantityPerson) {
			
			setCurrentNumberOfPeople(getCurrentNumberOfPeople() - quantityPerson); 
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

