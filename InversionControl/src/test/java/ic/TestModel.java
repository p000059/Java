package ic;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.model.Car;
import ic.model.Fuel;
import ic.repositories.IFuelRepository;
import ic.repositories.IcarRepository;

@Service
class TestModel {

	@Autowired
	private IcarRepository icarRepository;
	
	@Autowired
	private IFuelRepository iFuelRepository;

	@Test
	public void test() {

		@SuppressWarnings("static-access")
		Car car = new Car().builder().name("Marea").status(true).build();

		System.out.println("\nName: " + car.getName() + "\nStatus: " + car.getStatus());
	}

	@Test
	public void Insert() {

		@SuppressWarnings("static-access")
		Car objectCar = this.icarRepository.save(new Car().builder().name("Opala").status(true).build());

		System.out.println(objectCar.getName());
	}

	@Test
	public Iterable<Car> read() {

		Iterable<Car> list = icarRepository.findAll();

		for (Car car : list) {

			System.out.println(car.getId());
			System.out.println(car.getName());
			System.out.println(car.getStatus());
		}

		return list;
	}

	@Test
	public void readNameCar() {

		List<Car> list = this.icarRepository.findNameCar("Marea");

		for (Car car : list) {

			System.out.println(car.getId());
			System.out.println(car.getName());
			System.out.println(car.getStatus());
		}
	}

	@Test
	public void readNameCarParam() {

		Car car = this.icarRepository.findNameCarParam("Marea");

		System.out.println(car.getId());
		System.out.println(car.getName());
		System.out.println(car.getStatus());

	}
	
	@Test
	public Fuel insert() {
		
		Fuel objectFuel = new Fuel();
		
		objectFuel.setType("alcool");
		objectFuel.setStatus(true);
		
		Fuel fuel = this.iFuelRepository.saveFuel(objectFuel);
		
		return fuel;
	}
}
