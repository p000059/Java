package ic;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.model.Car;
import ic.repositories.IcarRepository;
import ic.service.CarService;
import ic.service.interfaces.IcarService;

@Service
class TestModel {

	@Autowired
	private IcarService icarService;

	private CarService carService;

	@Autowired
	private IcarRepository icarRepository;

	@Before
	public void setUp() {

		this.icarService = new CarService();
	}

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
}
